function formatDate(date) {
    var d = new Date(date),
        month = '' + (d.getMonth() + 1),
        day = '' + d.getDate(),
        year = d.getFullYear();

    if (month.length < 2) month = '0' + month;
    if (day.length < 2) day = '0' + day;

    return [year, month, day].join('-');
};
        
   

      
function formatDateDayFirst(date) {
    var d = new Date(date),
        month = '' + (d.getMonth() + 1),
        day = '' + d.getDate(),     
        year = d.getFullYear();

    if (month.length < 2) month = '0' + month;
    if (day.length < 2) day = '0' + day;

    return [day, month, year].join('-');
};

var attendanceSheetModule = angular.module('attendanceSheetModule', [])
.filter('sumOfValue', function () {    
    return function (data, key) {        
        if (angular.isUndefined(data) || angular.isUndefined(key))
            return 0;             
        var sum = 0;        
        angular.forEach(data,function(value)
        {     
        	if(value[key]==null){
        		value[key]=0;
        	}
        	if(value[key] != null)
        	{
        		sum = sum + value[key];
        	}    
        });         
        return sum;
    };    
})
attendanceSheetModule.directive('datepicker', function () {
   return {
    restrict: 'A',
        require: 'ngModel',
         link: function (scope, element, attrs) {
            $(element).datepicker({
            maxDate : new Date,
    changeMonth : true,
    changeYear : true,
    dateFormat : 'dd-mm-yy',   
    yearRange : '-50:+0',
                onSelect: function (date) {
                    scope.dob = date;
                    scope.$apply();
               }
           });
       }
   };
})
attendanceSheetModule.controller('attendanceSheetController', [ '$http', '$scope', function($http, $scope) {
	 var count = 0;
	 
	         
		var self = this;
			$scope.selectedDate1 = formatDate(new Date());
			$scope.selectedDate = formatDateDayFirst(new Date());
	        $http.post('attendance/attended',$scope.selectedDate1).then(function(response) {
				$scope.data = response.data;
				if($scope.data.successful) {
					$scope.attended = $scope.data.responseObject;
				} else {
					showError($scope.data.errorMessage);
					var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
					jQuery("#errorDiv").html(message);
				}
			}, function(errResponse) {
				console.error('Error ...');
			});
			
			$scope.getAttendees = function(selectedDate){
				var date = selectedDate.split("-").reverse().join("-");      
				$http.post('attendance/attended',date).then(function(response) {
				$scope.data = response.data;
				if($scope.data.successful) {
					$scope.attended = $scope.data.responseObject;
				} else {
					showError($scope.data.errorMessage);
					var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
					jQuery("#errorDiv").html(message);
				}
			}, function(errResponse) {         
				console.error('Error ...');   
			});
			};  
			
		/*	$scope.generateemployeeexcel = function()
			{
			var blob = new Blob([document.getElementById('attedancediv').innerHTML], {
			       type: "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8"
			   });
			   var fileName = "Attendance.xls";     
			   saveAs(blob, fileName);
			};
			*/
			$scope.generateemployeeexcel = function() {
				console.log("Coming");
		         var blob = new Blob([document.getElementById('attendancediv').innerText], {
		             type: "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8"
		         });
		         var fileName = "Attendance";                  
		         if (fileName != null) {
		             saveAs(blob, fileName + ".xls");   
		         }   
		     };   
		           
		     $http.get('attendance/getDistricts').then(function(response)
		    			{
		    		    	$scope.data = response.data;      
		    				if($scope.data.successful)     
		    				{             
		    					$("#dataDiv").show();
		    					console.log($scope.data);   
		    					$scope.districts = $scope.data.responseObject;
		    					$("#dataDiv1").hide();
		    					$("#attedancediv").hide();             
		    				}
		    				else
		    				{   
		    					//showError($scope.data.errorMessage);
		    					var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
		    					jQuery("#errorDiv").html(message);
		    				}
		    			},   
		    			function(errResponse)
		    			{  
		    				console.error('Error while fetching notes');
		    			});
		    		   

		    		$scope.getCollege = function(district)
		    		{
		    			Andromeda.setSessionValue("districtId", district.districtId);
		    			Andromeda.setSessionValue("districtName", district.districtName);
		    			   
		    			console.log(district.districtid);
		    			$http.post('attendance/getCollege', district.districtid).then(function(response)
		    			{
		    		    	$scope.data = response.data;                
		    				if($scope.data.successful)                                    
		    				{      
		    					$("#dataDiv1").show();
		    					console.log($scope.data);                  

		    					$scope.colleges = $scope.data.responseObject;
		    					$("#dataDiv").hide();
		    					$("#attedancediv").hide(); 
		    					$scope.data = {object : district};        
		    				}     
		    				else        
		    				{              
		    					//showError($scope.data.errorMessage);
		    					var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
		    					jQuery("#errorDiv").html(message);
		    				}
		    			},     
		    			function(errResponse)
		    			{
		    				console.error('Error while fetching notes');
		    			});      
		    		}; 
		    		
		    		$scope.getEmployees = function(college)
		    		{      
		    			Andromeda.setSessionValue("collegeid", college.collegeid);
		    			Andromeda.setSessionValue("collegename", college.collegename);
		    			   
		    			console.log(college.collegeid);
		    			$http.post('attendance/getEmployees', college.collegeid).then(function(response)
		    			{
		    		    	$scope.data = response.data;                
		    				if($scope.data.successful)                                          
		    				{      	    					
		    					                

		    					$scope.attended = $scope.data.responseObject;
		    					console.log("Employee data:"+$scope.attended.length);  
		    					$("#dataDiv").hide();  
		    					$("#dataDiv1").hide(); 
		    					$("#attedancediv").show();
		    					//$scope.data = {object : college};        
		    				}          
		    				else
		    				{              
		    					//showError($scope.data.errorMessage);
		    					var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
		    					jQuery("#errorDiv").html(message);
		    				}
		    			},     
		    			function(errResponse)   
		    			{
		    				console.error('Error while fetching notes');
		    			});      
		    		}; 
		    				
		    		
		    		
     
} ]);
