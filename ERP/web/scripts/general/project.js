var project = angular.module('projectModule', []);
project.controller('projectController',['$scope','$http',function($scope,$http)
{
	
	$http.get('/erp/project/getYears').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.years = $scope.data.responseObject;
			
			console.log($scope.years);
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
	
	
	$http.get('/erp/project/getSdeis').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.sdeis= $scope.data.responseObject;
			
			console.log($scope.sdeis);
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
	
	
	$http.get('/erp/project/getSchemes').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.schemes = $scope.data.responseObject;
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
	

	$scope.registration = function(UserData)	
	{
				$http.post('/erp/project/add', UserData).then(
					function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
						alert("User Data Inserted Successfully");
					} else {
						alert("Data not inserted");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
			
	};
	

	$http.get('/erp/project/getAll').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
			$scope.userdetails = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});
	

	$scope.getById = function(Data){
		
		$http.post('/erp/project/getById',project_name).then(function (response) {
		    $scope.data = response.data;
		    if ($scope.data.successful) {
		        $scope.data = {object:$scope.data.responseObject};
		    } else {
		    	//alert("Error while getting data");
		    	console.log("error")
		       
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
		};  
		
		$scope.removeData = function(project_name) {
			$http.post('/erp/project/removeData',project_name).then(
					function(response) {
						$scope.data = response.data;
						if ($scope.data.successful) {
							location.reload();
							alert("User Data removed Successfully");
						} else {
							alert("Data not Deleted");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
			
			
			
			 
		};

		$scope.updateData = function(Data){
			$http.post('/erp/project/updateData', Data).then(function (response) {
					
						$scope.data = response.data;     
						if ($scope.data.successful) {
						  alert("User Details Successfully updated");
						 
						} else {
						  alert("Data not updated");
						}
					}, function(errResponse) {
					console.error('Error while fetching notes');
					})
		};
		

}]);