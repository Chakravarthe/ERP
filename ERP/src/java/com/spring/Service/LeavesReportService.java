package com.spring.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.spring.DAO.LeavesReportDAO;
import com.spring.Model.LeavesReport;
import com.spring.Model.Sdeigroup;             
 
@Service
public class LeavesReportService {

	
	Response response = new Response();

	@Autowired
	private LeavesReportDAO leavesReportDao;
	
	public Response getleavesDetailedReport(LeavesReport report)
	{
		response.setSuccessful(false);
		Map<String, Object> list = leavesReportDao.getleavesDetailedReport(report);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
public Response getSummary1(LeavesReport report1)
	{
		response.setSuccessful(false);
		Map<String, Object> list = leavesReportDao.getSummary1(report1);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}

	
	public Response getLeaves()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = leavesReportDao.getLeaves();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
}
