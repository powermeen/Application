package web.dao.server.widgets.collection;

import java.util.List;
import java.util.Map;

import web.shared.WidgetsCollectionBean;

public interface WidgetsCollectionDao {

	
	
	public List<WidgetsCollectionBean> getWidgetsCollectionByModule(String module)throws IllegalArgumentException;
	
	public boolean addWidgetId (WidgetsCollectionBean collectionBean )throws IllegalArgumentException;
}
