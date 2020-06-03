package com.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;
import com.spring.Model.Calc;
import com.spring.Model.Ctc;
import com.spring.Model.EmployeeMaster;
import com.spring.Service.CalcService;

@RestController
@RequestMapping("/calc")
public class CalcController {   
	@Autowired
	CalcService calcservice;
	
	
	
/*	@ResponseBody              
	@RequestMapping(value = "getPayNameData", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getPayNameData(@RequestBody Calc table)
	{
			return calcservice.getPayNameData(table);
	}
	*/
	
	@ResponseBody
	@RequestMapping(value = { "/getById"}, method = { RequestMethod.POST,RequestMethod.GET })
	public Response getById(@RequestBody String name)  
	{
		return this.calcservice.getById(name);
		
	}
	
	@ResponseBody
	@RequestMapping(value = "getPayname", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getPayname()
	{
		return calcservice.getPayname();
	}

	
	
	
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })          
	public Response add(@RequestBody Calc calcModel)
	{
		return calcservice.add(calcModel);
	}
	 
	
	
	
	
	
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return calcservice.getAll();
	}
	
	
	
	
	
	
     
	@ResponseBody
	@RequestMapping(value = "getAll1", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll1()
	{
		return calcservice.getAll1();
	}
	
	
	
	
	
	
	
	@ResponseBody
	@RequestMapping(value = "getGrades", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getGrades()
	{
		return calcservice.getGrades();
	}
	
	@ResponseBody
	@RequestMapping(value = "getYears", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getYears()
	{
		return calcservice.getYears();   
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getCaders", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCaders()
	{
		return calcservice.getCaders();
	}
	

	
	
	
}
