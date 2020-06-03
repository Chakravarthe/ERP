package com.spring.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.andromeda.commons.model.Response;
import com.spring.Model.Program;

import com.spring.Service.ProgramService;
 
@RestController
@RequestMapping("/program")
public class ProgramController {           
	@Autowired
	private ProgramService  programservice;     
	
	
	@ResponseBody
	@RequestMapping(value = "getProjects", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getProjects()
	{
		return programservice.getProjects();
	}
	@ResponseBody
	@RequestMapping(value = "getSegments", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getSegments()
	{
		return programservice.getSegments();
	}
	
	@ResponseBody
	@RequestMapping(value = "getSectors", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getSectors()
	{
		return programservice.getSectors();
	}
	
	@ResponseBody
	@RequestMapping(value = "getDistricts", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDsitricts()
	{
		return programservice.getDistricts();
	}
	@ResponseBody
	@RequestMapping(value = "getGroups", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getGroups()
	{
		return programservice.getGroups();
	}
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody Program programserviceModel)
	{
		System.out.println("hi");
		return programservice.add(programserviceModel);       
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return programservice.getAll();
	} 
	
	/*names*/
	@ResponseBody
	@RequestMapping(value = "getNames", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getNames()
	{
		return programservice.getNames();
	}
	@ResponseBody
	@RequestMapping(value = "removeData", method = { RequestMethod.POST })
	public Response remove(@RequestBody String program_name)
	{
		return programservice.remove(program_name);
	}
	@ResponseBody
	@RequestMapping(value = "getById", method = { RequestMethod.POST })
	public Response getById(@RequestBody String program_name)  
	{
		return programservice.getById(program_name);
	}
	@ResponseBody
	@RequestMapping(value = "updateData", method = { RequestMethod.POST })
	public Response updateData(@RequestBody Program programserviceModel)
	{
		
		return programservice.updateData(programserviceModel);
	}
	
	
}             