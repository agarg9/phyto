/// <reference path="app.js" />

app.controller("sampledataController",function($scope,$http){
	$scope.message="asd";
	var form={
			name:"",
			phone:"",
			email:"",
			address:""
	}
	$scope.form=form;
	$scope.submit=function(){
		$http.post("/saveSampleForm",form)
		.success(function(form, status, headers, config) {
			$scope.message = form;
		})
		.error(function(data, status, headers, config) {
			alert( "failure message: " + JSON.stringify({data: data}));
		});
	}
})
app.controller("loginController", function ($scope,$http) {
	$scope.message = "under Login controller";
	var login= {
			email:"",
			pwd:""}
	$scope.login=login;
	$scope.submit=function()
	{
		$http.post("/loginSubmit",login)
		.success(function(login, status, headers, config) {
			$scope.message = login;
		})
		.error(function(data, status, headers, config) {
			alert( "failure message: " + JSON.stringify({data: data}));
		});
		$scope.login="";
	}
})

app.controller("homeController", function ($scope,$http,$log,shareData,share, $rootScope) {
	$scope.savedApps=$http.get('/showSavedAppList')
	.then(function success(response) {
		$scope.applicationList = response.data;
		$scope.config = response.config;
		$scope.headers = response.headers;
		$scope.status = response.status;
		$scope.statusText = response.statusText;
		$log.info(response);
	},function failure(response){
		$scope.applicationList = response.statusText;
		$scope.status = response.data;
		$log.info(response);
	});

	$scope.edit = function(data){
		$rootScope.$on("CallParentMethod", function(){
			$scope.parentmethod();
		});
		console.log("already here")
		$rootScope.sampData=data;
//		shareData.sendAppData(data)
		alert( "working!!"+data.namePI);
	}
	
	$scope.editData=function(data){
		share.setShare(data);
		var appform2 = share.getShare();
		console.log("inside editData 1:"+appform2.namePI)
//		console.log("inside editData 2:"+checkData().application_id)
		console.log("inside editData 3:"+appform2.application_id)
		
		//To call other controller method
		$rootScope.$emit("CallParentMethod", {});
		console.log("inside editData 4:"+share.getShare().namePI);
	}
//	$rootScope.$broadcast('openApplication');
	$scope.checkData = function(){
		console.log("called :"+share.getShare());
		return share.getShare();
	}

	$scope.message = "under home controller";
	
})
app.controller("newApplController", function ($scope,$http,$location,$rootScope,$route,share) {
	/*
	 * this.appForm={}; this.submit=function(product){
	 * product.appForm.push(this.appForm); this.review={}; }
	 */
	
	$scope.depts = ["Computer Science", "Computer Engineering", "Phytotron", "Plant Bio"];
	var appForm = {
			projectTitle: "",
			applicantRow: [{
				nameApplicant: "",
				emailApplicant: "",
				departmentApplicant: ""
			}],
			namePI: "",
			emailPI: "",
			departmentPI: "",
			experimentRow: [{
				lightOn: "",
				tempDay: "",
				lightOff: "",
				tempNight: "",
				nightInterrupt: 0,
				numOfPots: "",
				containerSize: "",
				potSpace: "",
				watering: "",
				species: ""
			}],
			startdate: "",
			enddate: "",
			substrate: "",
			substrateOther: "",
			safetyVerify: "",
			commiteeNumber: "",
			relation: "",
			summary: "",
			timeline: "",
			revision: "",
			affilation: "",
			accountNo: "",
			fundSource: "",
			otherName: "",
			otherEmail: "",
			otherStreet: "",
			otherCity: "",
			otherState: "",
			otherZip: ""
	}
	message="asdf";
	/*$scope.editForm=function(formData){
//		message:"check this";
		message=formData.namePI;
		$scope.childmethod = function() {
			$rootScope.$emit("CallParentMethod", {});
		}
	}*/
	$scope.checkData = function(){
//		console.log("called :"+share.getShare());
		return share.getShare();
	}
	/*$scope.editForm=function(formData){
		console.log("reached here")
		alert( "working again??"+formData.namePI);
	}*/
	$scope.message = message;

	
	
	$rootScope.$on("CallParentMethod", function(){
        $scope.openApplication();
     });

     $scope.openApplication = function() {
//    	 abc = share.getShare();
    	 console.log("I am here"+abc.emailPI);
     }
     
     console.log("outside 1:"+appForm.emailPI+ $location.path().includes('openApp'))
//	console.log("outside 2:"+appForm.emailPI+ $route.current.regexp.test('/^\\/openApp$/'))
     if($location.path().includes('newApp')){
    	 $scope.appForm = appForm;
     }
     else{
    	 $scope.appForm = share.getShare();
     }

//	$scope.message = $rootScope.sampData;
//	$scope.appForm = $rootScope.sampData;
	$scope.addAppRow = function () {
		$scope.appForm.applicantRow.push({
			nameApplicant: "",
			emailApplicant: "",
			departmentApplicant: ""
		});
	};
	$scope.deleteRow = function (index) {
		if ($scope.appForm.applicantRow.length > 1)
			$scope.appForm.applicantRow.splice(index, 1);
	}
	$scope.addProgram = function () {
		$scope.appForm.experimentRow.push({
			lightOn: "",
			tempDay: "",
			lightOff: "",
			tempNight: "",
			nightInterrupt: false,
			numOfPots: "",
			containerSize: "",
			potSpace: "",
			watering: "",
			species: ""

		});
	};
	$scope.deleteExpRow = function (index) {
		if ($scope.appForm.experimentRow.length > 1) {
			$scope.appForm.experimentRow.splice(index, 1);
		}
	}
	abc={namePI:"ank"
//		emailPI:"aa@aa.cc"
	};
	$scope.list = [];
	$scope.submit = function () {
		if ($scope.appForm) {
			$scope.list.push(this.appForm);
			$http.post("/submitApp",appForm)
			.success(function(appForm, status, headers, config) {
				$scope.message = appForm;
			})
			.error(function(data, status, headers, config) {
				$scope.message = data.data;
				alert( "failure message: " + JSON.stringify({data: data}));
			});
			$scope.appForm = '';
//			$scope.returnBack();

		}
	};
	$scope.listb = [];
	$scope.save = function () {
		$http.post("/saveApp",appForm)
		.success(function(appForm, status, headers, config) {
			$scope.message = appForm;
		})
		.error(function(data, status, headers, config) {
			alert( "failure message: " + JSON.stringify({data: data}));
		});
		/*
		 * if ($scope.appForm) { $scope.listb.push(this.appForm); $scope.appForm =
		 * ''; }
		 */
	}
	$scope.returnBack = function () {
		window.history.back();
	}

})
app.controller("chamberController", function ($scope, $http,$log) {
//	$http.get('http://localhost:8080/greeting')
	$http.get('/greeting')
	.then(function success(response) {
		$scope.greeting = response.data;
		$scope.config = response.config;
		$scope.headers = response.headers;
		$scope.status = response.status;
		$scope.statusText = response.statusText;
		$log.info(response);
	},function failure(response){
		$scope.greeting = response.statusText;
		$scope.status = response.data;
		$log.info(response);
	});
	/*
	 * .success(function (data) { $scope.greeting = data;
	 * }).error(function(response){ alert("Error")}) ;
	 */

	/*
	 * $http.get("http://rest-service.guides.spring.io/greeting")
	 * .then(function (response) { $scope.store = response.data; }, function
	 * (errResponse) { console.error('Error while fetching users'); return
	 * $q.reject(errResponse); })
	 */
	$scope.currChambers = [
	                       {
	                    	   c_id: "A-06",
	                    	   p_id: "500201",
	                    	   title: "Sample Project 1",
	                    	   start: "4/3/2016",
	                    	   end: "6/6/2016"

	                       },
	                       {
	                    	   c_id: "B-06",
	                    	   p_id: "500204",
	                    	   title: "Sample Project 2",
	                    	   start: "4/3/2016",
	                    	   end: "6/6/2016"
	                       },
	                       {
	                    	   c_id: "D-06",
	                    	   p_id: "500201",
	                    	   title: "Sample Project 1",
	                    	   start: "4/3/2016",
	                    	   end: "6/6/2016"
	                       },
	                       {
	                    	   c_id: "C-06",
	                    	   p_id: "500204",
	                    	   title: "Sample Project 2",
	                    	   start: "4/3/2016",
	                    	   end: "6/6/2016"
	                       }
	                       ];
})
app.controller("historyController", function ($scope,$http) {
	/*var historyApps = [
	                   {
	                	   projectId: 558343,
	                	   projectTitle: "Sample Project 1",
	                	   status: "Submitted",
	                	   submitDate: "2016-04-04T21:43:40.000Z",
	                	   start: "4/3/2016",
	                	   end: "6/6/2016",
	                	   lastModified: "2016-01-28T05:22:43.000Z"
	                   },
	                   {
	                	   projectId: 558541,
	                	   projectTitle: "Sample Project 2",
	                	   status: "Approved",
	                	   submitDate: "2015-05-11T21:43:40.000Z",
	                	   start: "4/3/2016",
	                	   end: "6/6/2016",
	                	   lastModified: "2015-05-11T06:23:40.000Z"
	                   },
	                   {
	                	   projectId: 550001,
	                	   projectTitle: "My Project A",
	                	   status: "Completed",
	                	   submitDate: "2015-11-21T21:43:40.000Z",
	                	   start: "4/3/2016",
	                	   end: "6/6/2016",
	                	   lastModified: "2015-11-08T21:23:40.000Z"
	                   },
	                   {
	                	   projectId: 550034,
	                	   projectTitle: "Sample Project",
	                	   status: "Updated",
	                	   submitDate: "2015-06-11T21:43:40.000Z",
	                	   start: "11/2/2016",
	                	   end: "6/5/2017",
	                	   lastModified: "2016-12-08T01:13:21.400Z"
	                   },
	                   {
	                	   projectId: 501346,
	                	   projectTitle: "Testing",
	                	   status: "Pending",
	                	   submitDate: "2015-11-08T21:43:40.000Z",
	                	   start: "4/3/2016",
	                	   end: "6/6/2016",
	                	   lastModified: "2015-11-08T21:43:40.000Z"
	                   }
	                   ];*/
//	$scope.historyApps = historyApps;
	$scope.historyApps = $http.get("/showAllAppList")
	.then(function success(response){
		$scope.allApplicationList = response.data;
	},function failure(response){
		$scope.allApplicationList = response.data;
	})
	
	$scope.sortColumn = "projectTitle";
	$scope.reverseSort = false;
	$scope.sortData = function (column) {
		$scope.reverseSort = ($scope.sortColumn == column) ? !$scope.reverseSort : false; // If
		// else
		// condition
		$scope.sortColumn = column;
	}
	$scope.getSortClass = function (column) {
		if ($scope.sortColumn == column) {
			return $scope.reverseSort ? 'glyphicon glyphicon-hand-down' : 'glyphicon glyphicon-hand-up';
		}
		return '';
	}

});

app.controller("applicationController",
		function ($scope, $location) {
	$scope.isActive = function (viewLocation) {
		return viewLocation === $location.path();
	};
});
