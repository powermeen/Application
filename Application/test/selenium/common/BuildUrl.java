package selenium.common;

import selenium.common.constant.SeleniumConstant;

public class BuildUrl {
	
	private String baseURL =null;

	public BuildUrl(String option) {
		
		if(SeleniumConstant.OPTION_LOCAL.equalsIgnoreCase(option)){
			baseURL = SeleniumConstant.LOCAL_URL;
		}else if (SeleniumConstant.OPTION_PRODUCTION.equalsIgnoreCase(option)) {
			//TODO add production URL
			baseURL ="";
		}
		
	}

	public String getIndexUrl() {
		return baseURL +"/";
	}
}
