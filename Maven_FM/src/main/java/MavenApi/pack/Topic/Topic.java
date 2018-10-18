package MavenApi.pack.Topic;

public class Topic {
	
	private String id;
	private String name;
	private String descriptio;
	
	public Topic() {
		
	}
	
	public Topic(String id, String name, String descriptio) {
		super();
		this.id = id;
		this.name = name;
		this.descriptio = descriptio;
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
	public String getDescriptio() {
		return descriptio;
	}
	public void setDescriptio(String descriptio) {
		this.descriptio = descriptio;
	}
	
}
