package com.spring.Model;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
public class LeavesReport {
	private static long serialVersionUID = 1L;
	public String  employeename;
	public String  empid;
	public String  first_name;
	public String  grade_name;
	public String  department_name;
	public String  designation_name;
	public Integer designation_id;
	public Integer departmentid;       
	public Integer caderid;            
	public Integer gradeid;
	public Integer designation;
	public Integer department;
	public Integer cader;
	public Integer grade;
	public String  reporting_to;
	public Integer leave_type;
	public Integer leave_nature ;
	public String  approval_by;
	public String  reason;
	public Integer leavestatus;
	public Date    comp_date;
	public String  from_date;
	public String  to_date;
	public Timestamp created_date;
	public BigInteger count;
	public BigInteger empid1;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {   
		this.empid = empid;
	}
	
	public Timestamp getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getGrade_name() {
		return grade_name;
	}
	public void setGrade_name(String grade_name) {
		this.grade_name = grade_name;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public String getDesignation_name() {
		return designation_name;
	}
	public void setDesignation_name(String designation_name) {
		this.designation_name = designation_name;
	}
	public Integer getDesignation_id() {
		return designation_id;
	}
	public void setDesignation_id(Integer designation_id) {
		this.designation_id = designation_id;
	}
	public Integer getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}
	public Integer getCaderid() {
		return caderid;
	}
	public void setCaderid(Integer caderid) {
		this.caderid = caderid;
	}
	public Integer getGradeid() {
		return gradeid;
	}
	public void setGradeid(Integer gradeid) {
		this.gradeid = gradeid;
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
	public String getReporting_to() {
		return reporting_to;
	}
	public void setReporting_to(String reporting_to) {
		this.reporting_to = reporting_to;
	}
	public Integer getLeave_type() {
		return leave_type;
	}
	public void setLeave_type(Integer leave_type) {
		this.leave_type = leave_type;
	}
	public Integer getLeave_nature() {
		return leave_nature;
	}
	public void setLeave_nature(Integer leave_nature) {
		this.leave_nature = leave_nature;
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
	public Integer getLeavestatus() {
		return leavestatus;
	}
	public void setLeavestatus(Integer leavestatus) {
		this.leavestatus = leavestatus;
	}
	public Date getComp_date() {
		return comp_date;
	}
	public void setComp_date(Date comp_date) {
		this.comp_date = comp_date;
	}
	public String getEmployeename() {
		return employeename;                   
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getFrom_date() {
		return from_date;
	}
	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}
	public String getTo_date() {
		return to_date;
	}
	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}
	public BigInteger getCount() {
		return count;
	}
	public void setCount(BigInteger count) {
		this.count = count;
	}
	public BigInteger getEmpid1() {
		return empid1;
	}
	public void setEmpid1(BigInteger empid1) {
		this.empid1 = empid1;
	}
	
}
