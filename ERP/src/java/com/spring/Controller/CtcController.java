package com.spring.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;      
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;

import com.spring.Model.Ctc;
import com.spring.Service.CtcService;
  


@RestController
@RequestMapping("/ctc")    
public class CtcController {

	@Autowired
	private CtcService ctcService;
	
	/*
	 @ResponseBody
	  @RequestMapping(value={"getDetails"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getDetails(@RequestBody String payname)
	  {
		
	    return this.ctcService.getDetails(payname);
	  }       
	
	
	*/
	
	
	
	
	
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody Ctc ctcModel)
	{
		return ctcService.add(ctcModel);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "add1", method = { RequestMethod.POST })
	public Response add1(@RequestBody Ctc ctcModel)
	{
		return ctcService.add1(ctcModel);
	}
	
	 
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return ctcService.getAll();
	}
	
	@ResponseBody
	@RequestMapping(value = "getEarnings", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getEarnings()
	{
		return ctcService.getEarnings();
	}   
	
	
	
	@ResponseBody
	@RequestMapping(value = "getDeductions", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDeductions()
	{
		return ctcService.getDeductions();
	}   
	
	
	
	
	@ResponseBody
	@RequestMapping(value = "getById", method = { RequestMethod.POST })
	public Response getById(@RequestBody String pname)  
	{
		return ctcService.getById(pname);
	}
	
	@ResponseBody
	@RequestMapping(value = "removeData", method = { RequestMethod.POST })
	public Response remove(@RequestBody String pname)
	{
		return ctcService.remove(pname);
	}
	
	
	
	@ResponseBody
	@RequestMapping(value = "updateData", method = { RequestMethod.POST })
	public Response updateData(@RequestBody Ctc ctc)
	{
		return ctcService.updateData(ctc);
	}}