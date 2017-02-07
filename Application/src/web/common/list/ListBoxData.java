package web.common.list;

import java.util.HashMap;
import java.util.Map;

import web.comstant.Action;
import web.comstant.Module;

public class ListBoxData {
	
	

	public Map<String , String > getActionType(){
		Map<String, String> actionTypes = new HashMap<>();
		
		actionTypes.put(Action.BUTTON, Action.BUTTON);
		actionTypes.put(Action.TEXTBOX, Action.TEXTBOX);
		actionTypes.put(Action.SELECT, Action.SELECT);
		
		return actionTypes;
		
	}
	
	public Map<String , String > getModule(){
		
		Map<String, String> modules = new HashMap<>();
		modules.put(Module.LOGIN, Module.LOGIN);
		modules.put(Module.OCEAN, Module.OCEAN);
		modules.put(Module.AIR, Module.AIR);
		modules.put(Module.ADMIN, Module.ADMIN);
		
		return modules;
		
	}

	public Map<String, String> getWidgetsId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
