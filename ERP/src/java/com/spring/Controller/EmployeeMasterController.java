package com.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;
import com.spring.Model.EmployeeMaster;
import com.spring.Service.EmployeeMasterService;

@RestController
@RequestMapping("/Employee")
public class EmployeeMasterController {
	@Autowired
	EmployeeMasterService employeeService;
	
	@ResponseBody              
	@RequestMapping(value = "getNameWiseData", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getNameWiseData(@RequestBody EmployeeMaster table)
	{
			return employeeService.getNameWiseData(table);
	}
	
	@ResponseBody
	@RequestMapping(value = "search", method = { RequestMethod.POST })
	public Response search(@RequestBody EmployeeMaster employee)
	{
		return employeeService.search(employee);
		       
	}
	
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return employeeService.getAll();
	}
	
/* updating data based on empid in employee master */
	
	@ResponseBody
	@RequestMapping(value = "getById", method = { RequestMethod.POST })
	public Response getById(@RequestBody String empid)
	{
		return employeeService.getById(empid);
	}
	
	@ResponseBody
	@RequestMapping(value = "updateData", method = { RequestMethod.POST })
	public Response updateData(@RequestBody EmployeeMaster employee)
	{
		return employeeService.updateData(employee);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getsearch", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getsearch(@RequestBody EmployeeMaster Data)
	{
		return employeeService.getsearch(Data);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getCaders", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCaders()
	{
		return employeeService.getCaders();
	}
	

	@ResponseBody
	@RequestMapping(value = "getGrades", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getGrades()
	{
		return employeeService.getGrades();
	}
	   
	@ResponseBody
	@RequestMapping(value = "getDepartment", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDepartment()
	{
		return employeeService.getDepartment();
	}
	
	@ResponseBody
	@RequestMapping(value = "getDesignation", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDesignation()
	{
		return employeeService.getDesignation();
	}
	
	/* create hiring request add method */
	
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody EmployeeMaster employee)
	{
		return employeeService.add(employee);
	}
	
	/* getting details in table for hiring request */
	
	@ResponseBody
	@RequestMapping(value = "hiringRequest", method = { RequestMethod.POST, RequestMethod.GET })
	public Response hiringRequest()
	{
		return employeeService.hiringRequest();
	}
	
	
	
	
	@ResponseBody
	@RequestMapping(value = "add1", method = { RequestMethod.POST })
	public Response add1(@RequestBody EmployeeMaster employee)
	{
		return employeeService.add1(employee);
	}
	
	/* Education and branches in candidate registration */
	
	@ResponseBody
	@RequestMapping(value = {"getEducations"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getEducations()
	{
		return employeeService.getEducations();
	}
	
	@ResponseBody
	@RequestMapping(value = { "/getBranches" }, method = { RequestMethod.POST })
	public Response getBranches(@RequestBody Integer education_id)
	{
		return employeeService.getBranches(education_id);
	}
	
	
	/* Getting Details to the front end in "Select Candidate" */
	
	@ResponseBody
	@RequestMapping(value = "getCandidates", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCandidates()
	{
		return employeeService.getCandidates();
	}	
	
	/* Getting staff in payslip */
	
	@ResponseBody
	@RequestMapping(value = "getStaff", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getStaff()
	{
		return employeeService.getStaff();
	}
	
	/* Getting Data in table for Others in payslip */
	
	@ResponseBody
	@RequestMapping(value = {"/getdetails"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getdetails(@RequestBody EmployeeMaster employee)
	{
		return employeeService.getdetails(employee);
	}
	
	/* Hiring Request Search Bar */
	
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "getHiringsearch", method = { RequestMethod.POST,
	 * RequestMethod.GET }) public Response getHiringsearch(@RequestBody
	 * EmployeeMaster Data) { return employeeService.getHiringsearch(Data); }
	 */
	
/* Getting data in Mytimesheets */
	
	@ResponseBody
	@RequestMapping(value = {"/getdata"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getdata(@RequestBody EmployeeMaster employee)
	{
		return employeeService.getdata(employee);
	}
	
	/* Getting data based on empid in my timesheet view and edit button */
	
	@ResponseBody
	@RequestMapping(value = "getByIddata", method = { RequestMethod.POST })
	public Response getByIddata(@RequestBody String task)
	{
		return employeeService.getByIddata(task);
	}
	
/* Removing data based on task in my timesheet page */
	
	@ResponseBody
	@RequestMapping(value = "removedata", method = { RequestMethod.POST })
	public Response remove(@RequestBody String task)
	{
		return employeeService.remove(task);
	}
	
	/* Updating data based on task in my timesheet page */
	
	@ResponseBody
	@RequestMapping(value = "updatedata", method = { RequestMethod.POST })
	public Response updatedata(@RequestBody EmployeeMaster employee)
	{
		return employeeService.updatedata(employee);
	}
	
	/*Getting leavetype*/
	@ResponseBody
	@RequestMapping(value = "getLeavetype", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLeavetype()
	{
		return employeeService.getLeavetype();
	}
	
	/*Getting reporting*/
	
	@ResponseBody
	  @RequestMapping(value={"getReporting"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getById1(@RequestBody String empid)
	  {
		
	    return this.employeeService.getReporting(empid);
	  } 
	
	/*create apply leave*/

	 @ResponseBody
		@RequestMapping(value = "addEmp", method = { RequestMethod.POST })
		public Response addEmp(@RequestBody EmployeeMaster employee)
		{
			return employeeService.addEmp(employee);
		}
	 
	

	
}
