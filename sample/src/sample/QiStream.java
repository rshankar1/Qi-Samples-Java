package sample;

import java.util.List;

public class QiStream {
    private String id;
    private String name;
    private String description;
    private List<QiTypeProperty> properties;
    
	public void QiStream(){
		this.id = "";
		this.name = "NONE";
		this.description = "NONE";	
		this.properties = null;
		
		
		
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<QiTypeProperty> getProperties() {
		return properties;
	}
	public void setProperties(List<QiTypeProperty> properties) {
		this.properties = properties;
	}
	
	
	
}
