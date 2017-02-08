package web.dao.server.listboxdata;

import web.common.util.SpringContextUtils;
import web.comstant.SpringNameBean;

public class ListBoxDataJDBCTemplate extends SpringContextUtils{

	
	public ListBoxDataJDBCTemplate() {
	
		super.getBeanFromContext(SpringNameBean.LIST_BOX_DATA);
	}
}
