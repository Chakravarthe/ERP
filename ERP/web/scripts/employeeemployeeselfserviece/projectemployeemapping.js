var employee = angular.module('projectemployeemapping', []);
employee.controller('projectempController',['$scope','$http',function($scope,$http)
	{
	
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
	
	/* Getting Projects */
	$http.get('/erp/employee/getprojects').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.projects = $scope.data.responseObject;
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
	
	/* Getting data in tables */
	
	$scope.getprojectdata=function(data){
		console.log(data);		
	$http.post('/erp/employee/getprojectdata',data).then(function(response) {
		$scope.data = response.data;   
		if($scope.data.successful)
		{
			$scope.regdetails = $scope.data.responseObject.dates;
			console.log($scope.regdetails);
		} 
		else
		{
			console.log("Client error while getting data");  
		}  
	});   
	}
	
	/* Getting all employees of given location */
	
	$scope.getallemployees=function(data){
		console.log(data);		
	$http.post('/erp/employee/getallemployees',data).then(function(response) {
		$scope.data = response.data;   
		if($scope.data.successful)
		{
			$scope.empdetails = $scope.data.responseObject.alldata;
			console.log($scope.empdetails);
		} 
		else
		{
			console.log("Client error while getting data");  
		}  
	});   
	}
	
	/* For Check boxes */
	
	$scope.setAllRegIds = function(allStudents)
	{
	if(allStudents == true)
	{  
	for(var i = 0; i < $scope.filteredResult.length; i++)
	{
	var project = $scope.filteredResult[i]['project'];
	$scope.studentsPresentArr[project] = true;
	}
	}
	else if(allStudents == false)
	{
	$scope.studentsPresentArr = [];
	}
	};
	
	    
}]);