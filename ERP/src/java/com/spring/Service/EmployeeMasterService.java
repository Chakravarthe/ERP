package com.spring.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.spring.DAO.EmployeeMasterDAO;
import com.spring.Model.Employee;
import com.spring.Model.EmployeeMaster;


@Service
public class EmployeeMasterService {

	
	Response response = new Response();

	@Autowired
	private EmployeeMasterDAO employeeDao;
	
	
	public Response getNameWiseData(EmployeeMaster table) {
		response.setSuccessful(false);
		List<EmployeeMaster> nameWiseData = employeeDao.getNameWiseData(table);
		response.setSuccessful(true);
		response.setResponseObject(nameWiseData);
		return response;
	}  
	
	public Response search(EmployeeMaster employee) {
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.search(employee);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(list);
		return response;
	}
	
	public Response getAll()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getAll();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
/* update data based on empid in employee master */
	
	public Response getById(String empid)
	{
		response.setSuccessful(false);
		EmployeeMaster singleuserdetails = employeeDao.getById(empid);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}

	public Response updateData(EmployeeMaster employee)
	{
		response.setSuccessful(false);
		employeeDao.updateData(employee);
		response.setSuccessful(true);
		response.setResponseObject(employee);
		return response;
	}
	
	
	public Response getsearch(EmployeeMaster employee)
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getsearch(employee);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getCaders()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getCaders();
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
	
	public Response getDesignation()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getDesignation();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* create hiring request add method */
	
	public Response add(EmployeeMaster employee) {
		response.setSuccessful(false);
		employeeDao.add(employee);
		response.setSuccessful(true);
		response.setResponseObject(employee);
		return response;
	}
	
	/* candidate registration add1 method */
	
	/*
	 * public Response add1(EmployeeMaster employee) {
	 * response.setSuccessful(false); employeeDao.add1(employee);
	 * response.setSuccessful(true); response.setResponseObject(employee); return
	 * response; }
	 */
	
	public Response add1(EmployeeMaster employee) {
		response.setSuccessful(false);
		employeeDao.add1(employee);  
		response.setSuccessful(true);
		response.setResponseObject(employee);
		return response;
	}
	
	/* Getting details in table for hiring request */
	
	public Response hiringRequest()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.hiringRequest();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* Education and branch in candidate registration */
	
	public Response getEducations()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getEducations();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	  
	public Response getBranches(Integer education_id)
	{
		response.setSuccessful(false);
		List<EmployeeMaster> branches = employeeDao.getBranches(education_id);
		response.setSuccessful(true);
		response.setResponseObject(branches);
		return response;
	}
	
	/* getting details to front end in Select candidate */
	
	public Response getCandidates()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getCandidates();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* getting data in table for others in payslip */
	
	public Response getdetails(EmployeeMaster employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = employeeDao.getdetails(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
	}
	
	/* Getting employee type for attendance sheet */
	
	public Response getStaff()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getStaff();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* Search bar in Hiring request */
	
	/*
	 * public Response getHiringsearch(EmployeeMaster employee) {
	 * response.setSuccessful(false); List<Map<String, Object>> list =
	 * employeeDao.getHiringsearch(employee); response.setSuccessful(true);
	 * response.setResponseObject(list); return response; }
	 */
	
/* Getting data in My Timesheet page */
	
	public Response getdata(EmployeeMaster employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = employeeDao.getdata(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
	} 
	
	/* Getting data based on empid in my timesheet view and edit button */
		
	public Response getByIddata(String task)
	{
		response.setSuccessful(false);
		EmployeeMaster singleuserdetails = employeeDao.getByIddata(task);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
/* Removing data based on task in my timesheet page */
	
	public Response remove(String task)
	{
		response.setSuccessful(false);
		employeeDao.remove(task);
		response.setSuccessful(true);
		response.setResponseObject(task);
		return response;
	}
	
	/* Updating data based on task in my timesheet page */
	
	public Response updatedata(EmployeeMaster employee)
	{
		response.setSuccessful(false);
		employeeDao.updatedata(employee);
		response.setSuccessful(true);
		response.setResponseObject(employee);
		return response;
	}
	
	/*Getting leavetype*/
	public Response getLeavetype()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getLeavetype();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/*Getting reporing*/
	
	public Response getReporting(String empid)
	  {
	    this.response.setSuccessful(false);
	    EmployeeMaster singleuserdetails = this.employeeDao.getReporting(empid);
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	/*create apply leave*/
	public Response addEmp(EmployeeMaster employee) {
		response.setSuccessful(false);
		 employeeDao.addEmp(employee);
		response.setSuccessful(true);
		response.setResponseObject(employee);
		return response;
	}
	
}
