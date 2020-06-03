package com.spring.Model;

import java.math.BigInteger;
import java.util.Date;

import com.andromeda.commons.model.BaseModel;

public class Employee extends BaseModel {
	
	private static final long serialVersionUID = 1L;
	  
	public String empid;
	public String title;
	public String first_name;
	public String middle_name;
	public String last_name;
	public BigInteger mobile;
	public BigInteger alternate_mobile;
	public String dob;  
	public Date birthday_date;
	public String gender;
	public String email;
	public String aadhaar;
	public String passport;                           
	public String photo_path;  
	public String nativity;
	public String nationality;
	public String caste;
	public String sub_caste;
	public String blood_group;
	public String emergency_name;
	public BigInteger emergency_contact;
	public Integer relation;
	public String created_by;
	public boolean status;
	public Integer pincode;
	public String dno;
	public String street;
	public String village;
	public String mandal;
	public Integer districtid;
	public String state;
	public String bank_acno;
	public String bank_name;
	public String brach;
	public String ifsc_code;
	public String pan_name;
	public String pan_no;
	public String esi_no;
	public String uan_no;   
	public String pf_no;
	public Double ctc;
	public String ctc_calculator;
	public String payment_mode;
	public BigInteger beneficiary_code;
	public String fullname;
	
	
	/* attendance and time sheet */
	public String timesheet_date;
	public String location;
	public String task;     
	public String description;
	public String start_time;
	public String end_time;  
	
	/* Education details in employee creation */
	public String institute;
	public String highest_qualification;
	public String score;
	public Integer passout_year;
	public Double cgpa;
	public String grades;
	public Double percentage;
	
	
	//Employee Details 

		
		public boolean isStatus() {
		return status;
	}
	public String getInstitute() {
			return institute;
		}
		public void setInstitute(String institute) {
			this.institute = institute;
		}
		public String getHighest_qualification() {
			return highest_qualification;
		}
		public void setHighest_qualification(String highest_qualification) {
			this.highest_qualification = highest_qualification;
		}
		public String getScore() {
			return score;
		}
		public void setScore(String score) {
			this.score = score;
		}
		public Integer getPassout_year() {
			return passout_year;
		}
		public void setPassout_year(Integer passout_year) {
			this.passout_year = passout_year;
		}
		public Double getCgpa() {
			return cgpa;
		}
		public void setCgpa(Double cgpa) {
			this.cgpa = cgpa;
		}
		public String getGrades() {
			return grades;
		}
		public void setGrades(String grades) {
			this.grades = grades;
		}
		public Double getPercentage() {
			return percentage;
		}
		public void setPercentage(Double percentage) {
			this.percentage = percentage;
		}
	public String getTimesheet_date() {
			return timesheet_date;
		}
		public void setTimesheet_date(String timesheet_date) {
			this.timesheet_date = timesheet_date;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
	public void setStatus(boolean status) {
		this.status = status;
	}
		
	public Double getCtc() {
		return ctc;
	}
	public void setCtc(Double ctc) {
		this.ctc = ctc;
	}
	public String getCtc_calculator() {
		return ctc_calculator;
	}
	public void setCtc_calculator(String ctc_calculator) {
		this.ctc_calculator = ctc_calculator;
	}
	public BigInteger getBeneficiary_code() {
			return beneficiary_code;
		}
		public void setBeneficiary_code(BigInteger beneficiary_code) {
			this.beneficiary_code = beneficiary_code;
		}
	
	public String getPayment_mode() {
		return payment_mode;
	}
	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}
		public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
		public String company_email;
		public Integer caderid;
		public Integer gradeid;
		public String joining_date;
		public String confirmed_date;
		public String contract_from;
		public String contract_to;
		public String relieved_date;    
		public Integer departmentid;
		public Integer designationid;
		public Integer divisionid;
		public Integer cost_centerid;
		public Integer employee_type;
		public String reporting_to;
		public Integer notice_period;
		public String created_date;
		public String name;
		public String dob1;
		public Integer relationid;
		public String company_name; 
		public String designation;
		public String from_date;
		public String to_date;
		public String document_name;
		public Boolean consent;
		public String grade;
		public String cader;
		public String department;
		public String division;
		public String cost_center;
		
		/* scheme, project, sector */
		
		public String scheme_id;
		public String scheme_name;
		public String project_id;
		public String project_name;
		public String sector_id;
		public String sector_name;
		
		/* Institute and qualification in update employee education tab(Employee login) */
		
		public Integer institute_id;
		public String institute_name;
		public Integer qualification_id;
		public String qualification_name;
		
		
		/* project employee mapping */
		
		public Integer id;
		public String location_name;
		public Integer project;
		public Integer reporting;
		public String projectname;
		public String locationname;
		public String full_name;
		public String email_id;
		public BigInteger phone;
		public String cader_name;
		public String grade_name;
		public String designation_name;
		
		
		
		public String getTask() {
			return task;
		}
		public void setTask(String task) {
			this.task = task;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getStart_time() {
			return start_time;
		}
		public void setStart_time(String start_time) {
			this.start_time = start_time;
		}
		public String getEnd_time() {
			return end_time;
		}
		public void setEnd_time(String end_time) {
			this.end_time = end_time;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getLocation_name() {
			return location_name;
		}
		public void setLocation_name(String location_name) {
			this.location_name = location_name;
		}
		public Integer getProject() {
			return project;
		}
		public void setProject(Integer project) {
			this.project = project;
		}
		public Integer getReporting() {
			return reporting;
		}
		public void setReporting(Integer reporting) {
			this.reporting = reporting;
		}
		public String getProjectname() {
			return projectname;
		}
		public void setProjectname(String projectname) {
			this.projectname = projectname;
		}
		public String getLocationname() {
			return locationname;
		}
		public void setLocationname(String locationname) {
			this.locationname = locationname;
		}
		public String getFull_name() {
			return full_name;
		}
		public void setFull_name(String full_name) {
			this.full_name = full_name;
		}
		public String getEmail_id() {
			return email_id;
		}
		public void setEmail_id(String email_id) {
			this.email_id = email_id;
		}
		public BigInteger getPhone() {
			return phone;
		}
		public void setPhone(BigInteger phone) {
			this.phone = phone;
		}
		public String getCader_name() {
			return cader_name;
		}
		public void setCader_name(String cader_name) {
			this.cader_name = cader_name;
		}
		public String getGrade_name() {
			return grade_name;
		}
		public void setGrade_name(String grade_name) {
			this.grade_name = grade_name;
		}
		public String getDesignation_name() {
			return designation_name;
		}
		public void setDesignation_name(String designation_name) {
			this.designation_name = designation_name;
		}
		public String getSector_id() {
			return sector_id;
		}
		public void setSector_id(String sector_id) {
			this.sector_id = sector_id;
		}
		public String getProject_id() {
			return project_id;
		}
		public void setProject_id(String project_id) {
			this.project_id = project_id;
		}
		public String getScheme_id() {
			return scheme_id;
		}
		public void setScheme_id(String scheme_id) {
			this.scheme_id = scheme_id;
		}
		public Integer getInstitute_id() {
			return institute_id;
		}
		public void setInstitute_id(Integer institute_id) {
			this.institute_id = institute_id;
		}
		public String getInstitute_name() {
			return institute_name;
		}
		public void setInstitute_name(String institute_name) {
			this.institute_name = institute_name;
		}
		public Integer getQualification_id() {
			return qualification_id;
		}
		public void setQualification_id(Integer qualification_id) {
			this.qualification_id = qualification_id;
		}
		public String getQualification_name() {
			return qualification_name;
		}
		public void setQualification_name(String qualification_name) {
			this.qualification_name = qualification_name;
		}
		public String getScheme_name() {
			return scheme_name;
		}
		public void setScheme_name(String scheme_name) {
			this.scheme_name = scheme_name;
		}
		public String getProject_name() {
			return project_name;
		}
		public void setProject_name(String project_name) {
			this.project_name = project_name;
		}
		public String getSector_name() {
			return sector_name;
		}
		public void setSector_name(String sector_name) {
			this.sector_name = sector_name;
		}
		
		
		
		
			
		
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		public String getCader() {
			return cader;
		}
		public void setCader(String cader) {
			this.cader = cader;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getDivision() {
			return division;
		}
		public void setDivision(String division) {
			this.division = division;
		}
		public String getCost_center() {
			return cost_center;
		}
		public void setCost_center(String cost_center) {
			this.cost_center = cost_center;
		}
		public String getEmpid() {
			return empid;
		}
		public void setEmpid(String empid) {
			this.empid = empid;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getMiddle_name() {
			return middle_name;
		}
		public void setMiddle_name(String middle_name) {
			this.middle_name = middle_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public BigInteger getMobile() {
			return mobile;
		}
		public void setMobile(BigInteger mobile) {
			this.mobile = mobile;
		}
		public BigInteger getAlternate_mobile() {
			return alternate_mobile;
		}
		public void setAlternate_mobile(BigInteger alternate_mobile) {
			this.alternate_mobile = alternate_mobile;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public Date getBirthday_date() {
			return birthday_date;
		}
		public void setBirthday_date(Date birthday_date) {
			this.birthday_date = birthday_date;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAadhaar() {
			return aadhaar;
		}
		public void setAadhaar(String aadhaar) {
			this.aadhaar = aadhaar;
		}
		public String getPassport() {
			return passport;
		}
		public void setPassport(String passport) {
			this.passport = passport;
		}
		public String getPhoto_path() {
			return photo_path;
		}
		public void setPhoto_path(String photo_path) {
			this.photo_path = photo_path;
		}
		public String getNativity() {
			return nativity;
		}
		public void setNativity(String nativity) {
			this.nativity = nativity;
		}
		public String getNationality() {
			return nationality;
		}
		public void setNationality(String nationality) {
			this.nationality = nationality;
		}
		public String getCaste() {
			return caste;
		}
		public void setCaste(String caste) {
			this.caste = caste;
		}
		public String getSub_caste() {
			return sub_caste;
		}
		public void setSub_caste(String sub_caste) {
			this.sub_caste = sub_caste;
		}
		public String getBlood_group() {
			return blood_group;
		}
		public void setBlood_group(String blood_group) {
			this.blood_group = blood_group;
		}
		public String getEmergency_name() {
			return emergency_name;
		}
		public void setEmergency_name(String emergency_name) {
			this.emergency_name = emergency_name;
		}
		public BigInteger getEmergency_contact() {
			return emergency_contact;
		}
		public void setEmergency_contact(BigInteger emergency_contact) {
			this.emergency_contact = emergency_contact;
		}
		public Integer getRelation() {
			return relation;
		}
		public void setRelation(Integer relation) {
			this.relation = relation;
		}
		public String getCreated_by() {
			return created_by;
		}
		public void setCreated_by(String created_by) {
			this.created_by = created_by;
		}

	/*
	 * public Boolean getStatus() { return status; } public void setStatus(Boolean
	 * status) { this.status = status; }
	 */
		public Integer getPincode() {
			return pincode;
		}
		public void setPincode(Integer pincode) {
			this.pincode = pincode;
		}
		public String getDno() {
			return dno;
		}
		public void setDno(String dno) {
			this.dno = dno;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getVillage() {
			return village;
		}
		public void setVillage(String village) {
			this.village = village;
		}
		public String getMandal() {
			return mandal;
		}
		public void setMandal(String mandal) {
			this.mandal = mandal;
		}
		public Integer getDistrictid() {
			return districtid;
		}
		public void setDistrictid(Integer districtid) {
			this.districtid = districtid;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getBank_acno() {
			return bank_acno;
		}
		public void setBank_acno(String bank_acno) {
			this.bank_acno = bank_acno;
		}
		public String getBank_name() {
			return bank_name;
		}
		public void setBank_name(String bank_name) {
			this.bank_name = bank_name;
		}
		public String getBrach() {
			return brach;
		}
		public void setBrach(String brach) {
			this.brach = brach;
		}
		public String getIfsc_code() {
			return ifsc_code;
		}
		public void setIfsc_code(String ifsc_code) {
			this.ifsc_code = ifsc_code;
		}
		public String getPan_name() {
			return pan_name;
		}
		public void setPan_name(String pan_name) {
			this.pan_name = pan_name;
		}
		public String getPan_no() {
			return pan_no;
		}
		public void setPan_no(String pan_no) {
			this.pan_no = pan_no;
		}
		public String getEsi_no() {
			return esi_no;
		}
		public void setEsi_no(String esi_no) {
			this.esi_no = esi_no;
		}
		public String getUan_no() {
			return uan_no;
		}
		public void setUan_no(String uan_no) {
			this.uan_no = uan_no;
		}
		public String getPf_no() {
			return pf_no;
		}
		public void setPf_no(String pf_no) {
			this.pf_no = pf_no;
		}
		public String getCompany_email() {
			return company_email;
		}
		public void setCompany_email(String company_email) {
			this.company_email = company_email;
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
		public String getJoining_date() {
			return joining_date;
		}
		public void setJoining_date(String joining_date) {
			this.joining_date = joining_date;
		}
		public String getConfirmed_date() {
			return confirmed_date;
		}
		public void setConfirmed_date(String confirmed_date) {
			this.confirmed_date = confirmed_date;
		}
		public String getContract_from() {
			return contract_from;
		}
		public void setContract_from(String contract_from) {
			this.contract_from = contract_from;
		}
		public String getContract_to() {
			return contract_to;
		}
		public void setContract_to(String contract_to) {
			this.contract_to = contract_to;
		}
		public String getRelieved_date() {
			return relieved_date;
		}
		public void setRelieved_date(String relieved_date) {
			this.relieved_date = relieved_date;
		}
		public Integer getDepartmentid() {
			return departmentid;
		}
		public void setDepartmentid(Integer departmentid) {
			this.departmentid = departmentid;
		}
		public Integer getDesignationid() {
			return designationid;
		}
		public void setDesignationid(Integer designationid) {
			this.designationid = designationid;
		}
		public Integer getDivisionid() {
			return divisionid;
		}
		public void setDivisionid(Integer divisionid) {
			this.divisionid = divisionid;
		}
		public Integer getCost_centerid() {
			return cost_centerid;
		}
		public void setCost_centerid(Integer cost_centerid) {
			this.cost_centerid = cost_centerid;
		}
		public Integer getEmployee_type() {
			return employee_type;
		}
		public void setEmployee_type(Integer employee_type) {
			this.employee_type = employee_type;
		}
		public String getReporting_to() {
			return reporting_to;
		}
		public void setReporting_to(String reporting_to) {
			this.reporting_to = reporting_to;
		}
		public Integer getNotice_period() {
			return notice_period;
		}
		public void setNotice_period(Integer notice_period) {
			this.notice_period = notice_period;
		}
		public String getCreated_date() {
			return created_date;       
		}
		public void setCreated_date(String created_date) {
			this.created_date = created_date;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDob1() {
			return dob1;
		}
		public void setDob1(String dob1) {
			this.dob1 = dob1; 
		}
		public Integer getRelationid() {
			return relationid;
		}
		public void setRelationid(Integer relationid) {
			this.relationid = relationid;
		}
		public String getCompany_name() {
			return company_name;
		}
		public void setCompany_name(String company_name) {
			this.company_name = company_name;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
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
		public String getDocument_name() {
			return document_name;
		}
		public void setDocument_name(String document_name) {
			this.document_name = document_name;
		}
		public Boolean getConsent() {
			return consent;
		}
		public void setConsent(Boolean consent) {
			this.consent = consent;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		 	
	
}
	
	
	