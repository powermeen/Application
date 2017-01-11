package web.shared;

public class GroupBean {

	private String id;
	
	private String name;
	
	private String module ;
	
	private String status;
	
	private String direction;
	
	public GroupBean() {
		// TODO Auto-generated constructor stub
	}
	
	public GroupBean(String id ,String status, String direction) {
		this.id = id ;
		this.status = status;
		this.direction = direction;
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	

	

	
}
