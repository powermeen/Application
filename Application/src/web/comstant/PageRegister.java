package web.comstant;

public enum PageRegister {

	INDEX("index","index"),
	LOGIN("login", "Login"),
	DEMO_COLUMN("displayData01", "DemoColumn"),
	TOTAL_SALES_REPORT("totalSalesReport","TotalSalesReport"),
	TOTAL_SALES_REPORT_BY_OFFICE("totalSalesReportByOffice","TotalSalesReportByOffice");

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
