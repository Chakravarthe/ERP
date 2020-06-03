package com.spring.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.spring.DAO.SchemeDAO;
import com.spring.Model.Scheme;
import com.spring.Model.Sdeigroup;




@Service
public class SchemeService {
	
	Response response = new Response();

	@Autowired
	private SchemeDAO schemeDAO;
	
	public Response getYears()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = schemeDAO.getYears();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getNames()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = schemeDAO.getNames();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
	public Response getSdeigroups()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = schemeDAO.getSdeigroups();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response add(Scheme schemeserviceModel) {
		response.setSuccessful(false);
		schemeDAO.add(schemeserviceModel);
		response.setSuccessful(true);
		
		response.setResponseObject(schemeserviceModel);
		return response;
	}
	public Response getById(String financial_year)
	{
		response.setSuccessful(false);
		Sdeigroup singleuserdetails = schemeDAO.getById(financial_year);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response remove(String financial_year)
	{
		response.setSuccessful(false);
		schemeDAO.remove(financial_year);
		response.setSuccessful(true);
		response.setResponseObject(financial_year);
		return response;
	}
	public Response getAll()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = schemeDAO.getAll();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response updateData(Scheme scheme)
	{
		response.setSuccessful(false);
		schemeDAO.updateData(scheme);    
		response.setSuccessful(true);
		response.setResponseObject(scheme);
		return response;
	}
	
	

}
