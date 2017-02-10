package web.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.support.PagedListHolder;
import org.springframework.web.servlet.ModelAndView;

import web.common.interfaces.SetupModelAndView;
import web.common.list.ListBoxData;
import web.common.util.StringUtils;
import web.comstant.Action;
import web.comstant.Module;
import web.comstant.PageRegister;
import web.dao.service.CreateLoginStepService;
import web.dao.service.ListBoxDataService;
import web.shared.CreateLoginStepBean;
import web.shared.GroupBean;
import web.shared.SetupBean;

public class CreateLoginStepAction implements SetupModelAndView {

	private ModelAndView modelAndView = new ModelAndView();

	private SetupBean setupBean = new SetupBean();
	
	private ListBoxData listBoxData = new ListBoxData();
	
	private CreateLoginStepService createLoginStepService = new CreateLoginStepService();
	
	

	public CreateLoginStepAction(SetupBean setupBean) {
		this.setupBean = setupBean;
		setupPage();
		setupData();
	}

	@Override
	public ModelAndView getSetupModelAndView() {
		return modelAndView;
	}

	@Override
	public void setupPage() {
		String viewName = PageRegister.CREATE_LOGIN_STEP.getPath();
		modelAndView.setViewName(viewName);

	}

	@Override
	public void setupData() {

		// setupTableData();
		setupWidgetsIdListData();
		setupActionListData();
		setupGroupReference();

	}


	@Override
	public void action() {
		String direction = setupBean.getDirection();
		boolean isCheck = StringUtils.isNotNullAndEmpty(direction);
		if (isCheck) {

			switch (direction) {
			case Action.SEARCH:
				setupTableData();

				break;
			case Action.INSERT:
				addLoginStep();
				setupTableData();
				break;

			case Action.UPDATE:
				updateLoginStep();
				setupTableData();
				break;
				
			case Action.DELETE:
				deleteLoginStep();
				setupTableData();
				break;

			default:
				break;
			}
		}

	}

	private void setupTableData() {
		List<SetupBean> setupBeans = new ArrayList<>();

		setupBeans = createLoginStepService.getStepByReference(setupBean);
		modelAndView.addObject("setupBeans", setupBeans);

	}

	private void setupActionListData() {
		Map<String, String> actionTypes = new HashMap<>();
		actionTypes = listBoxData.getActionType();

		modelAndView.addObject("actionTypes", actionTypes);

	}

	private void setupGroupReference() {
		List<GroupBean> groupBeans = new ArrayList<>();
		groupBeans = createLoginStepService.getGroupReference();

		modelAndView.addObject("groupBeans", groupBeans);

	}
	
	private void setupWidgetsIdListData() {

		Map<String, String> widgetsId = new HashMap<>();
		
		widgetsId	= listBoxData.getWidgetsIdByModule(Module.LOGIN);

		modelAndView.addObject("widgetsId", widgetsId);
		
	}

	private void addLoginStep() {
		createLoginStepService.addLoginStep(setupBean);

	}
	
	private void updateLoginStep() {
		createLoginStepService.updateLoginStep(setupBean);
		
	}
	
	private void deleteLoginStep(){
		createLoginStepService.deleteLoginStep(setupBean);
	}


}
