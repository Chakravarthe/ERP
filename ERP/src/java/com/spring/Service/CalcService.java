package com.spring.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.andromeda.commons.model.Response;
import com.spring.DAO.CalcDAO;
import com.spring.Model.Calc;
import com.spring.Model.Ctc;
import com.spring.Model.Employee;
import com.spring.Model.EmployeeMaster;
import com.spring.Model.VendorService;



@Service
public class CalcService {
	
	Response response = new Response();

	@Autowired
	private CalcDAO calcDAO;
	
	
	/*public Response getPayNameData(Calc table) {
		response.setSuccessful(false);
		List<Calc> paySlipData = calcDAO.getPayNameData(table);
		response.setSuccessful(true);
		response.setResponseObject(paySlipData);
		return response;
	}  
	
	
	*/
	
	
	
	
	
	
	
	
	
	public Response getYears()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = calcDAO.getYears();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getCaders()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = calcDAO.getCaders();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getGrades()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = calcDAO.getGrades();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	/*public Response add(Calc calcserviceModel) {
		response.setSuccessful(false);
		calcDAO.add(calcserviceModel);
		response.setSuccessful(true);
		response.setResponseObject(calcserviceModel);
		return response;
	}
	*/
	public Response getAll() {
		response.setSuccessful(false);
		List<Calc> userdetails = calcDAO.getAll();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	
	
	public Response getAll1() {
		response.setSuccessful(false);
		List<Calc> userdetails = calcDAO.getAll1();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}    
	
	
	public Response add(Calc calcModel) {
		response.setSuccessful(false);
		calcDAO.add(calcModel);
		response.setSuccessful(true);
		response.setResponseObject(calcModel);
		return response;
	}
	
	
	
	
	public Response getById(String name)
	{
		this.response.setSuccessful(false);
		Calc singleuserdetails = this.calcDAO.getById(name);
		this.response.setSuccessful(true);
		this.response.setResponseObject(singleuserdetails);   
		return this.response;
	}
	
	   
	
	public Response getPayname() {
		response.setSuccessful(false);
		List<Calc> userdetails1 = calcDAO.getPayname();
		response.setSuccessful(true);
		response.setResponseObject(userdetails1);
		return response;
	}
	
	
	/*public Response getById(String calcservice)
	{
		response.setSuccessful(false);
		Calc singleuserdetails = calcDAO.getById(calcservice);
		response.setSuccessful(true);  
		response.setResponseObject(singleuserdetails);
		return response;
	}    
	*/
    
	
	
	/*public Response updateData(Calc calcserviceModel)
	{
		response.setSuccessful(false);
		calcDAO.updateData(calcserviceModel);
		response.setSuccessful(true);
		response.setResponseObject(calcserviceModel);
		return response;
	}*/
	
	
}
