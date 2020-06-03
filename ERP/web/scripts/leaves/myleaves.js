var leave = angular.module('myleave', []);
leave.controller("myleaveController", ['$scope','$http',function($scope, $http)
  {
	$http.get('/erp/attendance/getLeavesDetails').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.leavesdetails = $scope.data.responseObject;
		} else {
			console.log("Client error while getting data");
		}
	}, function(response) {
		console.log("Server error while getting data");
	});
	
	
		}]);