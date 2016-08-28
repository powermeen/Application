package web.comstant;

public enum PageRegister {

	INDEX("index","index"),
	LOGIN("login", "Login"),
	DISPLAY_DATA_01("displayData01", "DisplayData01");

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
