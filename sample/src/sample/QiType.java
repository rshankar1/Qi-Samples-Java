package sample;

import java.util.List;

public class QiType {

	 private String id;
	    private String name;
	    private String description;
	    private QiTypeCode qiTypeCode;
	    private List<QiTypeProperty> properties;
		public void QiStream(){
			this.id = "";
			this.name = "NONE";
			this.description = "NONE";
			this.qiTypeCode = QiTypeCode.Object;
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
		public QiTypeCode getQiTypeCode() {
			return qiTypeCode;
		}
		public void setQiTypeCode(QiTypeCode qiTypeCode) {
			this.qiTypeCode = qiTypeCode;
		}
		public List<QiTypeProperty> getProperties() {
			return properties;
		}
		public void setProperties(List<QiTypeProperty> properties) {
			this.properties = properties;
		}
		
	
	
	
}
