package web.comstant;

public enum PageRegister {

	INDEX("index","index"),
	LOGIN("login", "Login"),
	LOGIN_VIEW_SETUP("LoginViewSetup","/setup/LoginViewSetup"),
	CREATE_LOGIN_STEP("CreateLoginStep","/setup/CreateLoginStep"),
	CREATE_GROUP("CreateGroup","/setup/CreateGroup"),
	DATA_TABLE("DataTable","/setup/DataTable"),
	ACTIVE_GROUP("ActiveGroup","/setup/ActiveGroup"),
	RUN_TEST_CASE("RunTestCase","/process/RunTestCase"),
	CREATE_WIDGETS_COLLECTION("CreateWidgetsCollection","/setup/CreateWidgetsCollection");

	private String key;
	

	private String path;

	PageRegister(String key, String path) {
		this.key = key;
		this.path = path;
	}
	public String getKey() {
		return key;
	}

	public String getPath() {
		return path;
	}

}
