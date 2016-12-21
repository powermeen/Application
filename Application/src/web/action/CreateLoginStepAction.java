package web.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.support.PagedListHolder;
import org.springframework.web.servlet.ModelAndView;

import web.common.interfaces.SetupModelAndView;
import web.comstant.PageRegister;
import web.shared.SetupBean;

public class CreateLoginStepAction implements SetupModelAndView{

	private ModelAndView modelAndView = new ModelAndView();
	
	public CreateLoginStepAction() {
		
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
		List<SetupBean> setupBeans = new ArrayList<>();

		for (int index = 0; index < 50; index++) {
			
			SetupBean bean = new SetupBean();
			bean.setSetupId("id_"+index);
			bean.setModule("module_"+index);
			bean.setWidgetId("widget_id_"+index);
			bean.setNameWidget("nameWidget_"+index);
			bean.setData("data_"+index);
			bean.setActionType("actionType_"+index);
			bean.setReference("reference_"+index);
			bean.setStatus("status_"+index);
			
			setupBeans.add(bean);
		}
		List<List<SetupBean>> list = new ArrayList<>();
		for (int index = 0; index < setupBeans.size(); index++) {
			List<SetupBean> beans = new ArrayList<>();
			
			if(beans.size()<10){
				
			}
		}
		PagedListHolder<SetupBean> pagedListHolder = new PagedListHolder<>(setupBeans);
		
		modelAndView.addObject("reportBeans", setupBeans);
		modelAndView.addObject("pagedListHolder", pagedListHolder);

	}
}
