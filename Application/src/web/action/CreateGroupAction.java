package web.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import web.common.interfaces.SetupModelAndView;
import web.common.util.StringUtils;
import web.comstant.Action;
import web.comstant.PageRegister;
import web.dao.service.CreateGroupServive;
import web.shared.GroupBean;
import web.shared.SetupBean;

public class CreateGroupAction implements SetupModelAndView {

	private ModelAndView modelAndView = new ModelAndView();

	private GroupBean groupBean = new GroupBean();

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
				break;

			case Action.UPDATE:
				 updateGroup();
				 setupTableData();
				break;

			case Action.DELETE:
				deleteGroup();
				 setupTableData();
				break;

			default:
				break;
			}
		}

	}

	

	

	private void setupTableData() {
		List<GroupBean> groupBeans = new ArrayList<>();

		groupBeans = createGroupServive.getAllGroup();
		modelAndView.addObject("groupBeans", groupBeans);

	}
	

	private void addGroup() {

		createGroupServive.addGroup(groupBean);

	}
	private void updateGroup() {

		createGroupServive.updateGroup(groupBean);
		
	}

	private void deleteGroup() {

		createGroupServive.deleteGroup(groupBean);
		
	}
}
