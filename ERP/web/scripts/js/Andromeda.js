var Andromeda = {

	showPage : function(path, targetDiv) {
		var jqxhr = jQuery.post(path, function(data) {
			jQuery("#" + targetDiv).html(data);
		});
	},
	
	showcreatescheme:function(){
		var path = "/erp/html/operationadmin/createscheme.html";
		Andromeda.showPage(path, "instructions");
	},
	showcreatesdeigroup:function(){
		var path = "/erp/html/operationadmin/createsdeigroup.html";
		Andromeda.showPage(path, "instructions");
	},
	showcreateproject:function(){
		var path = "/erp/html/operationadmin/createproject.html";
		Andromeda.showPage(path, "instructions");
	},
	showcreatesector:function(){      
		var path = "/erp/html/operationadmin/createsector.html";
		Andromeda.showPage(path, "instructions");
	},
	
	showPayslip: function() {           
		var path = "/erp/html/AdminController/payslip.html";   
		Andromeda.showPage(path, "instructions");
	}, 
	
	showCreateCTCCal : function() {  
		var path = "/erp/html/CTC/createctccal.html";
		Andromeda.showPage(path, "instructions");
	},
	
	showhrprofile : function() {  
		var path = "/erp/html/hrms/hrprofile.html";
		Andromeda.showPage(path, "instructions");
	},
	    
	
	showctccalculator:function(){
		var path = "/erp/html/CTC/ctc.html";
		Andromeda.showPage(path, "instructions");
	},
	showcreateprogram:function(){
		var path = "/erp/html/operationadmin/createprogram.html";   
		Andromeda.showPage(path, "instructions");
	},
	
	showHomePage : function() {  
		var path = "/erp/html/hrms/home.html";
		Andromeda.showPage(path, "mainDiv");
	},     
	showCreateEmployeePage : function() {  
		var path = "/erp/html/hrms/createEmployee.html";
		Andromeda.showPage(path, "instructions");
	},
	showProjectEmployeemappingpage : function() {  
		var path = "/erp/html/Employeeemployeeselfservieces/projectemployeemapping.html";
		Andromeda.showPage(path, "instructions");
	},
	
	showHrEmployeePage : function() {  
		var path = "/erp/html/hrms/hrEmployee.html";
		Andromeda.showPage(path, "instructions");
	},
	showLoginPage : function() {  
		var path = "/erp/html/login.html";
		Andromeda.showPage(path, "mainDiv");
	},
	showEmployeeHomePage : function() {  
		var path = "/erp/html/hrms/home.html";     
		Andromeda.showPage(path, "mainDiv");
	},  
	showAdminHomePage : function() {  
		var path = "/erp/html/admin/adminhome.html";
		Andromeda.showPage(path, "mainDiv");
	},
	   
	showHRHomePage : function() {        
		var path = "/erp/html/hrms/HRhome.html";     
		Andromeda.showPage(path, "mainDiv");
	},
	showlogincredentialsPage : function() {  
		var path = "/erp/html/admin/logincreation.html";
		Andromeda.showPage(path, "replaceDiv");      
	},     
	 showAttendanceSheet : function() {  
		var path = "/erp/html/attendance/attendanceSheet.html";
		Andromeda.showPage(path, "instructions");
	},
	
	showAttendanceReport : function() {  
		var path = "/erp/html/attendance/attendanceReport.html";
		Andromeda.showPage(path, "instructions");
	},
	    
	showAttendanceUpdate: function() {  
		var path = "/erp/html/attendance/attendanceUpdate.html";   
		Andromeda.showPage(path, "instructions");
	},
	
	showLeaveReport: function() {  
		var path = "/erp/html/attendance/leavesReport.html";   
		Andromeda.showPage(path, "instructions");     
	},
	showVendorCreation: function() {  
		var path = "/erp/html/vendor/vendorcre.html";   
		Andromeda.showPage(path, "instructions");
	},    
	showVendorApprove: function() {  
		var path = "/erp/html/vendor/vendorapp.html";   
		Andromeda.showPage(path, "instructions");
	},
	
	showUploadEmployee: function() {  
		var path = "/erp/html/hrms/uploademployee.html";   
		Andromeda.showPage(path, "instructions");
	},
	showNatureService: function() {  
		var path = "/erp/html/vendor/vendorservices.html";   
		Andromeda.showPage(path, "instructions");
	},
	showEmployeeMaster: function() {  
		var path = "/erp/html/hrms/employeemaster.html";   
		Andromeda.showPage(path, "instructions");
	},  
	
	showCreateGRN: function() {  
		var path = "/erp/html/Assets/grn.html";   
		Andromeda.showPage(path, "instructions");
	},  
	showAssetDetails: function() {  
		var path = "/erp/html/Assets/assetsdetails.html";        
		Andromeda.showPage(path, "instructions");       
	}, 
	showAssetRequest: function() {  
		var path = "/erp/html/Assets/assetreq.html";   
		Andromeda.showPage(path, "instructions");
	}, 
	showAssetRequestList: function() {  
		var path = "/erp/html/Assets/Asset Request List.html";   
		Andromeda.showPage(path, "instructions");
	}, 
	showAssetInvoiceSubmission: function() {  
		var path = "/erp/html/Assets/assetinvoice.html";   
		Andromeda.showPage(path, "instructions");
	}, 
	showGRNList: function() {  
		var path = "/erp/html/Assets/GrnList.html";   
		Andromeda.showPage(path, "instructions");
	},        
	showAssetsDetailReport: function() {             
		var path = "/erp/html/Assets/assetdet.html";   
		Andromeda.showPage(path, "instructions");
	}, 
	showFixedAssetsConsolidation: function() {  
		var path = "/erp/html/Assets/fixedasset.html";   
		Andromeda.showPage(path, "instructions");
	},      
	showPOGRN: function() {           
		var path = "/erp/html/Assets/pogrn.html";   
		Andromeda.showPage(path, "instructions");
	}, 
	
	generatepayroll: function() {           
		var path = "/erp/html/Payroll/generatepayroll.html";   
		Andromeda.showPage(path, "instructions");
	},
	payrollsummary: function() {           
		var path = "/erp/html/Payroll/payrollsummary.html";   
		Andromeda.showPage(path, "instructions");
	},
	paymentsummary: function() {           
		var path = "/erp/html/Payroll/paymentsummary.html";   
		Andromeda.showPage(path, "instructions");
	},
	
	bankstatement: function() {           
		var path = "/erp/html/Payroll/bankstatement.html";   
		Andromeda.showPage(path, "instructions");
	},
	payrollnotefile: function() {           
		var path = "/erp/html/Payroll/payrollnotefile.html";   
		Andromeda.showPage(path, "instructions");
	},
	payrollreconciliation: function() {   
		var path = "/erp/html/po/createPO.html";   
		Andromeda.showPage(path, "instructions");
	},
	lopadjustments: function() {           
		var path = "/erp/html/Payroll/lopadjustments.html";   
		Andromeda.showPage(path, "instructions");
	},
	employeestopsalary: function() {           
		var path = "/erp/html/Payroll/employeestopsalary.html";   
		Andromeda.showPage(path, "instructions");
	},
	deputationemployee: function() {           
		var path = "/erp/html/po/createPO.html";   
		Andromeda.showPage(path, "instructions");
	},
	
	
	
	
	showCreatePO: function() {           
		var path = "/erp/html/po/createPO.html";   
		Andromeda.showPage(path, "instructions");
	}, 

	showPOList: function() {           
		var path = "/erp/html/po/POList.html";   
		Andromeda.showPage(path, "instructions");
	}, 

	/*Employee selfservices*/
	
	showRecruitments: function() {           
		var path = "/erp/html/Employeeselfservices/recruitments.html";   
		Andromeda.showPage(path, "instructions");
	},
	showEmployeedashboard: function() {           
		var path = "/erp/html/Employeeselfservices/employeedashboard.html";   
		Andromeda.showPage(path, "instructions");
	},
	showTimeandattendance: function() {           
		var path = "/erp/html/Employeeselfservices/timeandattendance.html";   
		Andromeda.showPage(path, "instructions");
	},
	showLeavemanagement: function() {           
		var path = "/erp/html/Employeeselfservices/leavemanagement.html";   
		Andromeda.showPage(path, "instructions");
	},
	showOndutyrequest: function() {           
		var path = "/erp/html/Employeeselfservices/ondutyrequest.html";   
		Andromeda.showPage(path, "instructions");
	},
	showOntravelrequest: function() {           
		var path = "/erp/html/Employeeselfservices/ontravelrequest.html";   
		Andromeda.showPage(path, "instructions");
	},
	showItsavings: function() {           
		var path = "/erp/html/Employeeselfservices/itsavings.html";   
		Andromeda.showPage(path, "instructions");
	},
	showHelpdesk: function() {           
		var path = "/erp/html/Employeeselfservices/helpdesk.html";   
		Andromeda.showPage(path, "instructions");
	},
	showHRpolicies: function() {           
		var path = "/erp/html/Employeeselfservices/hrpolicies.html";   
		Andromeda.showPage(path, "instructions");
	},
	showEmployeedirectory: function() {           
		var path = "/erp/html/Employeeselfservices/employeedirectory.html";   
		Andromeda.showPage(path, "instructions");
	},
	showViewpayslip: function() {           
		var path = "/erp/html/Employeeselfservices/viewpayslip.html";   
		Andromeda.showPage(path, "instructions");
	},
	
	showcandidateregistration: function() {           
		var path = "/erp/html/Employeeselfservices/candidateregistration.html";   
		Andromeda.showPage(path, "instructions");
	},
	
	showEmployeeprojectmapping: function() {           
		var path = "/erp/html/Employeeselfservices/employeeprojectmapping.html";   
		Andromeda.showPage(path, "instructions");
	},
	showEexit: function() {           
		var path = "/erp/html/Employeeselfservices/eexit.html";   
		Andromeda.showPage(path, "instructions");
	},
	showEperform: function() {           
		var path = "/erp/html/Employeeselfservices/eperform.html";   
		Andromeda.showPage(path, "instructions");
	},
	showCreateHiringrequest: function() {           
		var path = "/erp/html/Employeeselfservices/CreatingHiringRequest.html";   
		Andromeda.showPage(path, "instructions");
	},
	showHiringrequest: function() {           
		var path = "/erp/html/Employeeselfservices/Hiringrequest.html";   
		Andromeda.showPage(path, "instructions");
	},
	showApprovals: function() {           
		var path = "/erp/html/Employeeselfservices/approvals.html";   
		Andromeda.showPage(path, "instructions");
	},
	showScorecandidate: function() {           
		var path = "/erp/html/Employeeselfservices/ScoreCandidate.html";   
		Andromeda.showPage(path, "instructions");
	},
	showAttendancepage: function() {           
		var path = "/erp/html/Employeeselfservices/AttendanceandTimeSheet.html";   
		Andromeda.showPage(path, "instructions");
	},
	showTimesheet: function() {           
		var path = "/erp/html/Employeeselfservices/MyTimeSheets.html";   
		Andromeda.showPage(path, "instructions");
	},
	showAttendancesummary: function() {           
		var path = "/erp/html/Employeeselfservices/AttendanceSummaryGraph.html";   
		Andromeda.showPage(path, "instructions");
	},
	showApplyleave: function() {           
		var path = "/erp/html/Employeeselfservices/applyleave.html";   
		Andromeda.showPage(path, "instructions");
	},
	showMyleaves: function() {           
		var path = "/erp/html/Employeeselfservices/myleaves.html";   
		Andromeda.showPage(path, "instructions");
	},
	showLeavestatus: function() {           
		var path = "/erp/html/Employeeselfservices/leavestatus.html";   
		Andromeda.showPage(path, "instructions");
	},
	
	showIexit: function() {           
		var path = "/erp/html/Employeeselfservices/iexit.html";   
		Andromeda.showPage(path, "instructions");
	},
	showExitemployeereport: function() {           
		var path = "/erp/html/Employeeselfservices/exitemployeereport.html";   
		Andromeda.showPage(path, "instructions");     
	},
	
	showselectcandidate: function() {           
		var path = "/erp/html/Employeeselfservices/selectcandidates.html";   
		Andromeda.showPage(path, "instructions");
	},
	
	/*showtrackinterviewstatus: function() {           
		var path = "/erp/html/Employeeselfservices/trackinterviewstatus.html";   
		Andromeda.showPage(path, "instructions");
	},*/
	
	/* employee employee self servieces */
	   
	showAttendanceandTimesheetpage: function() {           
		var path = "/erp/html/Employeeemployeeselfservieces/attendanceandtimesheet.html";   
		Andromeda.showPage(path, "instructions");
	},     
	
	showMyTimesheet: function() {           
		var path = "/erp/html/Employeeemployeeselfservieces/mytimesheet.html";   
		Andromeda.showPage(path, "instructions");
	},
	
	showAttendancesummaryGraph: function() {           
		var path = "/erp/html/Employeeemployeeselfservieces/attendancesummarygraph.html";   
		Andromeda.showPage(path, "instructions");
	},

	showApplyleavePage: function() {           
		var path = "/erp/html/Employeeemployeeselfservieces/applyleave.html";   
		Andromeda.showPage(path, "instructions");
	},
	
	showLeavestatusPage: function() {           
		var path = "/erp/html/Employeeemployeeselfservieces/leavestatus.html";   
		Andromeda.showPage(path, "instructions");
	},
	
	showMyleavesPage: function() {           
		var path = "/erp/html/Employeeemployeeselfservieces/myleaves.html";   
		Andromeda.showPage(path, "instructions");   
	},

	showondutyrequestpage: function() {           
		var path = "/erp/html/Employeeemployeeselfservieces/onduetyrequest.html";   
		Andromeda.showPage(path, "instructions");   
	},
	
	showontravelrequestpage: function() {           
		var path = "/erp/html/Employeeemployeeselfservieces/ontravelrequest.html";   
		Andromeda.showPage(path, "instructions");   
	},
	   
	showhelpdeskpage: function() {           
		var path = "/erp/html/Employeeemployeeselfservieces/helpdesk.html";   
		Andromeda.showPage(path, "instructions");   
	},
	
	showhrpoliciespages: function() {           
		var path = "/erp/html/Employeeemployeeselfservieces/hrpolicies.html";   
		Andromeda.showPage(path, "instructions");   
	},
	 
	showemployeedirectorypage: function() {           
		var path = "/erp/html/Employeeemployeeselfservieces/employeedirectory.html";   
		Andromeda.showPage(path, "instructions");   
	},
	 
	showviewpayslip: function() {           
		var path = "/erp/html/Employeeemployeeselfservieces/viewpayslip.html";   
		Andromeda.showPage(path, "instructions");   
	},
	
	showemployeeprojectmappingpage: function() {           
		var path = "/erp/html/Employeeemployeeselfservieces/employeeprojectmapping.html";   
		Andromeda.showPage(path, "instructions");   
	},

	showIExitpage: function() {           
		var path = "/erp/html/Employeeemployeeselfservieces/iexit.html";   
		Andromeda.showPage(path, "instructions");   
	},
	
	showexitemployeereportpage: function() {           
		var path = "/erp/html/Employeeemployeeselfservieces/exitemployeereport.html";   
		Andromeda.showPage(path, "instructions");   
	},  
	showMyTeamLeaves:function() {  
		var path = "/erp/html/Managerselfservices/Myteamleaves.html";
		Andromeda.showPage(path, "instructions");
	},
	showCalendarPage: function() {           
		var path = "/erp/html/attendance/calendar.html";   
		Andromeda.showPage(path, "instructions");
	},
	
	
	
	
	                   
	setSessionValue : function(key, value) {   
		sessionStorage.setItem(key, value);
	},

	getSessionValue : function(key) {
		return sessionStorage.getItem(key);
	},

	removeSessionValue : function(key) {
		sessionStorage.removeItem(key);    
	},

	showError : function(errorMessage) {
		var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"
				+ errorMessage + "</div>";
		jQuery("#errorDiv").html(message);
	},                       
                                                         
	logout : function() {
		
		var employeeid = Andromeda.getSessionValue("employeeid") || "";
		Andromeda.setSessionValue("email", null);
		Andromeda.setSessionValue("password", null);
		Andromeda.setSessionValue("roleid", null);
		Andromeda.setSessionValue("username", null);
		Andromeda.post('/erp/login/logout', employeeid);
		Andromeda.setSessionValue("employeeid", null);
		Andromeda.showLoginPage();
	},

	post : function(url, data) {
		var responseData = null;
         
		jQuery.ajax({
			url : url,
			type : 'post',
			data : JSON.stringify(data), // Stringified Json Object
			dataType : 'json',
			async : false, // Cross-domain requests and dataType: "jsonp"
			// requests do not support synchronous operation
			cache : false, // This will force requested pages not to be cached
			// by the browser
			processData : false, // To avoid making query String instead of
			// JSON
			contentType : "application/json; charset=utf-8",
			success : function(data) {
				responseData = data;
			}
		});

		return responseData;
	},

	isUserLoggedIn : function() {
		
		var email = Andromeda.getSessionValue("email") || "";
		var password = Andromeda.getSessionValue("password") || "";
		var roleid = Andromeda.getSessionValue("roleid") || "";
		var username = Andromeda.getSessionValue("username") || "";
		var employeeid = Andromeda.getSessionValue("employeeid") || "";
		var login = {
			email : email,
			password : password,   
			roleid : roleid,
			username:username,
			employeeid : employeeid,
		};    
   
		return Andromeda.post('/erp/login/loggedin', login) || false;
	}  	
};
