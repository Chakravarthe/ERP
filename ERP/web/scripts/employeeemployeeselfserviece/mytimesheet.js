var employee = angular.module('mytimesheet', []);
employee.controller('MytimesheetController',['$scope','$http',function($scope,$http)
	{
	
	$scope.getdata=function(data){
		console.log(data);
		if(data == undefined)
		{
			swal("OOPS!","Select all details","info");
		}
		else if(data.from_date == null || data.from_date == undefined || data.from_date == "")
		{
			swal("Oops...","Select From Date","info");
		}
		else if(data.to_date == null || data.to_date == undefined || data.to_date == "")
		{
			swal("Oops...","Select To Date","info");
		}	
		else{
	$http.post('/erp/Employee/getdata',data).then(function(response) {
		$scope.data = response.data;   
		if($scope.data.successful)
		{
			$scope.userdetails = $scope.data.responseObject.dates;
			console.log($scope.userdetails);
		}
		else
		{
			console.log("Client error while getting data");  
		}  
	   });	
    }    
   }     
	
	/*  getting data based on empid */
	
	/*$scope.getByIddata = function(empid){
		alert(empid);
		$http.post('/erp/Employee/getByIddata', empid).then(
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
	};*/
	
	$scope.getByIddata = function(task){
		alert(task);
		$http.post('/erp/Employee/getByIddata', task).then(
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
	
	/* Deleting data based on task */
	
	$scope.removedata = function(task) {
		$http.post('/erp/Employee/removedata', task).then(
				function(response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						/*location.reload();*/
						/*Andromeda.showTimesheetpage();*/
						alert("task removed Successfully");
					} else {
						alert("task not Deleted");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
			};
	
	/* updating data based on task */
			
	$scope.updatedata = function(UserData){
		console.log(UserData);   
		alert(UserData.task);
		$http.post('/erp/Employee/updatedata', UserData).then(
				function(response) {
						$scope.data = response.data;
							if ($scope.data.successful) {
								alert("Task Successfully updated");
								/*Andromeda.showTimesheetpage();*/
							} else {
								alert("Data not updated");
							}
						}, function(errResponse) {
							console.error('Error while fetching notes');
						});
			};
	    
}]);