package com.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;
import com.spring.Model.Employee;
import com.spring.Service.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	        
	@Autowired
	private EmployeeService employeeService;     
	
	                                                      
	
	 @ResponseBody
	  @RequestMapping(value={"getDetails"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getById(@RequestBody String empid)
	  {
		
	    return this.employeeService.getDetails(empid);  
	  }   
	 
	 /* HR profile details */
	 
	 @ResponseBody
	  @RequestMapping(value={"gethrDetails"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getById1(@RequestBody String empid)
	  {
		
	    return this.employeeService.gethrDetails(empid);  
	  } 
	                            
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody Employee employee)
	{
		System.out.println("hi");
		return employeeService.add(employee);
		       
	}
	
	/* Hr profile update method */
	
	@ResponseBody
	@RequestMapping(value = "add3", method = { RequestMethod.POST })
	public Response add3(@RequestBody Employee employee)
	{
		System.out.println("hi");
		return employeeService.add3(employee);
		       
	}
	
	@ResponseBody
	@RequestMapping(value = "add1", method = { RequestMethod.POST })
	public Response add1(@RequestBody Employee employee)
	{
		System.out.println("hi");
		return employeeService.add1(employee);
		       
	}
	
	/* inserting Employee education details */
	
	@ResponseBody
	@RequestMapping(value = "data", method = { RequestMethod.POST })
	public Response data(@RequestBody Employee employee)
	{
		System.out.println("hi");
		return employeeService.data(employee);
		       
	}
	
	/* Getting table data in education tab in employee profile */
	@ResponseBody
	@RequestMapping(value = "getById6", method = { RequestMethod.POST })
	public Response getById6(@RequestBody String empid)
	{
		return employeeService.getById6(empid);
	}
	
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return employeeService.getAll();
	}
	
	
	/*@ResponseBody
	@RequestMapping(value = "save", method = { RequestMethod.POST })
	public Response save(@RequestBody Employee employee)
	{
		System.out.println("hi");
		return employeeService.save(employee);
		       
	}*/
	
	@ResponseBody
	@RequestMapping(value = "getCaders", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCaders()
	{
		return employeeService.getCaders();
	}
	
	@ResponseBody
	@RequestMapping(value = "getRelations", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getRelations()
	{
		return employeeService.getRelations();
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getEmp", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getEmp()
	{
		return employeeService.getEmp();
	}
	
	@ResponseBody
	@RequestMapping(value = "getDistricts", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDistricts()
	{
		return employeeService.getDistricts();
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
	@RequestMapping(value = "getDivision", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDivision()
	{
		return employeeService.getDivision();
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getCost_center", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCost_center()
	{
		return employeeService.getCost_center();
	}
	
	@ResponseBody
	@RequestMapping(value = "getDesignation", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDesignation()
	{
		return employeeService.getDesignation();
	}
	
	
	/* Scheme, Project and Sector */
	
	@ResponseBody
	@RequestMapping(value = {"getSchemes"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getSchemes()
	{
		return employeeService.getSchemes();
	}
	
	@ResponseBody
	@RequestMapping(value = { "/getProjects" }, method = { RequestMethod.POST })
	public Response getProjects(@RequestBody String scheme_id)
	{
		return employeeService.getProjects(scheme_id);
	} 
	
	@ResponseBody
	@RequestMapping(value = {"getSectors"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getSectors()
	{
		return employeeService.getSectors();
	}
	
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "getSectors", method = { RequestMethod.POST,
	 * RequestMethod.GET }) public Response getSectors() { return
	 * employeeService.getSectors(); }
	 */
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = {"getProjects"}, method = { RequestMethod.POST,
	 * RequestMethod.GET }) public Response getProjects() { return
	 * employeeService.getProjects(); }
	 */
	
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = { "/getSectors" }, method = { RequestMethod.POST })
	 * public Response getSectors(@RequestBody Integer project_id) { return
	 * employeeService.getSectors(project_id); }
	 */
	
	
	/* Institute and qualification in update employee education tab(Employee login) */
	
	@ResponseBody
	@RequestMapping(value = {"getInstitutes"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getInstitutes()
	{
		return employeeService.getInstitutes();
	}
	
	@ResponseBody
	@RequestMapping(value = { "/getQualifications" }, method = { RequestMethod.POST })
	public Response getQualifications(@RequestBody Integer institute_id)
	{
		return employeeService.getQualifications(institute_id);
	}
	
	/* Inserting task in Time and Attendance sheet */
	@ResponseBody
	@RequestMapping(value = "add8", method = { RequestMethod.POST })
	public Response add8(@RequestBody Employee employee)
	{
		System.out.println("hi");
		return employeeService.add8(employee);
		       
	}
	
/* Getting locations in Employee Project Mapping */
	
	@ResponseBody
	@RequestMapping(value = "getLocations", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLocations()
	{   
		return employeeService.getLocations();
	}

	/* Getting Projects in Employee Project Mapping */
	
	@ResponseBody
	@RequestMapping(value = "getprojects", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getprojects()
	{
		return employeeService.getprojects();
	}

	/* Getting Reporting_to in Employee Project Mapping */
	
	@ResponseBody
	@RequestMapping(value = "getReporting", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getReporting()    
	{
		return employeeService.getReporting();
	}
	
	/* Getting data in table in project employee mapping */
	
	@ResponseBody
	@RequestMapping(value = {"/getprojectdata"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getprojectdata(@RequestBody Employee employee)
	{
		return employeeService.getprojectdata(employee);
	}
	
	/* Getting all employees of given location */
	
	@ResponseBody
	@RequestMapping(value = {"/getallemployees"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getallemployees(@RequestBody Employee employee)
	{
		return employeeService.getallemployees(employee);
	}
	
/* Getting data in employee project mapping */
	
	@ResponseBody
	@RequestMapping(value = {"/getempprojectdata"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getempprojectdata(@RequestBody Employee employee)
	{
		return employeeService.getempprojectdata(employee);   
	}   
	
	/* Getting data in pop up based on project name in employee project mapping */
	
	@ResponseBody
	@RequestMapping(value = "getByproject", method = { RequestMethod.POST })
	public Response getByproject(@RequestBody String project_name)
	{
		return employeeService.getByproject(project_name);
	}
	
	/* update data based on project_name in employee project mapping  */
	
	@ResponseBody
	@RequestMapping(value = "updateprojectdata", method = { RequestMethod.POST })
	public Response updateprojectdata(@RequestBody Employee employee)
	{
		return employeeService.updateprojectdata(employee);
	}
	
}             