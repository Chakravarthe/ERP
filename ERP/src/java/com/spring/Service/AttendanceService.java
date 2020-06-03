package com.spring.Service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
   
   
import com.spring.DAO.AttendanceDAO;
import com.spring.Model.Attendance;
/*
import in.apssdc.security.model.Attendance;
import in.apssdc.security.model.BiometricData;
import in.apssdc.security.model.Colleges;
import in.apssdc.security.model.DateWiseAttendance;
import in.apssdc.security.model.Employee;
import in.apssdc.security.model.Enquiry;
import in.apssdc.security.model.FilePathtoServer;*/
import com.spring.Model.Login;




@Service
public class AttendanceService   
{
  Response response = new Response();
  @Autowired
  private AttendanceDAO attendanceDAO;
  
  public Response getAppVersion()
  {
    this.response.setSuccessful(false);
    String version = this.attendanceDAO.getVersion();
    this.response.setSuccessful(true);
    this.response.setResponseObject(version);
    return this.response;
  }
  
  
  public Response savePresentEmployees(Login login) throws ParseException
	{
		response.setSuccessful(false);
		attendanceDAO.savePresentEmployees(login);
		response.setSuccessful(true);
		return response;
	}
  
  public Response updatePresentEmployees(Login login) throws ParseException
 	{
 		response.setSuccessful(false);
 		attendanceDAO.updatePresentEmployees(login);
 		response.setSuccessful(true);
 		return response;
 	}
  
  /*Myleaves page report*/
  public Response getLeavesDetails()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = attendanceDAO.getLeavesDetails();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
  
  /*get attendance report*/
	public Response getStaff()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = attendanceDAO.getStaff();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	 /*get dashboard login time*/
	  
	  public Response getdashboard(Login login)
	  {
	    this.response.setSuccessful(false);
	    Login singleuserdetails = this.attendanceDAO.getdashboard(login);
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	
	
	/* getting myteam leaves details based on from date,to date*/
	   public Response getMyTeamDetails(Attendance attendance)
		{
			response.setSuccessful(false);
			Map<String,Object> list = attendanceDAO.getMyTeamDetails(attendance);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	   
	   /*get years*/
	   public Response getyears()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = attendanceDAO.getyears();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	   
	   
	   public Response addcal(Attendance employee) {
			response.setSuccessful(false);
			 attendanceDAO.addcal(employee);
			response.setSuccessful(true);
			response.setResponseObject(employee);
			return response;
		}
	   
}
   