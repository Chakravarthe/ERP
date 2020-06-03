var scheme = angular.module('schemeModule', []);
scheme.controller('schemeController',['$scope','$http',function($scope,$http)
{
	$scope.registration = function(UserData) {
		console.log(UserData);
		{
		alert(UserData.financial_year + '  Successful');
		$http.post('/erp/scheme/add', UserData).then(
				function(response) {
					$scope.data = response.data;   
					if ($scope.data.successful) {
						location.reload();   
						swal("User Data Inserted Successfully");
					} else {
						swal("Data not inserted");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		 }
	
	};	
	$http.get('/erp/purchase/getYears').then(function(response) {
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
	$http.get('/erp/scheme/getNames').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.names = $scope.data.responseObject;
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
	$http.get('/erp/scheme/getSdeigroups').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.sdeigroups = $scope.data.responseObject;
			
			console.log($scope.sdeigroups);
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
		
	/*$http.get('/erp/scheme/getServices').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.services = $scope.data.responseObject;
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
	
	$http.get('/erp/scheme/getPrograms').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.programs = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");
		}
	},
	function(response)
	{
		console.log("Server error while getting data");
	});*/
	/*$http.get('/erp/scheme/getSchemes').then(function(response) {
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
	});*/
	/*$http.get('/erp/scheme/getProjects').then(function(response) {
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
	});*/
	/*$http.get('/erp/scheme/getSectors').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.sectors = $scope.data.responseObject;
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
	*/

	

	$http.get('/erp/scheme/getAll').then(function(response) {
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
	

	$scope.getById = function(financial_year){
		alert(financial_year);
		$http.post('/erp/scheme/getById', financial_year).then(
				function(response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						$scope.data={object:$scope.data.responseObject};
					} else {
						alert("Error while getting data");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	}; 
		
		$scope.removeData = function(financial_year) {
			$http.post('/erp/scheme/removeData',financial_year).then(
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

		
		
		$scope.updateData = function(UserData){
			$http.post('/erp/scheme/updateData', Data).then(function (response) {
					
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