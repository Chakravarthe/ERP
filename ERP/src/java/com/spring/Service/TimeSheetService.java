
package com.spring.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.spring.DAO.TimeSheetDAO;

import com.spring.Model.TimeSheet;

@Service
public class TimeSheetService {

	Response response = new Response();

	@Autowired
	private TimeSheetDAO timesheetDAO;

	public Response add(TimeSheet timesheetModel) {
		response.setSuccessful(false);
		timesheetDAO.add(timesheetModel);
		response.setSuccessful(true);
		response.setResponseObject(timesheetModel);
		return response;
	}

	public Response getAll() {
		response.setSuccessful(false);
		List<TimeSheet> userdetails = timesheetDAO.getAll();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}

	public Response remove(String task)
	{
		response.setSuccessful(false);
		timesheetDAO.remove(task);
		response.setSuccessful(true);
		response.setResponseObject(task);
		return response;
	}

	public Response getById(String task)
	{
		response.setSuccessful(false);
		TimeSheet singleuserdetails = timesheetDAO.getById(task);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}

	public Response getReportings()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = timesheetDAO.getReportings();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getTeamSheets(TimeSheet report)
	{
		response.setSuccessful(false);
		Map<String, Object> list = timesheetDAO.getTeamSheets(report);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getSheets1(TimeSheet report1)
	{
		response.setSuccessful(false);
		Map<String, Object> list = timesheetDAO.getSheets1(report1);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}

	public Response getAttSheets(TimeSheet report2)
	{
		response.setSuccessful(false);
		Map<String, Object> list = timesheetDAO.getAttSheets(report2);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
}
