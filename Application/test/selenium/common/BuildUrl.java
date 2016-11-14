package selenium.common;

import selenium.common.constant.SeleniumConstant;

public class BuildUrl {
	
	private String baseURL =null;
	
	private final String PHOENIX_APPLICATION = "/phoenix/Application.html";

	public BuildUrl(String option) {
		
		if(SeleniumConstant.OPTION_LOCAL.equalsIgnoreCase(option)){
			
			baseURL = SeleniumConstant.LOCAL_URL;
			
		}else if (SeleniumConstant.OPTION_BETA.equalsIgnoreCase(option)) {
			
			baseURL =SeleniumConstant.BETA_URL+PHOENIX_APPLICATION;
					
		}else if (SeleniumConstant.OPTION_STAGING.equalsIgnoreCase(option)) {
			
			baseURL =SeleniumConstant.STAGING_URL+PHOENIX_APPLICATION;
		}
		
	}

	public String getBaseUrl() {
		return baseURL ;
	}

	
}
