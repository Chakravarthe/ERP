package com.spring.Service;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.andromeda.commons.model.Response;
import com.andromeda.commons.security.model.Employee;
import com.andromeda.commons.security.model.Login;
import com.andromeda.commons.util.IDGenerator;
import com.spring.DAO.SdeigroupDAO;
import com.spring.Model.Sdeigroup;

@Service
public class SdeigroupService {
	@Autowired
	private SdeigroupDAO sdeigroupDAO;

	Response response = new Response();
	public Response add(Sdeigroup sdeigroupModel) {
		response.setSuccessful(false);
		sdeigroupDAO.add(sdeigroupModel);
		response.setSuccessful(true);
		response.setResponseObject(sdeigroupModel);
		return response;
	}
	public Response getById(String sdeigroup_number)
	{
		response.setSuccessful(false);
		Sdeigroup singleuserdetails = sdeigroupDAO.getById(sdeigroup_number);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response getAll() {
		response.setSuccessful(false);
		List<Sdeigroup> userdetails = sdeigroupDAO.getAll();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}

	public Response remove(String sdeigroup_number)
	{
		response.setSuccessful(false);
		sdeigroupDAO.remove(sdeigroup_number);
		response.setSuccessful(true);
		response.setResponseObject(sdeigroup_number);
		return response;
	}

	
	public Response updateData(Sdeigroup sdeigroup)
	{
		response.setSuccessful(false);
		sdeigroupDAO.updateData(sdeigroup);
		response.setSuccessful(true);       
		response.setResponseObject(sdeigroup);
		return response;
	}
	                 
}