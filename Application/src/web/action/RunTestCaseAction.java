package web.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import selenium.common.BuildUrl;
import selenium.common.constant.SeleniumConstant;
import web.common.interfaces.SetupModelAndView;
import web.common.util.StringUtils;
import web.comstant.Action;
import web.comstant.PageRegister;
import web.dao.service.RunTestCaseService;
import web.selenium.WebDriverChrome;
import web.shared.EnvironmentBean;
import web.shared.GroupBean;
import web.shared.LoginSetupBean;
import web.shared.SetupBean;

public class RunTestCaseAction implements SetupModelAndView {

	private ModelAndView modelAndView = new ModelAndView();

	private RunTestCaseService service = new RunTestCaseService();

	private GroupBean groupBean;

	private LoginSetupBean loginSetupBean;

	public RunTestCaseAction(GroupBean groupBean) {
		this.groupBean = groupBean;
		setupPage();
		setupData();

	}

	@Override
	public ModelAndView getSetupModelAndView() {
		return modelAndView;
	}

	@Override
	public void setupPage() {
		String viewName = PageRegister.RUN_TEST_CASE.getPath();
		modelAndView.setViewName(viewName);

	}

	@Override
	public void setupData() {
		setupTableData();

	}

	@Override
	public void action() {
		String direction = groupBean.getDirection();
		boolean isCheck = StringUtils.isNotNullAndEmpty(direction);
		if (isCheck) {

			switch (direction) {

			case Action.RUN:
				runTestCase();
				setupTableData();
				break;

			default:
				break;
			}
		}

	}

	private void setupTableData() {
		List<GroupBean> groupBeans = service.getAllGroup();

		modelAndView.addObject("groupBeans", groupBeans);

	}

	private void runTestCase() {

		service.runTestCase(groupBean);
		String name = groupBean.getName();
		List<SetupBean> setupBeans = new ArrayList<>();

		List<SetupBean> loginSetup = getLoginSetupByReference(name);

		setupBeans.addAll(loginSetup);

		List<EnvironmentBean> environmentBeans = genEnvironmentActive();

		List<Runnable> runnables = prepareRunnableByEnvironmentActive(environmentBeans,setupBeans);

		runProcess(runnables);

	}

	private List<SetupBean> getLoginSetupByReference(String name) {
		List<SetupBean> setupBeans = new ArrayList<>();
		setupBeans = service.getLoginSetupByReference(name);
		return setupBeans;
	}

	private List<EnvironmentBean> genEnvironmentActive() {
		List<EnvironmentBean> environmentBeans = new ArrayList<>();
		environmentBeans = service.genEnvironmentActive();
		return environmentBeans;
	}

	private List<Runnable> prepareRunnableByEnvironmentActive(List<EnvironmentBean> environmentBeans, List<SetupBean> setupBeans) {

		List<Runnable> runnables = new ArrayList<>();
		for (EnvironmentBean environmentBean : environmentBeans) {
			String url = environmentBean.getUrl();
			Runnable runnable = new CreateChromeWebDriver(url,setupBeans);
			
			runnables.add(runnable);
		}

		return runnables;
	}

	private void runProcess(List<Runnable> runnables) {
		for (Runnable runnable : runnables) {
			Thread thread = new Thread(runnable);
			thread.start();
		}

	}

	class CreateChromeWebDriver implements Runnable {

		private String url;
		
		private List<SetupBean> setupBeans ; 

		public CreateChromeWebDriver(String url, List<SetupBean> setupBeans) {
			this.url = url;
			this.setupBeans = setupBeans;
		}

		@Override
		public void run() {
			WebDriverChrome driver = new WebDriverChrome();

			BuildUrl buildUrl = new BuildUrl(SeleniumConstant.OPTION_STAGING);
			driver.getWedDriver();

			String indexUrl = buildUrl.getBaseUrl();

			driver.getDriver().get(url);
			
			driver.process(setupBeans);
			driver.waitTime(10);
			driver.close();

		}

	}

}
