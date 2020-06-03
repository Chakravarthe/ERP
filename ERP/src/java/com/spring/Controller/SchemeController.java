package com.spring.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.andromeda.commons.model.Response;
import com.spring.Model.Scheme;

import com.spring.Service.SchemeService; 
@RestController
@RequestMapping("/scheme")
public class SchemeController {           
	@Autowired
	private SchemeService  schemeservice;     
	@ResponseBody
	@RequestMapping(value = "getYears", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getYears()
	{
		return schemeservice.getYears();
	}	
	/*names*/
	@ResponseBody
	@RequestMapping(value = "getNames", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getNames()
	{
		return schemeservice.getNames();
	}
	
	@ResponseBody
	@RequestMapping(value = "getSdeigroups", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getSdeigroups()
	{
		return schemeservice.getSdeigroups();
	}
	
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody Scheme schemeserviceModel)
	{
		System.out.println("hi");
		return schemeservice.add(schemeserviceModel);       
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return schemeservice.getAll();
	} 
	
	@ResponseBody
	@RequestMapping(value = "removeData", method = { RequestMethod.POST })
	public Response remove(@RequestBody String financial_year)
	{
		return schemeservice.remove(financial_year);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getById", method = { RequestMethod.POST })
	public Response getById(@RequestBody String financial_year)  
	{
		return schemeservice.getById(financial_year);
	}
	@ResponseBody
	@RequestMapping(value = "updateData", method = { RequestMethod.POST })
	public Response updateData(@RequestBody Scheme scheme)
	{
		
		return schemeservice.updateData(scheme);
	}
	
	
	
}             