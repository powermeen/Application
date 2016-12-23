package web.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.support.PagedListHolder;
import org.springframework.web.servlet.ModelAndView;

import web.common.interfaces.SetupModelAndView;
import web.common.util.StringUtils;
import web.comstant.Action;
import web.comstant.PageRegister;
import web.dao.service.CreateLoginStepService;
import web.shared.CreateLoginStepBean;
import web.shared.GroupBean;
import web.shared.SetupBean;

public class CreateLoginStepAction implements SetupModelAndView {

	private ModelAndView modelAndView = new ModelAndView();

	private SetupBean setupBean = new SetupBean();

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

//		setupTableData();
		setupActionListData();
		setupGroupReference();

	}
	@Override
	public void action() {
		String direction = setupBean.getDirection();
		boolean isCheck = StringUtils.isNotNullAndEmpty(direction);
		if(isCheck){
			
			switch (direction) {
			case Action.SEARCH:
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
		actionTypes.put(Action.BUTTON, Action.BUTTON);
		actionTypes.put(Action.TEXTBOX, Action.TEXTBOX);
		actionTypes.put(Action.SELECT, Action.SELECT);

		modelAndView.addObject("actionTypes", actionTypes);

	}
	
	private void setupGroupReference() {
		List<GroupBean> groupBeans = new ArrayList<>();
		groupBeans = createLoginStepService.getGroupReference();
		
		modelAndView.addObject("groupBeans", groupBeans);
		
	}

	

}
