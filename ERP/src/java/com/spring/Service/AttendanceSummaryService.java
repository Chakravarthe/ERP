package com.spring.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.spring.DAO.AttendanceSummaryDAO;
import com.spring.Model.AttendanceSummary;
import com.spring.Model.LeavesReport;             
 
@Service
public class AttendanceSummaryService {

	
	Response response = new Response();

	@Autowired
	private AttendanceSummaryDAO attendancesummarydao;
	
	public Response getsummary(AttendanceSummary report)
	{
		response.setSuccessful(false);
		Map<String, Object> list = attendancesummarydao.getsummary(report);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
	
}   
