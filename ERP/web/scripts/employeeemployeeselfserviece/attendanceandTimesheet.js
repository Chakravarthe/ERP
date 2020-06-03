var employee = angular.module('attendanceandTimesheet', []);
employee.controller('attendanceandTimeSheet',['$scope','$http',function($scope,$http)
	{
	
	$scope.Insertdata = function(UserData) {
		   
		UserData.empid = Andromeda.getSessionValue("employeeid");
		console.log(UserData);
		
		$http.post('/erp/employee/add8',UserData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
			    		/*	$("#com").show(); */
						alert("Task Inserted Successfully");
						/*Andromeda.showHrEmployeePage();*/
					} else {
						alert("Data not inserted");    
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	};
	    
}]);