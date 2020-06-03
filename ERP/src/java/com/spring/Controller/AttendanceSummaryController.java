package com.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;
import com.spring.Model.AttendanceSummary;
import com.spring.Model.LeavesReport;
import com.spring.Service.AttendanceSummaryService;

@RestController
@RequestMapping("/attendancesummary")
public class AttendanceSummaryController {
	@Autowired
	AttendanceSummaryService attendancesummaryservice;
	
	@ResponseBody
	@RequestMapping(value = { "/getsummary"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getsummary(@RequestBody AttendanceSummary report)
	{
		return attendancesummaryservice.getsummary(report);
	}
	
}
