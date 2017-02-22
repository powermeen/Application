package web.common.util;

import web.shared.DisplayResponseBean;

public class NotificationUtil {

	public static DisplayResponseBean displaySuccess(String message ){
		DisplayResponseBean displayResponseBean = new DisplayResponseBean();
		displayResponseBean.setCss("alert alert-success");
		displayResponseBean.setStatus("Success !");
		displayResponseBean.setMessage(message);
		
		return displayResponseBean;
		
	}
	
	public static DisplayResponseBean displayWarning(String message ){
		DisplayResponseBean displayResponseBean = new DisplayResponseBean();
		displayResponseBean.setCss("alert alert-warning");
		displayResponseBean.setStatus("Warning !");
		displayResponseBean.setMessage(message);
		
		return displayResponseBean;
		
	}
	
	public static DisplayResponseBean displayError(String message ){
		DisplayResponseBean displayResponseBean = new DisplayResponseBean();
		displayResponseBean.setCss("alert alert-danger");
		displayResponseBean.setStatus("Error !");
		displayResponseBean.setMessage(message);
		
		return displayResponseBean;
		
	}
}
