package com.spring.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.spring.DAO.EmployeeDao;

import com.spring.Model.Employee;




@Service
public class EmployeeService {
	
	Response response = new Response();

	@Autowired
	private EmployeeDao employeeDao;
	
	 public Response getDetails(String empid)
	  {
	    this.response.setSuccessful(false);
	    Employee singleuserdetails = this.employeeDao.getDetails(empid);
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	 
	 /* hr profile details */
	 
	 public Response gethrDetails(String empid)
	  {
	    this.response.setSuccessful(false);
	    Employee singleuserdetails = this.employeeDao.gethrDetails(empid);
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	
	
	
	/*public Response getDetails(String empid)
	{
		response.setSuccessful(false);
		//System.out.println("empoid Service: " + empid);
		List<Map<String, Object>> list = employeeDao.getDetails(empid);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;   
	}
	*/
	public Response add(Employee employee) {
		response.setSuccessful(false);
		employeeDao.add(employee);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(employee);
		return response;
	}
	
	/* HR profile update */
	
	public Response add3(Employee employee) {
		response.setSuccessful(false);
		employeeDao.add3(employee);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(employee);
		return response;
	}
	
	public Response add1(Employee employee) {
		response.setSuccessful(false);
		employeeDao.add1(employee);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(employee);
		return response;
	}
	
	/* Inserting employee education details */
	
	public Response data(Employee employee) {
		response.setSuccessful(false);
		employeeDao.data(employee);
		response.setSuccessful(true);
		System.out.println("hi13");
		response.setResponseObject(employee);
		return response;
	}
	
	/* Getting table data in education tab in employee profile */
	public Response getById6(String empid)
	{
		response.setSuccessful(false);
		Employee singleuserdetails = employeeDao.getById6(empid);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	public Response getAll() {
		response.setSuccessful(false);  
		List<Employee> userdetails = employeeDao.getAll();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	
	/*public Response save(Employee employee) {
		response.setSuccessful(false);
		employeeDao.save(employee);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(employee);
		return response;
	}*/
	     
	public Response getCaders()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getCaders();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getRelations()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getRelations();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getDistricts()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getDistricts();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getEmp()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getEmp();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getGrades()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getGrades();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getDepartment()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getDepartment();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getDivision()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getDivision();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getCost_center()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getCost_center();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getDesignation()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getDesignation();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
	/* Scheme, project and Sector */
	
	public Response getSchemes()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getSchemes();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getProjects(String scheme_id)
	{
		response.setSuccessful(false);
		List<Employee> projects = employeeDao.getProjects(scheme_id);
		response.setSuccessful(true);
		response.setResponseObject(projects);
		return response;
	}
	
	public Response getSectors()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getSectors();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/*
	 * public Response getSectors() { response.setSuccessful(false);
	 * List<Map<String, Object>> list = employeeDao.getSectors();
	 * response.setSuccessful(true); response.setResponseObject(list); return
	 * response; }
	 */
	
	/*
	 * public Response getProjects() { response.setSuccessful(false);
	 * List<Map<String, Object>> list = employeeDao.getProjects();
	 * response.setSuccessful(true); response.setResponseObject(list); return
	 * response; }
	 */
	  
	/*
	 * public Response getSectors(Integer project_id) {
	 * response.setSuccessful(false); List<Employee> sectors =
	 * employeeDao.getSectors(project_id); response.setSuccessful(true);
	 * response.setResponseObject(sectors); return response; }
	 */
	
	/* Institute and qualification in update employee education tab(Employee login) */
	
	public Response getInstitutes()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getInstitutes();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getQualifications(Integer institute_id)
	{
		response.setSuccessful(false);
		List<Employee> qualifications = employeeDao.getQualifications(institute_id);
		response.setSuccessful(true);
		response.setResponseObject(qualifications);
		return response;
	}

	/* inserting task in time and attendance sheet */
	
	public Response add8(Employee employee) {
		response.setSuccessful(false);
		employeeDao.add8(employee);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(employee);
		return response;
	}
	
/* Getting Locations in Employee project Mapping */
	
	public Response getLocations()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getLocations();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* Getting Projects in employee Project Mapping */
	
	public Response getprojects()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getprojects();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* Getting reporting to in employee project mapping */
	
	public Response getReporting()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getReporting();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* Getting data in project employee mapping */
	
	  public Response getprojectdata(Employee employee) {
	  response.setSuccessful(false);
	  Map<String, Object> data = employeeDao.getprojectdata(employee);
	  response.setResponseObject(data);
	  response.setSuccessful(true);
	  return response;
	  }  
	  
	  /* Getting all employees of given location */
		
	  public Response getallemployees(Employee employee) {
	  response.setSuccessful(false);
	  Map<String, Object> data = employeeDao.getallemployees(employee);
	  response.setResponseObject(data);
	  response.setSuccessful(true);
	  return response;
	  } 
	  
	  /* getting data in employee project mapping */
		
	  public Response getempprojectdata(Employee employee) {
	  response.setSuccessful(false);
	  Map<String, Object> data = employeeDao.getempprojectdata(employee);
	  response.setResponseObject(data);
	  response.setSuccessful(true);
	  return response;   
	  }  
	  
	  /* getting data in pop up based on project name */
	  
	  public Response getByproject(String project_name)
		{
			response.setSuccessful(false);
			Employee singleuserdetails = employeeDao.getByproject(project_name);
			response.setSuccessful(true);
			response.setResponseObject(singleuserdetails);
			return response;
		}
	  
	  /* update data based on project_name in employee project mapping */
	  
	  public Response updateprojectdata(Employee employee)
		{
			response.setSuccessful(false);
			employeeDao.updateprojectdata(employee);
			response.setSuccessful(true);
			response.setResponseObject(employee);
			return response;
		}
	
}
