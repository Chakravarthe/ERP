var ctc = angular.module('CtcModule', []);

ctc.controller('CtcController', [ '$http', '$scope', function($http, $scope) {

	$scope.pname = null, $scope.filteredResult = null;

	/*
	 * $scope.getPaySlipData = function(obj) { $scope.getPaySlipHeads =
	 * function(totalObj) { Andromeda.setSessionValue("name", totalObj.empid);
	 * 
	 * $("#glyphiconid").show(); $scope.pname = totalObj.pname;
	 * $http.post('/erp/Employee/getPaySlipHeads',
	 * totalObj.payname).then(function(response) { $scope.data = response.data;
	 * if($scope.data.successful) { $scope.regdetails =
	 * $scope.data.responseObject; $("#div1").hide(); $("#lb6b").show();
	 * $("#div4").hide(); $("#glyphiconid").hide(); } else { console.log("Client
	 * error while getting data"); } }, function(response) { console.log("Server
	 * error while getting data"); }); }; }
	 */
/*var empid=Andromeda.getSessionValue("employeeid");*/
	$scope.getById = function(name){
		$http.post('/erp/calc/getById', name).then(function(response) {
			$scope.data = response.data;
			console.log($scope.data);
			if ($scope.data.successful) {
				$scope.data3 = {   
					object : $scope.data.responseObject
				};
				    
			} else {
				alert("Error while getting data");
			}
		}, function(errResponse) {
			console.error('Error while fetching notes');
		});
	};   
	

	$http.get('/erp/calc/getYears').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.years = $scope.data.responseObject;

			console.log($scope.years);
		} else {
			console.log("Client error while getting data");
		}
	}, function(response) {
		console.log("Server error while getting data");
	});

	$http.get('/erp/calc/getCaders').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.caders = $scope.data.responseObject;
		} else {
			console.log("Client error while getting data");
		}
	}, function(response) {
		console.log("Server error while getting data");
	});

	$http.get('/erp/calc/getGrades').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.grades = $scope.data.responseObject;
		} else {
			console.log("Client error while getting data");
		}
	}, function(response) {
		console.log("Server error while getting data");
	});

	$scope.savedata = function(UserData) {
		console.log(UserData);

		$http.post('/erp/calc/add', UserData).then(

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

	/*
	 * $http.post('/erp/ctc/getAll').then(function(response) { $scope.data =
	 * response.data; if ($scope.data.successful) { $scope.userdetails =
	 * $scope.data.responseObject; } else { alert("Can't view the Data"); } },
	 * function(errResponse) { console.error('Error while viewing notes'); });
	 */   

	$http.post('/erp/calc/getAll').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.regdetails = $scope.data.responseObject;
		} else {
			alert("Can't view the Data");
		}   
	}, function(errResponse) {
		console.error('Error while viewing notes');
	});

	$http.post('/erp/ctc/getEarnings').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.userdetails = $scope.data.responseObject;
		} else {
			alert("Can't view the Data");
		}   
	}, function(errResponse) {
		console.error('Error while viewing notes');
	});

	$http.post('/erp/ctc/getDeductions').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.regdetails1 = $scope.data.responseObject;
		} else {
			alert("Can't view the Data");
		}
	}, function(errResponse) {
		console.error('Error while viewing notes');
	});

	
	
	
	

	/*
	 * $scope.updateData = function(Data){
	 * $http.post('/erp/vendorservice/updateData', Data).then(function
	 * (response) {
	 * 
	 * $scope.data = response.data; if ($scope.data.successful) { alert("User
	 * Details Successfully updated"); } else { alert("Data not updated"); } },
	 * function(errResponse) { console.error('Error while fetching notes'); }) };
	 * 
	 * 
	 */

} ]);