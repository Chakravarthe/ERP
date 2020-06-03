package com.spring.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.spring.DAO.CreatePODAO;
import com.spring.Model.CreatePO;
import com.spring.Model.VendorService;



@Service
public class CreatePOService {
	
	Response response = new Response();

	@Autowired
	private CreatePODAO createPODAO;
	
	public Response getYears()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getYears();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getMonths()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getMonths();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getPurchaseOrderType()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getPurchaseOrderType();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getPurchaseType()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getPurchaseType();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getServices()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getServices();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getPrograms()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getPrograms();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getSectors()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getSectors();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getVendors()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getVendors();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getAssets()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getAssets();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getLocations()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getLocations();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response add(CreatePO createposervice) {
		response.setSuccessful(false);
		createPODAO.add(createposervice);
		response.setSuccessful(true);
		
		response.setResponseObject(createposervice);
		return response;
	}
	public Response getAll()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getAll();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getById(String createposervice)
	{
		response.setSuccessful(false);
		CreatePO singleuserdetails = createPODAO.getById(createposervice);
		response.setSuccessful(true);  
		response.setResponseObject(singleuserdetails);
		return response;
	}    
	public Response getGroups()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getGroups();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
    
	public Response submit(CreatePO createposervice) {
		response.setSuccessful(false);
		createPODAO.submit(createposervice);
		response.setSuccessful(true);
		
		response.setResponseObject(createposervice);
		return response;
	}
	
	public Response updateData(CreatePO createposervice)
	{
		response.setSuccessful(false);
		createPODAO.updateData(createposervice);
		response.setSuccessful(true);
		response.setResponseObject(createposervice);
		return response;
	}
	
	/* Required Position in Candidate Registration */
	
	public Response getPositions()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getPositions();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/*public Response add(VendorService vendorservice) {
		response.setSuccessful(false);
		vendorserviceDao.add(vendorservice);
		response.setSuccessful(true);
		
		response.setResponseObject(vendorservice);
		return response;
	}
	
	public Response getAll()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = vendorserviceDao.getAll();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getNameWiseData(VendorService vendorservice) {
		response.setSuccessful(false);
		List<VendorService> nameWiseData = vendorserviceDao.getNameWiseData(vendorservice);
		response.setSuccessful(true);
		response.setResponseObject(nameWiseData);
		return response;
	}  
	public Response getById(String vendorservice)
	{
		response.setSuccessful(false);
		VendorService singleuserdetails = vendorserviceDao.getById(vendorservice);
		response.setSuccessful(true);  
		response.setResponseObject(singleuserdetails);
		return response;
	}    

	public Response updateData(VendorService vendorservice)
	{
		response.setSuccessful(false);
		vendorserviceDao.updateData(vendorservice);
		response.setSuccessful(true);
		response.setResponseObject(vendorservice);
		return response;
	}*/
}
