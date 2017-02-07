package web.dao.server.listboxdata;

import web.common.util.SpringUtils;
import web.comstant.SpringNameBean;

public class ListBoxDataJDBCTemplate extends SpringUtils{

	
	public ListBoxDataJDBCTemplate() {
	
		super.getBeanFromContext(SpringNameBean.LIST_BOX_DATA);
	}
}
