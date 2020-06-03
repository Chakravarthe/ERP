
var report=angular.module('attendanceReportModule',[]);

report.controller('attendanceReportController',['$scope','$http',function($scope,$http){
	
	
	$http.get('/erp/Employee/getDepartment').then(function(response) {
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
	
	$http.get('/erp/Employee/getDesignation').then(function(response) {
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

	/* get attendence report */
	$http.get('/erp/attendance/getStaff').then(function(response) {
		$scope.data = response.data;
		
		if($scope.data.successful)
		{
			$scope.staffs = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});
	
	
	/*getting Employee name*/
	$http.get('/erp/Employee/getAll').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.regdetails = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});
	
	
}]);