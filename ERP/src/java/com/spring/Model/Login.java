
package com.spring.Model; 

import java.util.Date;
import java.util.List;

import com.andromeda.commons.model.BaseModel;
import java.sql.Timestamp;


public class Login extends BaseModel
{
	
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String ipaddress;    
	private String logtime;        
	private Integer roleid;
	public Integer instituteid;
	public Integer courseid;
	public Integer districtid;
	private String courseshortname;   
	public float amount;
	public Integer examcentercode;
	public String centername;
	public String employeeid;
	public String email;
	private Date login_date;
	private String login_time;
	private String logout_time;
	private Date created_date;
	private String login_longitude;
	private String login_latitude;
	private String logout_longitude;
	  private List<Login> login;
	private String logout_latitude;
	private String login_ipAddress;
	private String logout_ipAddress;
	
	private Timestamp timeStamp;
	
	
	
	
	
	
	
	public Timestamp getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	public List<Login> getLogin() {
		return login;
	}

	public void setLogin(List<Login> login) {
		this.login = login;
	}
	
	public String empid;
	


	

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	

	public Date getLogin_date() {
		return login_date;
	}

	public void setLogin_date(Date login_date) {
		this.login_date = login_date;
	}

	public String getLogin_time() {
		return login_time;
	}

	public void setLogin_time(String login_time) {
		this.login_time = login_time;
	}

	public String getLogout_time() {
		return logout_time;
	}

	public void setLogout_time(String logout_time) {
		this.logout_time = logout_time;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public String getLogin_longitude() {
		return login_longitude;
	}

	public void setLogin_longitude(String login_longitude) {
		this.login_longitude = login_longitude;
	}

	public String getLogin_latitude() {
		return login_latitude;
	}

	public void setLogin_latitude(String login_latitude) {
		this.login_latitude = login_latitude;
	}

	public String getLogout_longitude() {
		return logout_longitude;
	}

	public void setLogout_longitude(String logout_longitude) {
		this.logout_longitude = logout_longitude;
	}

	public String getLogout_latitude() {
		return logout_latitude;
	}

	public void setLogout_latitude(String logout_latitude) {
		this.logout_latitude = logout_latitude;
	}

	public String getLogin_ipAddress() {
		return login_ipAddress;
	}

	public void setLogin_ipAddress(String login_ipAddress) {
		this.login_ipAddress = login_ipAddress;
	}

	public String getLogout_ipAddress() {
		return logout_ipAddress;
	}

	public void setLogout_ipAddress(String logout_ipAddress) {
		this.logout_ipAddress = logout_ipAddress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public Integer getExamcentercode() {
		return examcentercode;
	}

	public void setExamcentercode(Integer examcentercode) {
		this.examcentercode = examcentercode;
	}

	public String getCentername() {
		return centername;
	}

	public void setCentername(String centername) {
		this.centername = centername;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getCourseshortname() {
		return courseshortname;
	}

	public void setCourseshortname(String courseshortname) {
		this.courseshortname = courseshortname;
	}

	public Integer getDistrictid() {
		return districtid;
	}

	public void setDistrictid(Integer districtid) {
		this.districtid = districtid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}  

	public Integer getCourseid() {
		return courseid;
	}

	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}

	public String getLogtime() {
		return logtime;
	}

	public void setLogtime(String logtime) {
		this.logtime = logtime;
	}

		public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

		public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}   

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public Integer getInstituteid() {
		return instituteid;
	}

	public void setInstituteid(Integer instituteid) {
		this.instituteid = instituteid;
	}
	
}