var employee = angular.module('attendancesummarygraph', []);
employee.controller('AttendanceSummary',['$scope','$http',function($scope,$http)
	{
	
	
	/* Getting details to table based on from and to date */
	$scope.getReport=function(data){
		console.log(data);   
		var details={
				fromdate:data.fromdate.toLocaleDateString('en-GB'),
				todate:data.todate.toLocaleDateString('en-GB')   
				/*details.empid : Andromeda.getSessionValue("employeeid")*/
		}
		details.empid = Andromeda.getSessionValue("employeeid")
		console.log(details);   
	$http.get('/erp/attendance/getReport',details).then(function(response) {
		$scope.data = response.data;   
		if($scope.data.successful)
		{
			$scope.regdetails = $scope.data.responseObject.report;
		}
		else              
		{
			console.log("Client error while getting data");      
		}
	});
	}
	
	    
}]);