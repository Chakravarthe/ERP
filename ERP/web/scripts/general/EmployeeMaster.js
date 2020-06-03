	var employee = angular.module('EmployeeMaster', []);

employee.filter('numberFormat', function () {
	return function(input) {   
	     input = input || 0;
	     var out = new Intl.NumberFormat('en-IN').format(parseInt(input));
	     return out;
	};
})  
                                
.filter('sumOfValue', function() {
    return function(data, key) {
      if (angular.isUndefined(data) || angular.isUndefined(key))
        return 0;
      var sum = 0;
      angular.forEach(data, function(v, k) {
        sum = sum + parseInt(v[key]);
      });    
      return sum;  
    };
 })

employee.controller('EmployeeMasterController',['$scope','$http',function($scope,$http)
{
	
	/*$scope.search = function(UserData) {
		$http.post('/erp/Employee/search',UserData).then(  function(response) {
				$scope.data = response.data;
				if($scope.data.successful)
				{
					$scope.searchdetails = $scope.data.responseObject;
				}
				else
				{
					console.log("Client error while getting data");  
				}
		});
	};*/
	
	
	$scope.name=null,$scope.filteredResult = null;
    
	$scope.getNameWiseData = function(obj) {      
		$scope.getBranchWisePrograms = function(totalObj)
		{
			Andromeda.setSessionValue("studentBranchId", totalObj.empid);
			
			$("#glyphiconid").show();        
			$scope.name = totalObj.name;
			$http.post('/erp/Employee/getBranchWisePrograms', totalObj.empid).then(function(response)
			{
				$scope.data = response.data;
				if($scope.data.successful)
				{
					$scope.regdetails = $scope.data.responseObject;
					/*$("#div1").hide();
					$("#lb6b").show();
					$("#div4").hide();*/
					$("#glyphiconid").hide();
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
		}; 
	} 
	
	$scope.getsearch = function(Data){
		$http.post('/erp/Employee/getsearch',Data).then(function (response) {
		    $scope.data = response.data;
		    if($scope.data.successful)
			{
				$scope.regdetails = $scope.data.responseObject;
			}
			else
			{
				console.log("Client error while getting data");  
			}
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
		}
	
	
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
	
	
	/* Update Data based on empid */
	/* Getting Details based on empid */
		$scope.getById = function(empid){
			/*alert(empid);*/
			$http.post('/erp/Employee/getById', empid).then(
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
		
	/* Updating Data based on empid */
		
		$scope.updateData = function(UserData){
			console.log(UserData);   
			/*alert(UserData.empid);*/
			$http.post('/erp/Employee/updateData', UserData).then(
					function(response) {
						$scope.data = response.data;
						if ($scope.data.successful) {
							alert("Employee Details Successfully updated");
						} else {
							alert("Data not updated");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};
	
			

	$http.get('/erp/Employee/getCaders').then(function(response) {
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
	
	
	$http.get('/erp/Employee/getGrades').then(function(response) {
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

	
	
}]);