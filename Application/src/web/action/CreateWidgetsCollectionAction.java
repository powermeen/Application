package web.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.servlet.ModelAndView;

import web.common.interfaces.SetupModelAndView;
import web.common.list.ListBoxData;
import web.common.util.StringUtils;
import web.comstant.Action;
import web.comstant.PageRegister;
import web.dao.service.WidgetsCollectionService;
import web.shared.GroupBean;
import web.shared.WidgetsCollectionBean;

public class CreateWidgetsCollectionAction implements SetupModelAndView {

	private ModelAndView modelAndView = new ModelAndView();
	
	private WidgetsCollectionBean collectionBean;
	
	private ListBoxData listBoxData = new ListBoxData();
	
	private WidgetsCollectionService collectionService = new WidgetsCollectionService();
	
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
		setupTableData();
		setupGroupListData();
		
	}

	

	@Override
	public void action() {
		String direction = collectionBean.getDirection();
		boolean isCheck = StringUtils.isNotNullAndEmpty(direction);
		if (isCheck) {

			switch (direction) {
			case Action.SEARCH:
				setupTableData();

				break;
			case Action.INSERT:
				addWidgetId();
//				setupTableData();
//				resetModel();
//				break;

			case Action.UPDATE:
//				updateGroup();
//				setupTableData();
//				resetModel();
				break;

			case Action.DELETE:
//				deleteGroup();
//				setupTableData();
//				resetModel();
				break;

			default:
				break;
			}
		}

		
	}
	
	private void addWidgetId() {
		// TODO Auto-generated method stub
		
	}

	private void setupGroupListData() {
		ListBoxData data = new ListBoxData();

		Map<String, String> modules = data.getModule();

		modelAndView.addObject("modules", modules);

	}
	
	private void setupTableData() {
		List<WidgetsCollectionBean> widgetsCollectionBeans = new ArrayList<>();

		String module = collectionBean.getModule();
		
		boolean checked = StringUtils.isNotNullAndEmpty(module);
		
		if(checked){
			widgetsCollectionBeans = collectionService.getWidgetsCollectionByModule(module);
		}
		
		modelAndView.addObject("widgetsCollectionBeans", widgetsCollectionBeans);
		
	}

}
