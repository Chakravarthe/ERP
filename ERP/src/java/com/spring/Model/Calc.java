package com.spring.Model;

public class Calc {
	private static final long serialVersionUID = 1L;
	
	public String yearid;
	public String cader_name;   
	
	public String financial_year;
	public String name;
	public Integer caderid;
	public Integer gradeid;
	public Integer basicvalue;
	public Integer hravalue;
	public Integer cavalue;
	public Integer mavalue;
	public Integer ltavalue;
	public Integer grossvalue;
	public Integer deductions;    
	public String grade_name;
	public String years;
	/*public Integer models[lhd.value];*/
	
	   
	
	
	public String getYears() {     
		return years;
	}
	
	public Integer getBasicvalue() {
		return basicvalue;
	}

	public void setBasicvalue(Integer basicvalue) {
		this.basicvalue = basicvalue;
	}

	
	public Integer getHravalue() {
		return hravalue;
	}

	public void setHravalue(Integer hravalue) {
		this.hravalue = hravalue;
	}

	public Integer getCavalue() {
		return cavalue;
	}

	public void setCavalue(Integer cavalue) {
		this.cavalue = cavalue;
	}

	public Integer getMavalue() {
		return mavalue;
	}

	public void setMavalue(Integer mavalue) {
		this.mavalue = mavalue;
	}

	public Integer getLtavalue() {
		return ltavalue;
	}

	public void setLtavalue(Integer ltavalue) {
		this.ltavalue = ltavalue;
	}

	public Integer getGrossvalue() {
		return grossvalue;
	}

	public void setGrossvalue(Integer grossvalue) {
		this.grossvalue = grossvalue;
	}

	public void setYears(String years) {
		this.years = years;
	}
	public Integer getDeductions() {
		return deductions;
	} 
	public void setDeductions(Integer deductions) {    
		this.deductions = deductions;
	}
	public String getCader_name() {
		return cader_name;    
	}
	public void setCader_name(String cader_name) {
		this.cader_name = cader_name;
	}
	
	/*ublic Integer getValue() {
		return value;
	}     
	public void setValue(Integer value) {   
		this.value = value;
	}*/
	public String getGrade_name() {
		return grade_name;
	}     
	public void setGrade_name(String grade_name) {
		this.grade_name = grade_name;
	}
	public String getName() {              
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getYearid() {
		return yearid;
	}
	public void setYearid(String yearid) {
		this.yearid = yearid;
	}
	public String getFinancial_year() {
		return financial_year;
	}
	public void setFinancial_year(String financial_year) {
		this.financial_year = financial_year;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
