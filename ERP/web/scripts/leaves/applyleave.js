var leave = angular.module('applyleave', []);
var documentsArr = [];
leave.controller("applyController", ['$scope','$http',function($scope, $http)

		{      

			$scope.insertion = function(EmpData) {
				if(EmpData == undefined)
				{
					swal("OOPS!","Fill all details","info");
				}
				else if(EmpData.leave_type== null || EmpData.leave_type == undefined || EmpData.leave_type == "")
				{
					swal("Oops...","select Leave Type","info");
				}
				else if(EmpData.emergency_number == null || EmpData.emergency_number == undefined || EmpData.emergency_number == "")
				{
					swal("Oops...","Enter Mobile number","info");
				}
				else if(EmpData.from_date == null || EmpData.from_date == undefined || EmpData.from_date == "")
				{
					swal("Oops...","select from Date","info");
				}
				else if(EmpData.to_date == null || EmpData.to_date == undefined || EmpData.to_date == "")
				{
					swal("Oops...","select to date","info");
				}
				
				else if(EmpData.reason == null || EmpData.reason == undefined || EmpData.reason == "")
				{
					swal("Oops...","select reason","info");
				}
				
				else
				{
				

				EmpData.empid = Andromeda.getSessionValue("employeeid");

				console.log(EmpData);
				$http.post('/erp/Employee/addEmp', EmpData).then(function(response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						location.reload();
						alert("Leave applied Successfully");
					} else {
						alert("Data not inserted");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
			};
			}

			$http.get('/erp/Employee/getLeavetype').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.leavetypes = $scope.data.responseObject;
				} else {
					console.log("Client error while getting data");
				}
			}, function(response) {
				console.log("Server error while getting data");
			});

			var empid = Andromeda.getSessionValue("employeeid");
			console.log("empid " + empid);
			$http.post('/erp/Employee/getReporting', empid).then(
					function(response) {
						$scope.data13 = response.data;
						if ($scope.data13.successful) {
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

			/*$scope.uploadFiles = function(e) {
				var k = 0;
				for (var i = 0; i < e.files.length; i++) {
					var singleFileInfo = e.files[i];
					(function(singleFileInfo) {
						var fileReader;
						fileReader = new FileReader();
						fileReader.onload = function(e) {
							var fileName1 = singleFileInfo.name;
							filesize = singleFileInfo.size;
							var fileDetails = fileName1.split(".");
							var fileName = "ccic_" + (k + 1) + "."
									+ fileDetails[1];
							var binaryString = e.target.result;
							var base64 = btoa(binaryString);
							var fileModel = {
								fileName : fileName,
								base64String : base64.toString(),
								name : fileName
							};
							documentsArr[k] = fileModel;
							k++;
						};
						fileReader.readAsBinaryString(e.files[i]);
					})(singleFileInfo);
				}
				// console.log(documentsArr);
			}
			
			
			$scope.getCalendar=function(){
				var startDate = document.getElementById("fromdate"); //YYYY-MM-DD
				var endDate = document.getElementById("todate"); //YYYY-MM-DD
	       
				var getDateArray = function(start, end) {
				    var arr = new Array();
				    var dt = new Date(start);
				    while (dt <= end) {
				        arr.push(new Date(dt));
				        dt.setDate(dt.getDate() + 1);
				    }
				    return arr;
				}

				var dateArr = getDateArray(startDate, endDate);

				// Output
				console.log("<p>Start Date: " + startDate + "</p>");
				console.log("<p>End Date: " + endDate + "</p>");
				console.log("<p>Date Array</p>")
				for (var i = 0; i < dateArr.length; i++) {
					console.log("<p>" + dateArr[i] + "</p>");
				}
				}
				*/
			
			
		} ]);