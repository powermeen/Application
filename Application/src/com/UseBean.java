package com;

public class UseBean {

	public static void main(String[] args) {
		UserBean userBeanCaseA = new UserBean();
		userBeanCaseA.setId("0001");
		userBeanCaseA.setUserName("user0001");
		userBeanCaseA.setPassword("password0001");
		
		UserBean userBeanCaseB = new UserBean();
		userBeanCaseB.setId("0002");
		userBeanCaseB.setUserName("user0002");
		
		String dataA = printData(userBeanCaseA);
		System.out.println(dataA);
		
		String dataB = printData(userBeanCaseB);
		System.out.println(dataB);
	}
	public static String newline = System.getProperty("line.separator");
	private static String printData(UserBean userBean) {
		String id = userBean.getId();
		String usernae = userBean.getUserName();
		String password = userBean.getPassword();
		
		String printData ="";
		
		if(id != null && !id.isEmpty()){
			printData = printData + "Your ID :"+id + newline;
		}
		if(usernae != null && !usernae.isEmpty()){
			printData = printData + "Your UserName  :"+usernae + newline;
		}
		if(password != null && !password.isEmpty()){
			printData = printData + "Your Password  :"+password + newline;
		}
		return printData;
	}

	public static class UserBean{
		private String id;
		private String userName;
		private String password;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
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
		
	}
	

}

