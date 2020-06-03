package com.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;

import com.spring.Service.POListService;


@RestController
@RequestMapping("/polist")
public class POListController {   
	
	        
	@Autowired
	private POListService POListService;  
	
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCaders()
	{
		return POListService.getAll();
	}
	
	@ResponseBody
	@RequestMapping(value = "getAll3", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll3()
	{
		return POListService.getAll3();
	}
	
	@ResponseBody
	@RequestMapping(value = "getAll1", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll1()
	{
		return POListService.getAll1();
	}
}