package com.spring.Model;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import com.andromeda.commons.model.BaseModel;

public class Attendance extends BaseModel{
	public String staff_type;
	public Integer id;
	
	/* getting data to table in attendance sheet */
	private String first_name;
	private String last_name;
	private Double total_leaves;
	private Double used_leaves;
	private Double no_of_holidays;    
	private Integer count;
	
	
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Double getTotal_leaves() {
		return total_leaves;
	}
	public void setTotal_leaves(Double total_leaves) {
		this.total_leaves = total_leaves;
	}
	public Double getUsed_leaves() {
		return used_leaves;
	}
	public void setUsed_leaves(Double used_leaves) {
		this.used_leaves = used_leaves;
	}
	public Double getNo_of_holidays() {
		return no_of_holidays;
	}
	public void setNo_of_holidays(Double no_of_holidays) {
		this.no_of_holidays = no_of_holidays;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getStaff_type() {
		return staff_type;
	}
	public void setStaff_type(String staff_type) {
		this.staff_type = staff_type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date from_date;
	public Date to_date;
	public Date getFrom_date() {
		return from_date;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	public Date getTo_date() {
		return to_date;
	}
	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}
	
	public Integer empid;
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public Date login_date;
	public String login_time;
	
	public Date getLogin_date() {
		return login_date;
	}
	public void setLogin_date(Date login_date) {
		this.login_date = login_date;
	}
	public String getLogin_time() {    
		return login_time;
	}
	public String getLogout_time() {
		return logout_time;
	}
	public void setLogout_time(String logout_time) {
		this.logout_time = logout_time;
	}
	public void setLogin_time(String login_time) {
		this.login_time = login_time;
	}
	public String logout_time;
	
	
	
	
	private Integer leave_type;
	
	public Integer getLeave_type() {
		return leave_type;
	}
	public void setLeave_type(Integer leave_type) {
		this.leave_type = leave_type;
	}
	private Integer cader;
	private Integer grade;
	private Integer leave_nature;
	private Integer designation;
	
	public Integer getCader() {
		return cader;
	}
	public void setCader(Integer cader) {
		this.cader = cader;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Integer getLeave_nature() {
		return leave_nature;
	}
	public void setLeave_nature(Integer leave_nature) {
		this.leave_nature = leave_nature;
	}
	public Integer getDesignation() {
		return designation;
	}
	public void setDesignation(Integer designation) {
		this.designation = designation;
	}
	public Integer getDepartment() {
		return department;
	}
	public void setDepartment(Integer department) {
		this.department = department;
	}
	public Integer getLeve_type() {
		return leve_type;
	}
	public void setLeve_type(Integer leve_type) {
		this.leve_type = leve_type;
	}
	public String getApproval_by() {
		return approval_by;
	}
	public void setApproval_by(String approval_by) {
		this.approval_by = approval_by;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	private Integer department;
	private Integer leve_type;
	private String approval_by;
	private String reason;
	
	
	/*Calendar page*/
	
	public Integer year_id;
	public Integer year;
	public Integer getYear_id() {
		return year_id;
	}
	public void setYear_id(Integer year_id) {
		this.year_id = year_id;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	
	public String holiday_type;
	public String holiday_name;
	
	public String getHoliday_type() {
		return holiday_type;
	}
	public void setHoliday_type(String holiday_type) {
		this.holiday_type = holiday_type;
	}
	public String getHoliday_name() {
		return holiday_name;
	}
	public void setHoliday_name(String holiday_name) {
		this.holiday_name = holiday_name;
	}
	
	
	public String day;
	
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
	
	

}
