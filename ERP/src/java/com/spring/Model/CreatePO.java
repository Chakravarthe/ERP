package com.spring.Model;

import java.math.BigInteger;
import java.util.Date;

import com.andromeda.commons.model.BaseModel;

public class CreatePO extends BaseModel {
	
	private static final long serialVersionUID = 1L;
	
	public Integer yearid;
	/*public String years;*/
	/*public String  purchaseotypename;
	public String  purchasetypename;
	public Integer purchaseotypeid;
	public Integer purchasetypeid;*/
	public Integer purchaseotypeid;
	public Integer service_id;
	public Integer purchasetypeid;
	public Integer programid;
	public Integer sectorid;
	public Integer vendorid;
	public Integer serviceid;
	public Integer monthid;
	public String months;

	/*public String servicename;*/
	public Integer program_id;
	/*public String programname;*/
	public Integer sector_id;
	/*public String sectorname;*/
	public Integer vendor_id;
	/*public String vendorname;*/
	public Integer po_id;
	public String asset_name;
	public Integer id;
	public String location_name;
	public Integer qty;
	public Integer rate;
	public Integer value;
	public String brand;
	public String specifications;
	public Integer location;
	public String installation_status;
	public Integer installation_cost;
	
	public String financial_year;
	public Integer po_type;
	public Integer p_type;
	/*public Integer service_id;
	public Integer program_id;
	public Integer sector_id;
	public Integer vendor_id;*/
	public String vendor_comment;
	public Integer order_no;
	public Date order_date;
	public Date need_by_date;
	public String address;
	public String amount_words;
	public Integer amount;
	public String instructions;
	public String group_name;
	public Integer getYearid() {
		return yearid;
	}
	public void setYearid(Integer yearid) {
		this.yearid = yearid;
	}
	public Integer getPurchaseotypeid() {
		return purchaseotypeid;
	}
	public void setPurchaseotypeid(Integer purchaseotypeid) {
		this.purchaseotypeid = purchaseotypeid;
	}
	public Integer getService_id() {
		return service_id;
	}
	public void setService_id(Integer service_id) {
		this.service_id = service_id;
	}
	public Integer getPurchasetypeid() {
		return purchasetypeid;
	}
	public void setPurchasetypeid(Integer purchasetypeid) {
		this.purchasetypeid = purchasetypeid;
	}
	public Integer getProgramid() {
		return programid;
	}
	public void setProgramid(Integer programid) {
		this.programid = programid;
	}
	public Integer getSectorid() {
		return sectorid;
	}
	public void setSectorid(Integer sectorid) {
		this.sectorid = sectorid;
	}
	public Integer getVendorid() {
		return vendorid;
	}
	public void setVendorid(Integer vendorid) {
		this.vendorid = vendorid;
	}
	public Integer getServiceid() {
		return serviceid;
	}
	public void setServiceid(Integer serviceid) {
		this.serviceid = serviceid;
	}
	public Integer getProgram_id() {
		return program_id;
	}
	public void setProgram_id(Integer program_id) {
		this.program_id = program_id;
	}
	public Integer getSector_id() {
		return sector_id;
	}
	public void setSector_id(Integer sector_id) {
		this.sector_id = sector_id;
	}
	public Integer getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(Integer vendor_id) {
		this.vendor_id = vendor_id;
	}
	public Integer getPo_id() {
		return po_id;
	}
	public void setPo_id(Integer po_id) {
		this.po_id = po_id;
	}
	public String getAsset_name() {
		return asset_name;
	}
	public void setAsset_name(String asset_name) {
		this.asset_name = asset_name;
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
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSpecifications() {
		return specifications;
	}
	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	public Integer getLocation() {
		return location;
	}
	public void setLocation(Integer location) {
		this.location = location;
	}
	public String getInstallation_status() {
		return installation_status;
	}
	public void setInstallation_status(String installation_status) {
		this.installation_status = installation_status;
	}
	public Integer getInstallation_cost() {
		return installation_cost;
	}
	public void setInstallation_cost(Integer installation_cost) {
		this.installation_cost = installation_cost;
	}
	public String getFinancial_year() {
		return financial_year;
	}
	public void setFinancial_year(String financial_year) {
		this.financial_year = financial_year;
	}
	public Integer getPo_type() {
		return po_type;
	}
	public void setPo_type(Integer po_type) {
		this.po_type = po_type;
	}
	public Integer getP_type() {
		return p_type;
	}
	public void setP_type(Integer p_type) {
		this.p_type = p_type;
	}
	public String getVendor_comment() {
		return vendor_comment;
	}
	public void setVendor_comment(String vendor_comment) {
		this.vendor_comment = vendor_comment;
	}
	public Integer getOrder_no() {
		return order_no;
	}
	public void setOrder_no(Integer order_no) {
		this.order_no = order_no;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public Date getNeed_by_date() {
		return need_by_date;
	}
	public void setNeed_by_date(Date need_by_date) {
		this.need_by_date = need_by_date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAmount_words() {
		return amount_words;
	}
	public void setAmount_words(String amount_words) {
		this.amount_words = amount_words;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
	
	
	