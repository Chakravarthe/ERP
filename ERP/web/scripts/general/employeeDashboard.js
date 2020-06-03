var employeeDashboardModule = angular.module('employeeDashboardModule', [])
employeeDashboardModule.controller('OnDutyController',['$http','$scope',function($http, $scope) {
							var self = this;
        $scope.savePresentEmployees = function(data) {
								var details = {
									employeeid : Andromeda
											.getSessionValue("employeeid"),

									username : Andromeda
											.getSessionValue("username")
								}
								console.log(details);

								$http.post('/erp/attendance/savePresentEmployees',details).then(function(response) {
									$scope.data = response.data;
									if ($scope.data.successful) {
										Andromeda.showEmployeedashboard();
                                    alert("Login Successfully!!!");
									} 
									else {
										alert("Already Logged In!!!");
										Andromeda.showEmployeedashboard();
									}
								});
							}

							$scope.updatePresentEmployees = function(data) {
								var data1 = {
										employeeid : Andromeda
												.getSessionValue("employeeid"),

										username : Andromeda
												.getSessionValue("username")
									}
									console.log(data1);
								$http.post('/erp/attendance/updatePresentEmployees',data1).then(function(response) {

													$scope.data = response.data;
													if ($scope.data.successful) {
														
														Andromeda.showEmployeedashboard();
														alert("logout Successfully!!!");
														
													} else {
														
														
														alert("Already Logged Out!!!");
														location.go();
													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							}
							
							
							
							
						
							
							
							var details = {
									/*login_time : today,*/
									/*login_date : todayDate,*/
									employeeid : Andromeda
											.getSessionValue("employeeid"),

											
											
									username : Andromeda
											.getSessionValue("username")
								}
								console.log(details);
							$http.post('/erp/attendance/getdashboard', details).then(
									function(response) {
										$scope.data13 = response.data;
										if ($scope.data13.successful) {
											console.log($scope.data13);
											$scope.data = {
												object : $scope.data13.responseObject
											};
											console.log("Successful");
										} else {
											// alert("Error while getting data");
											console.log("error")

										}
									}, function(errResponse) {
										console.error('Error while fetching notes');
									});

						} ]);
