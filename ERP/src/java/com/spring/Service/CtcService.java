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
import com.spring.DAO.CtcDAO;
import com.spring.Model.Ctc;

@Service
public class CtcService {
	@Autowired
	private CtcDAO ctcDAO;

	Response response = new Response();
	
	
	/* public Response getDetails(String payname)
	  {
	    this.response.setSuccessful(false);
	    Ctc singleuserdetails = this.ctcDAO.getDetails(payname);
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	*/
	public Response add1(Ctc ctcModel) {
		response.setSuccessful(false);
		ctcDAO.add1(ctcModel);
		response.setSuccessful(true);
		response.setResponseObject(ctcModel);
		return response;
	}
	
	
	
	
	
	
	
	public Response add(Ctc ctcModel) {
		response.setSuccessful(false);
		ctcDAO.add(ctcModel);
		response.setSuccessful(true);
		response.setResponseObject(ctcModel);
		return response;
	}
	public Response getById(String pname)
	{
		response.setSuccessful(false);
		Ctc singleuserdetails = ctcDAO.getById(pname);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response getAll() {
		response.setSuccessful(false);
		List<Ctc> userdetails = ctcDAO.getAll();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}

	public Response getEarnings() {
		response.setSuccessful(false);
		List<Ctc> userdetails = ctcDAO.getEarnings();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}

	
	public Response getDeductions() {
		response.setSuccessful(false);
		List<Ctc> regdetails = ctcDAO.getDeductions();
		response.setSuccessful(true);
		response.setResponseObject(regdetails);
		return response;
	}

	
	
	public Response remove(String pname)   
	{
		response.setSuccessful(false);
		ctcDAO.remove(pname);
		response.setSuccessful(true);
		response.setResponseObject(pname);
		return response;
	}

	
	public Response updateData(Ctc ctc)
	{
		response.setSuccessful(false);
		ctcDAO.updateData(ctc);
		response.setSuccessful(true);
		response.setResponseObject(ctc);
		return response;
	}
	                  
}