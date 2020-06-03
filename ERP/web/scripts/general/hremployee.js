var hrRegister = angular.module('hremployee', []);

/*employeeRegister.directive('datepicker', function () {
    return {
    	 restrict: 'A',
         require: 'ngModel',
          link: function (scope, element, attrs) {
             $(element).datepicker({
             	maxDate : new Date,
     			changeMonth : true,
     			changeYear : true,   
     			dateFormat : 'dd-mm-yy',
     			yearRange : '-50:+0',
                 onSelect: function (date) {
                     scope.dob = date;
                     scope.$apply();
                }
            });
        }
    };      
});
*/

/*//Get Data from Database based on Name    
$scope.getById = function(Data){
Data.institutioncode = Andromeda.getSessionValue("instituteid");
Data.courseid = Andromeda.getSessionValue("courseshortname");
$http.post('/ccic/Table/getById',Data).then(function (response) {
    $scope.data13 = response.data;
    if ($scope.data13.successful) {
        $scope.data = {object:$scope.data13.responseObject};
    } else {
    	//alert("Error while getting data");
    	console.log("error")
       
    }
}, function (errResponse) {
   console.error('Error while fetching notes');    
});   
};                                           
*/

hrRegister.controller('hrController', ['$http','$scope', function($http, $scope) {
	
	
	      	 var empid = Andromeda.getSessionValue("employeeid");
	    	 console.log("empid " +empid);   
	     $http.post('/erp/employee/getDetails',empid).then(function (response) {
		    $scope.data13 = response.data;
		    if ($scope.data13.successful) {
		        $scope.data2 = {object:$scope.data13.responseObject};
		        console.log("Successful");
		    } else {
		    	//alert("Error while getting data");
		    	console.log("error")                             
		       
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
		       
	    	
	
	
	
	/*var a = Andromeda.getSessionValue("employeeid");
	 alert(a);
	 $http.post('/erp/employee/getDetails', a).then(function(response) {
			$scope.data = response.data;
			if($scope.data.successful)
			{
				console.log("Successful");
				$scope.data = {object:$scope.data.responseObject};
			}
			else
			{                                    
				console.log("NOT Successful");
				console.log("Client error while getting data");
			}
		},
		function(response)
		{
			console.log("Server error while getting data");
		});
	*/
	/*$scope.personaldata = function(UserData) {
		
		if(UserData == undefined)
		{
			swal("OOPS!","Fill all details","info");
		}
		else if(UserData.title == null || UserData.title == undefined || UserData.title == "")
		{
			swal("Oops...","Enter Title","info");
		}
		else if(UserData.first_name == null || UserData.first_name == undefined || UserData.first_name == "")
		{
			swal("Oops...","Enter First Name","info");
		}
		else if(UserData.last_name == null || UserData.last_name == undefined || UserData.last_name == "")
		{
			swal("Oops...","Enter Last Name","info");
		}
		else if(UserData.mobile == null || UserData.mobile == undefined || UserData.mobile == "")
		{
			swal("Oops...","Enter Phone Number","info");
		}
		else if(UserData.email == null || UserData.email == undefined || UserData.email == "")
		{
			swal("Oops...","Enter Email","info");
		}
		else if(UserData.company_email == null || UserData.company_email == undefined || UserData.company_email == "")
		{
			swal("Oops...","Enter Company Email","info");
		}
		else if(UserData.caderid == null || UserData.caderid == undefined || UserData.caderid == "")
		{
			swal("Oops...","Enter Cader","info");
		}
		else if(UserData.gradeid == null || UserData.gradeid == undefined || UserData.gradeid == "")
		{
			swal("Oops...","Enter Grade","info");
		}
		else if(UserData.joining_date == null || UserData.joining_date == undefined || UserData.joining_date == "")
		{
			swal("Oops...","Enter Joining Date","info");
		}
		else if(UserData.confirmed_date == null || UserData.confirmed_date == undefined || UserData.confirmed_date == "")
		{
			swal("Oops...","Enter Confirmed Date","info");
		}
		else if(UserData.contract_from == null || UserData.contract_from == undefined || UserData.contract_from == "")
		{
			swal("Oops...","Enter Contract From","info");
		}
		else if(UserData.contract_to == null || UserData.contract_to == undefined || UserData.contract_to == "")
		{
			swal("Oops...","Enter Contract To","info");
		}
		else if(UserData.relieved_date == null || UserData.relieved_date == undefined || UserData.relieved_date == "")
		{
			swal("Oops...","Enter Relieved Date","info");
		}
		else if(UserData.departmentid == null || UserData.departmentid == undefined || UserData.departmentid == "")
		{
			swal("Oops...","Enter Department","info");
		}
		else if(UserData.designationid == null || UserData.designationid == undefined || UserData.designationid == "")
		{
			swal("Oops...","Enter Designation","info");
		}
		else if(UserData.divisionid == null || UserData.divisionid == undefined || UserData.divisionid == "")
		{
			swal("Oops...","Enter Division","info");
		}
		else if(UserData.cost_centerid == null || UserData.cost_centerid == undefined || UserData.cost_centerid == "")
		{
			swal("Oops...","Enter Cost Center","info");
		}
		else if(UserData.reporting_to == null || UserData.reporting_to == undefined || UserData.reporting_to == "")
		{
			swal("Oops...","Enter Reporting To","info");
		}
		else if(UserData.notice_period == null || UserData.notice_period == undefined || UserData.notice_period == "")
		{
			swal("Oops...","Enter Notice Period","info");
		}
		else if(UserData.alternate_mobile == null || UserData.alternate_mobile == undefined || UserData.alternate_mobile == "")
		{
			swal("Oops...","Enter Alternate Mobile Number","info");
		}
		else if(UserData.dob == null || UserData.dob == undefined || UserData.dob == "")
		{
			swal("Oops...","Enter Date Of Birth","info");
		}
		else if(UserData.gender == null || UserData.gender == undefined || UserData.gender == "")
		{
			swal("Oops...","Enter Gender","info");
		}
		else if(UserData.aadhaar == null || UserData.aadhaar == undefined || UserData.aadhaar == "")
		{
			swal("Oops...","Enter Aadhaar","info");
		}
		else if(UserData.passport == null || UserData.passport == undefined || UserData.passport == "")
		{
			swal("Oops...","Enter Passport Number","info");
		}
		else if(UserData.nationality == null || UserData.nationality == undefined || UserData.nationality == "")
		{
			swal("Oops...","Enter Nationality","info");
		}
		else if(UserData.nativity == null || UserData.nativity == undefined || UserData.nativity == "")
		{
			swal("Oops...","Enter Nativity","info");
		}
		else if(UserData.caste == null || UserData.caste == undefined || UserData.caste == "")
		{
			swal("Oops...","Enter Caste","info");
		}
		else if(UserData.sub_caste == null || UserData.sub_caste == undefined || UserData.sub_caste == "")
		{
			swal("Oops...","Enter Sub Caste","info");
		}
		else if(UserData.blood_group == null || UserData.blood_group == undefined || UserData.blood_group == "")
		{
			swal("Oops...","Enter Blood Group","info");
		}
		else if(UserData.emergency_name == null || UserData.emergency_name == undefined || UserData.emergency_name == "")
		{
			swal("Oops...","Enter Emergency Name","info");
		}
		else if(UserData.emergency_contact == null || UserData.emergency_contact == undefined || UserData.emergency_contact == "")
		{
			swal("Oops...","Enter Emergency Contact","info");
		}
		else if(UserData.relation == null || UserData.relation == undefined || UserData.relation == "")
		{
			swal("Oops...","Enter Relation","info");
		}
		else if(UserData.pincode == null || UserData.pincode == undefined || UserData.pincode == "")
		{
			swal("Oops...","Enter Pincode","info");
		}
		else if(UserData.dno == null || UserData.dno == undefined || UserData.dno == "")
		{
			swal("Oops...","Enter Door Number","info");
		}
		else if(UserData.street == null || UserData.street == undefined || UserData.street == "")
		{
			swal("Oops...","Enter Street","info");
		}
		else if(UserData.village == null || UserData.village == undefined || UserData.village == "")
		{
			swal("Oops...","Enter Village","info");
		}
		else if(UserData.mandal == null || UserData.mandal == undefined || UserData.mandal == "")
		{
			swal("Oops...","Enter Mandal","info");
		}
		else if(UserData.districtid == null || UserData.districtid == undefined || UserData.districtid == "")
		{
			swal("Oops...","Enter District","info");
		}
		else if(UserData.state == null || UserData.state == undefined || UserData.state == "")
		{
			swal("Oops...","Enter State","info");
		}
		else if(UserData.bank_acno == null || UserData.bank_acno == undefined || UserData.bank_acno == "")
		{
			swal("Oops...","Enter Bank Account Number","info");
		}
		else if(UserData.bank_name == null || UserData.bank_name == undefined || UserData.bank_name == "")
		{
			swal("Oops...","Enter Bank Name","info");
		}
		else if(UserData.brach == null || UserData.brach == undefined || UserData.brach == "")
		{
			swal("Oops...","Enter Branch","info");
		}
		else if(UserData.ifsc_code == null || UserData.ifsc_code == undefined || UserData.ifsc_code == "")
		{
			swal("Oops...","Enter IFSC Code","info");
		}
		else if(UserData.pan_name == null || UserData.pan_name == undefined || UserData.pan_name == "")
		{
			swal("Oops...","Enter Name as like on PAN","info");
		}
		else if(UserData.pan_no == null || UserData.pan_no == undefined || UserData.pan_no == "")
		{
			swal("Oops...","Enter PAN Number","info");
		}
		else if(UserData.esi_no == null || UserData.esi_no == undefined || UserData.esi_no == "")
		{
			swal("Oops...","Enter Esi  Number","info");
		}
		else if(UserData.uan_no == null || UserData.uan_no == undefined || UserData.uan_no == "")
		{
			swal("Oops...","Enter UAN Number","info");
		}
		else if(UserData.pf_no == null || UserData.pf_no == undefined || UserData.pf_no == "")
		{
			swal("Oops...","Enter PF Number","info");
		}
		else if(UserData.company_name == null || UserData.company_name == undefined || UserData.company_name == "")
		{
			swal("Oops...","Enter Company Name","info");
		}
		else if(UserData.designation == null || UserData.designation == undefined || UserData.designation == "")
		{
			swal("Oops...","Enter Designation","info");
		}
		else if(UserData.from_date == null || UserData.from_date == undefined || UserData.from_date == "")
		{
			swal("Oops...","Enter From Date","info");
		}
		else if(UserData.to_date == null || UserData.to_date == undefined || UserData.to_date == "")
		{
			swal("Oops...","Enter TO Date","info");
		}
		else if(UserData.document_name == null || UserData.document_name == undefined || UserData.document_name == "")
		{
			swal("Oops...","Enter Document Name","info");
		}
		else if(UserData.esi_no == null || UserData.esi_no == undefined || UserData.esi_no == "")
		{
			swal("Oops...","Enter ESI Number","info");
		}
		else if(UserData.consent == null || UserData.consent == undefined || UserData.consent == "")
		{
			swal("Oops...","Enter Consent","info");
		}
		else if(UserData.name == null || UserData.name == undefined || UserData.name == "")
		{
			swal("Oops...","Enter Relation Name","info");
		}
		else if(UserData.dob1 == null || UserData.dob1 == undefined || UserData.dob1 == "")
		{
			swal("Oops...","Enter Date Of Birth","info");
		}
		else if(UserData.relationid == null || UserData.relationid == undefined || UserData.relationid == "")
		{
			swal("Oops...","Select Relation Type","info");
		}                 
		else
		{
         UserData.empid = Andromeda.getSessionValue("employeeid");
         console.log(UserData.empid);
		$http.post('/erp/employee/add',UserData).then(
				function(response) {    
					$scope.data = response.data;      
					if ($scope.data.successful) {
			    		$("#com").show(); 
						alert("User Data Inserted Successfully");
					} else {
						alert("Data not inserted");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		}
	};*/
	
	$scope.hrdata = function(UserData) {
		if(UserData == undefined)
		{
			swal("OOPS!","Fill all details","info");
		}
		else if(UserData.title == null || UserData.title == undefined || UserData.title == "")
		{
			swal("Oops...","Enter Title","info");
		}
		else if(UserData.first_name == null || UserData.first_name == undefined || UserData.first_name == "")
		{
			swal("Oops...","Enter First Name","info");
		}
		else if(UserData.last_name == null || UserData.last_name == undefined || UserData.last_name == "")
		{
			swal("Oops...","Enter Last Name","info");
		}
		else if(UserData.mobile == null || UserData.mobile == undefined || UserData.mobile == "")
		{
			swal("Oops...","Enter Phone Number","info");
		}
		else if(UserData.email == null || UserData.email == undefined || UserData.email == "")
		{
			swal("Oops...","Enter Email","info");
		}
		else if(UserData.company_email == null || UserData.company_email == undefined || UserData.company_email == "")
		{
			swal("Oops...","Enter Company Email","info");
		}
		else if(UserData.caderid == null || UserData.caderid == undefined || UserData.caderid == "")
		{
			swal("Oops...","Enter Cader","info");
		}
		else if(UserData.gradeid == null || UserData.gradeid == undefined || UserData.gradeid == "")
		{
			swal("Oops...","Enter Grade","info");
		}
		else if(UserData.joining_date == null || UserData.joining_date == undefined || UserData.joining_date == "")
		{
			swal("Oops...","Enter Joining Date","info");
		}
		else if(UserData.confirmed_date == null || UserData.confirmed_date == undefined || UserData.confirmed_date == "")
		{
			swal("Oops...","Enter Confirmed Date","info");
		}
		else if(UserData.contract_from == null || UserData.contract_from == undefined || UserData.contract_from == "")
		{
			swal("Oops...","Enter Contract From","info");
		}
		else if(UserData.contract_to == null || UserData.contract_to == undefined || UserData.contract_to == "")
		{
			swal("Oops...","Enter Contract To","info");
		}
		else if(UserData.departmentid == null || UserData.departmentid == undefined || UserData.departmentid == "")
		{
			swal("Oops...","Enter Department","info");
		}
		else if(UserData.designationid == null || UserData.designationid == undefined || UserData.designationid == "")
		{
			swal("Oops...","Enter Designation","info");
		}
		else if(UserData.divisionid == null || UserData.divisionid == undefined || UserData.divisionid == "")
		{
			swal("Oops...","Enter Division","info");
		}
		/*else if(UserData.cost_centerid == null || UserData.cost_centerid == undefined || UserData.cost_centerid == "")
		{
			swal("Oops...","Enter Cost Center","info");
		}*/
		else if(UserData.reporting == null || UserData.reporting == undefined || UserData.reporting == "")
		{
			swal("Oops...","Enter Reporting Manager","info");
		}
		else if(UserData.notice_period == null || UserData.notice_period == undefined || UserData.notice_period == "")
		{
			swal("Oops...","Enter Notice Period","info");
		}
		else if(UserData.id == null || UserData.id == undefined || UserData.id == "")
		{
			swal("Oops...","Enter Location","info");
		}
		else if(UserData.bank_acno == null || UserData.bank_acno == undefined || UserData.bank_acno == "")
		{
			swal("Oops...","Enter Account Number","info");
		}
		else if(UserData.bank_name == null || UserData.bank_name == undefined || UserData.bank_name == "")
		{
			swal("Oops...","Enter Bank Name","info");
		}
		else if(UserData.brach == null || UserData.brach == undefined || UserData.brach == "")
		{
			swal("Oops...","Enter Branch of Bank","info");
		}
		else if(UserData.ifsc_code == null || UserData.ifsc_code == undefined || UserData.ifsc_code == "")
		{
			swal("Oops...","Enter IFSC Code","info");
		}
		else if(UserData.pan_no == null || UserData.pan_no == undefined || UserData.pan_no == "")
		{
			swal("Oops...","Enter PAN Number","info");
		}
		else if(UserData.ctc == null || UserData.ctc == undefined || UserData.ctc == "")
		{
			swal("Oops...","Enter CTC","info");
		}
		else   
		{
		$http.post('/erp/employee/add1',UserData).then(  
				function(response) {    
					$scope.data = response.data;        
					if ($scope.data.successful) {
			    		/*	$("#com").show(); */
						alert("User Data Inserted Successfully");
					} else {
						alert("Data not inserted");    
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		}
	};
	
	
	$http.get('/erp/employee/getCaders').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.caders = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");
		}
	},
	function(response)
	{
		console.log("Server error while getting data");
	});
	
	
	$http.get('/erp/employee/getGrades').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.grades = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");
		}
	},
	function(response)
	{
		console.log("Server error while getting data");
	});
	
	$http.get('/erp/employee/getDepartment').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.departments = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");
		}
	},
	function(response)
	{
		console.log("Server error while getting data");
	});
	
	$http.get('/erp/employee/getRelations').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.relations = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");
		}
	},
	function(response)
	{
		console.log("Server error while getting data");
	});
	
	$http.get('/erp/employee/getDistricts').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.districts = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");
		}
	},
	function(response)
	{
		console.log("Server error while getting data");
	});
	
	/* Getting Locations */
	
	$http.get('/erp/employee/getLocations').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.locations = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");    
		}
	},
	function(response)
	{
		console.log("Server error while getting data");    
	});
	
	/* Getting reporting to */
	$http.get('/erp/employee/getReporting').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.reporting = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");    
		}
	},
	function(response)
	{
		console.log("Server error while getting data");
	});
	
	$http.get('/erp/employee/getDesignation').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.designations = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");
		}
	},
	function(response)
	{
		console.log("Server error while getting data");
	});
	
	$http.get('/erp/employee/getDivision').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.divisions = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");
		}
	},
	function(response)
	{
		console.log("Server error while getting data");
	});
	
	$http.get('/erp/employee/getCost_center').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.cost_centers = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");    
		}
	},
	function(response)
	{
		console.log("Server error while getting data");
	});
	    
	
	$scope.comm = function() {
		$("#com").show();
	
	}	 
} ]);