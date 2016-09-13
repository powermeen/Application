package web.shared;

public class UserBean {

	public String USER_ID = "userId";
	public String USER_NAME = "userName";
	public String PASSWORD = "password";
	public String USER_ROLE = "userRole";
	
	private String userId;
	private String userName;
	private String password;
	private String userRole;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
}
