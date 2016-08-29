package web.shared;

public class HoseDeliveryBean {

	public String  ID = "ID";
	public String DELIVERY_ID = "Delivery_ID";
	public String SITE = "Site";

	private String id;
	private String deliveryId;
	private String site;
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDeliveryId() {
		return deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
}
