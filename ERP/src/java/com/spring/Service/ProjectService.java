package com.spring.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.spring.DAO.ProjectDAO;
import com.spring.Model.Project;
import com.spring.Model.Sdeigroup;
import com.spring.Model.Employee;
import com.spring.Service.ProjectService;



@Service
public class ProjectService {
	
	Response response = new Response();

	@Autowired
	private ProjectDAO projectDAO;
	
	public Response getYears()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = projectDAO.getYears();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
	
	public Response getSchemes()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = projectDAO.getSchemes();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
	
	public Response getSdeis()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = projectDAO.getSdeis();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
	public Response add(Project Projectservice) {
		response.setSuccessful(false);
		projectDAO.add(Projectservice);
		response.setSuccessful(true);
		
		response.setResponseObject(Projectservice);
		return response;
	}
	
	public Response getAll()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = projectDAO.getAll();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getById(String project_name)
	{
		response.setSuccessful(false);
		Project singleuserdetails = projectDAO.getById(project_name);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response remove(String project_name)
	{
		response.setSuccessful(false);
		projectDAO.remove(project_name);
		response.setSuccessful(true);
		response.setResponseObject(project_name);
		return response;
	}
	
	public Response updateData(Project Projectservice)
	{
		response.setSuccessful(false);
		projectDAO.updateData(Projectservice);
		response.setSuccessful(true);
		response.setResponseObject(Projectservice);
		return response;
	}
	
	

}
