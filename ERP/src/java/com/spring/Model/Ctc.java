
package com.spring.Model;


import com.andromeda.commons.model.BaseModel;

public class Ctc extends BaseModel {    
	
	private static long serialVersionUID = 1L;
	
	
	public String created_by;
	public String pname;
	public String title;
	public boolean status;
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public static void setSerialVersionUID(long serialVersionUID) {
		Ctc.serialVersionUID = serialVersionUID;
	}
	public boolean isStatus() {
		return status;   
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getTitle() {
		return title;    
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
		
		
}
	
	
	