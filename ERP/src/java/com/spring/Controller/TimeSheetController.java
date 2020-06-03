package com.spring.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;
import com.spring.Model.TimeSheet;
import com.spring.Service.TimeSheetService;

@RestController
@RequestMapping("/timesheet")         
public class TimeSheetController {

	@Autowired
	private TimeSheetService timesheetService;
	
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody TimeSheet timesheetModel)
	{
		return timesheetService.add(timesheetModel);
	}
	
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return timesheetService.getAll();
	}
	
	@ResponseBody
	@RequestMapping(value = "removeData", method = { RequestMethod.POST })
	public Response remove(@RequestBody String task)
	{
		return timesheetService.remove(task);
	}
	
	@ResponseBody
	@RequestMapping(value = "getById", method = { RequestMethod.POST })
	public Response getById(@RequestBody String task)
	{
		return timesheetService.getById(task);
	}
	@ResponseBody
	@RequestMapping(value = {"/getTeamSheets"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getTeamSheets(@RequestBody TimeSheet report)
	{
		return timesheetService.getTeamSheets(report);
	}
	@ResponseBody
	@RequestMapping(value = {"/getSheets1"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getSheets1(@RequestBody TimeSheet report1)
	{
		return timesheetService.getSheets1(report1);
	}
	@ResponseBody
	@RequestMapping(value = {"/getAttSheets"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAttSheets(@RequestBody TimeSheet report2)
	{
		return timesheetService.getAttSheets(report2);
	}
	@ResponseBody
	@RequestMapping(value = "getReportings", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getReportings()
	{
		return timesheetService.getReportings();
	}	
}
