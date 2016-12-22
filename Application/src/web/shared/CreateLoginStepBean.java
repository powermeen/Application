package web.shared;

import java.util.ArrayList;
import java.util.List;

public class CreateLoginStepBean {

	private String reference;
	
	private String page;
	
	private String action;
	
	private SetupBean setupBean = new SetupBean();
	
	private List<SetupBean> setupBeans = new ArrayList<>();

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public SetupBean getSetupBean() {
		return setupBean;
	}

	public void setSetupBean(SetupBean setupBean) {
		this.setupBean = setupBean;
	}

	public List<SetupBean> getSetupBeans() {
		return setupBeans;
	}

	public void setSetupBeans(List<SetupBean> setupBeans) {
		this.setupBeans = setupBeans;
	}

	

	
}
