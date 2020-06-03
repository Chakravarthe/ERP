package com.spring.Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.text.ParseException;

import com.spring.Model.Attendance;
import com.spring.Model.Login;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

/*import commons.util.Base64;
import in.apssdc.security.model.Enquiry;
import in.apssdc.security.model.FileModel;
import in.apssdc.security.model.FilePathtoServer;*/
import com.spring.Service.AttendanceService;

@RestController
@RequestMapping({ "/attendance" })
public class AttendanceController {
	Response response = new Response();
	public static final String AUTH_KEY_FCM = "AAAAP4ondOo:APA91bFzqTDHTZ4QdKETWK0jzze0aX3cX1cEf3dxMLs-4hE-Tj1yZfT8AhpBMOmQdB64qgrfwIp7nL8oDa17AA-b3-sEAiTdbLJpOx2mVWd1qeVv3FtpMTIHGkgGjEyUadcJmz-w1r2E";
	public static final String API_URL_FCM = "https://fcm.googleapis.com/fcm/send";
	@Autowired
	private AttendanceService attendanceService;

	@ResponseBody
	@RequestMapping(value = { "getAppVersion" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST,
			org.springframework.web.bind.annotation.RequestMethod.GET })
	public Response getAppVersion() {
		return this.attendanceService.getAppVersion();
	}

	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "singleEmployee", method = { RequestMethod.POST })
	 * public Response singleEmployee(@RequestBody DateWiseAttendance locationWise)
	 * throws UnsupportedEncodingException, ParseException, JSONException { return
	 * attendanceService.singleEmployee(locationWise); }
	 */

	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "dateWise", method = { RequestMethod.POST }) public
	 * Response searchAttendance(@RequestBody DateWiseAttendance dateWiseAttendance)
	 * { return attendanceService.searchAttendance(dateWiseAttendance); }
	 */
	
	
	/* Getting details in Attendance Sheet 
	
	@ResponseBody
	@RequestMapping(value = "/getDetails", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDetails(@RequestBody Attendance attendance)
	{
		return attendanceService.getDetails(attendance);
	}*/
	
	
	

	@ResponseBody
	@RequestMapping(value = { "/savePresentEmployees" }, method = { RequestMethod.POST })
	public Response savePresentEmployees(@RequestBody Login login) throws ParseException {
		return attendanceService.savePresentEmployees(login);
	}
	@ResponseBody
	@RequestMapping(value = { "/updatePresentEmployees" }, method = { RequestMethod.POST })
	public Response updatePresentEmployees(@RequestBody Login login) throws ParseException {
		return attendanceService.updatePresentEmployees(login);
	}

	/*get attendance report*/
	@ResponseBody
	@RequestMapping(value = "getStaff", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAttendance()
	{
		return attendanceService.getStaff();
	}
	
	/*@ResponseBody
	  @RequestMapping(value={"getAttendance"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getById(@RequestBody String empid)
	  {
		
	    return this.attendanceService.getAttendance(empid);
	  } 
	
*/
	
	
	

	/*@ResponseBody
	@RequestMapping(value = "/getReport", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getReport(@RequestBody Attendance attendance)
	{
		return attendanceService.getReport(attendance);
	}
	*/
/*get dashboard login time*/
	
	@ResponseBody
	  @RequestMapping(value={"getdashboard"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getById(@RequestBody Login login)
	  {
		
	    return this.attendanceService.getdashboard(login);
	  } 
	 /*get dashboard login time*/
	/*@ResponseBody
	@RequestMapping(value = "getdashboard", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getdashboard()
	{
		return attendanceService.getdashboard();
	}
	*/
	/*@ResponseBody
	  @RequestMapping(value={"getdashboard"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getById(@RequestBody Login login)
	  {
		
	    return this.attendanceService.getdashboard(login);
	  } */
	
	/*myleavespage report*/
	@ResponseBody
	@RequestMapping(value = "getLeavesDetails", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLeavesDetails()
	{
		return attendanceService.getLeavesDetails();
	}
	
/* getting myteam leaves details based on from date,to date*/
	
	@ResponseBody
	@RequestMapping(value = {"/getMyTeamDetails"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getMyTeamDetails(@RequestBody Attendance attendance)
	{
		return attendanceService.getMyTeamDetails(attendance);
	}
	
	@ResponseBody
	@RequestMapping(value = "addcal", method = { RequestMethod.POST })
	public Response add(@RequestBody Attendance attendance)
	{
		return attendanceService.addcal(attendance);
	}
	
	
	/*get years*/
	@ResponseBody
	@RequestMapping(value = "getyears", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getyears()
	{
		return attendanceService.getyears();
	}
	
	
}
