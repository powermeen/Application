package web.action;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import web.common.interfaces.SetupModelAndView;
import web.common.util.StringUtils;
import web.comstant.Action;
import web.comstant.PageRegister;
import web.dao.service.ActiveGroupService;
import web.shared.GroupBean;

public class ActiveGroupAction implements SetupModelAndView {

	private ModelAndView modelAndView = new ModelAndView();

	private ActiveGroupService service = new ActiveGroupService();

	private GroupBean groupBean;

	public ActiveGroupAction(GroupBean groupBean) {
		this.groupBean = groupBean;
		setupPage();
		setupData();
	}

	@Override
	public ModelAndView getSetupModelAndView() {
		return modelAndView;
	}

	@Override
	public void setupPage() {
		String viewName = PageRegister.ACTIVE_GROUP.getPath();
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
			
			case Action.UPDATE:
				changeStatus();
				 setupTableData();
				break;


			default:
				break;
			}
		}
	}

	

	private void setupTableData() {

		List<GroupBean> groupBeans = service.getAllGroup();

		modelAndView.addObject("groupBeans", groupBeans);
	}
	
	private void changeStatus() {
		String status = groupBean.getStatus();
		if(Action.ACTIVE.equals(status)){
			groupBean.setStatus(Action.IN_ACTIVE);
			service.changeStatus(groupBean);
		
		}else if (Action.IN_ACTIVE.equals(status)) {
			
			groupBean.setStatus(Action.ACTIVE);
			service.changeStatus(groupBean);
		}
			
		
		
	}

}
