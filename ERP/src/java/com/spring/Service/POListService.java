package com.spring.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.spring.DAO.POListDAO;

@Service
public class POListService {
	
	Response response = new Response();

	@Autowired
	private POListDAO polistDao;
	
	
	public Response getAll()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = polistDao.getAll();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getAll1()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = polistDao.getAll1();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getAll3()
	{  
		response.setSuccessful(false);
		List<Map<String, Object>> list = polistDao.getAll3();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
}