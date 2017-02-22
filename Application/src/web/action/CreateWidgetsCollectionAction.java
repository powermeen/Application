package web.action;

import org.springframework.web.servlet.ModelAndView;

import web.common.interfaces.SetupModelAndView;
import web.comstant.PageRegister;
import web.shared.WidgetsCollectionBean;

public class CreateWidgetsCollectionAction implements SetupModelAndView {

	private ModelAndView modelAndView = new ModelAndView();
	
	private WidgetsCollectionBean collectionBean;
	
	public CreateWidgetsCollectionAction(WidgetsCollectionBean collectionBean) {
		this.collectionBean  =collectionBean;
		setupPage();
		setupData();
		
	}

	@Override
	public ModelAndView getSetupModelAndView() {
		return modelAndView;
	}

	@Override
	public void setupPage() {
		
		String viewName = PageRegister.CREATE_WIDGETS_COLLECTION.getPath();
		modelAndView.setViewName(viewName);
		
	}

	@Override
	public void setupData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}

}
