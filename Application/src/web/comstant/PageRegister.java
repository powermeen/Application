package web.comstant;

public enum PageRegister {

	INDEX("index","index"),
	LOGIN("login", "Login"),
	DEMO_COLUMN("DemoColumn", "DemoColumn"),
	TOTAL_SALES_REPORT("totalSalesReport","TotalSalesReport"),
	SITE_SALES_REPORT("SiteSalesReport","SiteSalesReport"),
	TEST_MAPPING_DATA("TestMappingData","TestMappingData");

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
