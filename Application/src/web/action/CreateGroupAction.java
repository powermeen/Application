package web.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import web.common.interfaces.SetupModelAndView;
import web.common.list.ListBoxData;
import web.common.util.NotificationUtil;
import web.common.util.StringUtils;
import web.comstant.Action;
import web.comstant.PageRegister;
import web.dao.service.CreateGroupServive;
import web.shared.DisplayResponseBean;
import web.shared.GroupBean;
import web.shared.SetupBean;

public class CreateGroupAction implements SetupModelAndView {

	private ModelAndView modelAndView = new ModelAndView();

	private GroupBean groupBean;

	private CreateGroupServive createGroupServive = new CreateGroupServive();

	public CreateGroupAction(GroupBean groupBean) {
		this.groupBean = groupBean;
		setupData();
		setupPage();
	}

	@Override
	public ModelAndView getSetupModelAndView() {

		return modelAndView;
	}

	@Override
	public void setupPage() {

		String viewName = PageRegister.CREATE_GROUP.getPath();
		modelAndView.setViewName(viewName);

	}

	@Override
	public void setupData() {

		setupTableData();
		setupGroupListData();
		clearForm();

	}

	@Override
	public void action() {
		String direction = groupBean.getDirection();
		boolean isCheck = StringUtils.isNotNullAndEmpty(direction);
		if (isCheck) {

			switch (direction) {
			case Action.SEARCH:
				setupTableData();

				break;
			case Action.INSERT:
				addGroup();
				setupTableData();
				resetModel();
				break;

			case Action.UPDATE:
				updateGroup();
				setupTableData();
				resetModel();
				break;

			case Action.DELETE:
				deleteGroup();
				setupTableData();
				resetModel();
				break;

			default:
				break;
			}
		}

	}

	private void resetModel() {

		groupBean.setId("");
		groupBean.setName("");
		groupBean.setModule("");

	}

	private void clearForm() {

		modelAndView.addObject("errorMessage", "");

	}

	private void setupTableData() {
		List<GroupBean> groupBeans = new ArrayList<>();

		groupBeans = createGroupServive.getAllGroup();
		modelAndView.addObject("groupBeans", groupBeans);

	}

	private void setupGroupListData() {
		ListBoxData data = new ListBoxData();

		Map<String, String> modules = data.getModule();

		modelAndView.addObject("modules", modules);

	}

	private void addGroup() {

		Boolean isExisting = createGroupServive.checkExistingGroupByName(groupBean);

		DisplayResponseBean displayResponseBean;
		if (!isExisting) {
			createGroupServive.addGroup(groupBean);
			String successMessage = "Add New Group Success! ";

			displayResponseBean = NotificationUtil.displaySuccess(successMessage);
		} else {
			String errorMessage = "This Group Name Existing in System Cannot Add more ";

			displayResponseBean = NotificationUtil.displayError(errorMessage);
			
		}
		modelAndView.addObject("displayResponseBean", displayResponseBean);

	}

	private void updateGroup() {

		createGroupServive.updateGroup(groupBean);

	}

	private void deleteGroup() {

		createGroupServive.deleteGroup(groupBean);

	}
}
