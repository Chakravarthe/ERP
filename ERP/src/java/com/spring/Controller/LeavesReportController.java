package com.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;
import com.spring.Model.LeavesReport;
import com.spring.Service.LeavesReportService;

@RestController
@RequestMapping("/leavesreport")
public class LeavesReportController {
	@Autowired
	LeavesReportService leavesReportservice;
	@ResponseBody
	@RequestMapping(value = "getLeaves", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLeaves()
	{
		return leavesReportservice.getLeaves();
	}	
	
	
	@ResponseBody
	@RequestMapping(value = {"/getleavesDetailedReport"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getleavesDetailReport(@RequestBody LeavesReport report)
	{
		return leavesReportservice.getleavesDetailedReport(report);
	}
	@ResponseBody
	@RequestMapping(value = {"/getSummary1"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getSummary(@RequestBody LeavesReport report1)
	{
		return leavesReportservice.getSummary1(report1);
	}
	
}
