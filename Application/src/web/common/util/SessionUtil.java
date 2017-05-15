package web.common.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;





public class SessionUtil {

	public static String LOGIN_SESSION = "loginSession";
	
	public static String USER = "user";
	
	public static String ADMIN = "admin";
	
	public  static HttpSession createSessionByPermission(String permission ){
		HttpSession httpSession = SessionUtil.getSession();
		
		if(USER.equalsIgnoreCase(permission)){
			httpSession.setAttribute(LOGIN_SESSION, USER);
		}else if (ADMIN.equalsIgnoreCase(permission)) {
			httpSession.setAttribute(LOGIN_SESSION, ADMIN);
		}
		
		return httpSession; 
		
	}
	public static HttpSession getSession() {
		
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder
				.currentRequestAttributes();
		HttpSession httpSession = attributes.getRequest().getSession(true);

		return httpSession;
	}
	
	public static boolean isValidSession(HttpSession httpSession){

		boolean isHttp = httpSession!=null;
		boolean isHttpId = httpSession.getId()!=null;
		boolean isHttpAttributes = httpSession.getAttribute(LOGIN_SESSION) !=null ;
		
		if(isHttp && isHttpId && isHttpAttributes){
			return true;
		}
		return false;
	}
}
