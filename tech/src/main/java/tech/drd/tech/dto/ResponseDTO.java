package tech.drd.tech.dto;

public class ResponseDTO {
	String Status;
	Object payload;
	String description;
	
	/**
	 * 
	 */
	public ResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param status
	 * @param payload
	 * @param description
	 */
	public ResponseDTO(String status, Object payload, String description) {
		super();
		Status = status;
		this.payload = payload;
		this.description = description;
	}



	/**
	 * @return the status
	 */
	public String getStatus() {
		return Status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		Status = status;
	}
	/**
	 * @return the payload
	 */
	public Object getPayload() {
		return payload;
	}
	/**
	 * @param payload the payload to set
	 */
	public void setPayload(Object payload) {
		this.payload = payload;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
