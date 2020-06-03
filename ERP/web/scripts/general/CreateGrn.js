var employee = angular.module('CreateGrn', []);
employee.controller('CreateGrnController',['$scope','$http',function($scope,$http)
{
$http.get('/erp/polist/getAll').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.vendordetails = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});

$http.get('/erp/polist/getAll').then(function(response) {
	$scope.data = response.data;
	if($scope.data.successful)
	{
		$scope.linedetails = $scope.data.responseObject;
	}
	else
	{
		console.log("Client error while getting data");  
	}
});

$http.get('/erp/polist/getAll').then(function(response) {
	$scope.data = response.data;
	if($scope.data.successful)
	{
		$scope.slinedetails = $scope.data.responseObject;
	}
	else
	{
		console.log("Client error while getting data");  
	}
});

$http.get('/erp/polist/getAll3').then(function(response) {
	$scope.data = response.data;
	if($scope.data.successful)
	{
		$scope.assdetails = $scope.data.responseObject;
	}
	else
	{
		console.log("Client error while getting data");  
	}
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


}]);             