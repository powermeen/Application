package web.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import web.common.interfaces.SetupModelAndView;
import web.dao.service.AssistToolService;

public class AssistToolAction implements SetupModelAndView{

	private ModelAndView modelAndView = new ModelAndView();
	
	private AssistToolService assistToolService = new AssistToolService();
	
	public AssistToolAction() {
		setupPage();
		setupData();
	}
	@Override
	public ModelAndView getSetupModelAndView() {
		return modelAndView;
	}

	@Override
	public void setupPage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setupData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}
	public List<String> getNewFileNumber() {
		List<String> lastFileNumber  = new ArrayList<>();
		
		lastFileNumber.add("MEEN7777847");
		return lastFileNumber;
	}
	public List<String> generateFileNumber() {
		List<String> filenumbers  = new ArrayList<>();
		String fileNumber = assistToolService.generateFileNumber();
		filenumbers.add(fileNumber);
		return filenumbers;
	}

}
