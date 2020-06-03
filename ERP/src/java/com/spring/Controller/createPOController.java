package com.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;
import com.spring.Model.CreatePO;
import com.spring.Model.VendorService;
import com.spring.Service.CreatePOService;

  
@RestController
@RequestMapping("/purchase")
public class createPOController {   
	
	        
	@Autowired
	private CreatePOService  createPOservice;     
	
	@ResponseBody
	@RequestMapping(value = "getYears", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getYears()
	{
		return createPOservice.getYears();
	}
	
	@ResponseBody
	@RequestMapping(value = "getMonths", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getMonths()
	{
		return createPOservice.getMonths();
	}
	
	@ResponseBody
	@RequestMapping(value = "getPurchaseOrderType", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getPurchaseOrderType()
	{
		return createPOservice.getPurchaseOrderType();
	}
	@ResponseBody
	@RequestMapping(value = "getPurchaseType", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getPurchaseType()
	{
		return createPOservice.getPurchaseType();
	}
	
	@ResponseBody
	@RequestMapping(value = "getServices", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getServices()
	{
		return createPOservice.getServices();
	}
	@ResponseBody
	@RequestMapping(value = "getPrograms", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getPrograms()
	{
		return createPOservice.getPrograms();
	}
	
	@ResponseBody
	@RequestMapping(value = "getSectors", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getSectors()
	{
		return createPOservice.getSectors();
	}
	@ResponseBody
	@RequestMapping(value = "getVendors", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getVendors()
	{
		return createPOservice.getVendors();
	}
	@ResponseBody
	@RequestMapping(value = "getAssets", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAssets()
	{
		return createPOservice.getAssets();
	}
	
	@ResponseBody
	@RequestMapping(value = "getLocations", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLocations()
	{
		return createPOservice.getLocations();
	}
	
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody CreatePO createposervice)
	{
		System.out.println("hi");
		return createPOservice.add(createposervice);
		       
	}
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return createPOservice.getAll();
	} 
	
	
	@ResponseBody
	@RequestMapping(value = "getById", method = { RequestMethod.POST })
	public Response getById(@RequestBody String createposervice)
	{
		
		return createPOservice.getById(createposervice);
	}
	@ResponseBody
	@RequestMapping(value = "getGroups", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getGroups()
	{
		return createPOservice.getGroups();
	}
	@ResponseBody
	@RequestMapping(value = "submit", method = { RequestMethod.POST })
	public Response submit(@RequestBody CreatePO createposervice)
	{
		System.out.println("hi");
		return createPOservice.submit(createposervice);
		       
	}
	
	@ResponseBody
	@RequestMapping(value = "updateData", method = { RequestMethod.POST })
	public Response updateData(@RequestBody CreatePO createposervice)
	{
		
		return createPOservice.updateData(createposervice);
	}
	
	/* Required Positions in Candidate Registration */
	
	@ResponseBody
	@RequestMapping(value = "getPositions", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getPositions()
	{
		return createPOservice.getPositions();
	}
	
	
	
	/*@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody VendorService vendorservice)
	{
		System.out.println("hi");
		return VendorServiceService.add(vendorservice);
		       
	}
	
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCaders()
	{
		return VendorServiceService.getAll();
	}  
	
	@ResponseBody              
	@RequestMapping(value = "getNameWiseData", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getNameWiseData(@RequestBody VendorService vendorservice)
	{
			return VendorServiceService.getNameWiseData(vendorservice);
	}
	
	@ResponseBody
	@RequestMapping(value = "getById", method = { RequestMethod.POST })
	public Response getById(@RequestBody String vendorservice)
	{
		
		return VendorServiceService.getById(vendorservice);
	}
	@ResponseBody
	@RequestMapping(value = "updateData", method = { RequestMethod.POST })
	public Response updateData(@RequestBody VendorService vendorservice)
	{
		
		return VendorServiceService.updateData(vendorservice);
	}
	
	
	*/
}             