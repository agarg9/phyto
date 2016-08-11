/// <reference path="angular.min.js" />

(function () {
	var app = angular.module("phytotron", ["ngRoute"])
	.config(function ($routeProvider) {
		$routeProvider
		.when("/", {
			templateUrl: "partials/login.html",
			controller: "loginController"
		})
		.when("/home", {
			templateUrl: "partials/home.html",
			controller: "homeController"
		})
		.when("/history", {
			templateUrl: "partials/history.html",
			controller: "historyController"
		})
		.when("/newAppl", {
			templateUrl: "partials/newAppl.html",
			controller: "newApplController"
		})
		.when("/chambers", {
			templateUrl: "partials/assgnChambers.html",
			controller: "chamberController"
		})
		.when("/chamberInfo", {
			templateUrl: "partials/ChamberInfo.html",
			controller: "chamberController"
		})
		.when("/sampleData", {
			templateUrl: "partials/sampledata.html",
			controller: "sampledataController"
		})	
		.otherwise({
			redirectTo: '/'
		});
	})
	.controller("homeController", function ($scope) {
		$scope.message = "under home controller";
		var savedApps = [
		                 {
		                	 title: "Sample Project 1",
		                	 start: "4/3/2016",
		                	 end: "6/6/2016",
		                	 lastModified: "3/25/2015 12:13"
		                 },
		                 {
		                	 title: "Sample Project 2",
		                	 start: "4/3/2014",
		                	 end: "6/16/2016",
		                	 lastModified: "7/15/2015 11:44"
		                 },
		                 {
		                	 title: "Sample Project 3",
		                	 start: "11/8/2016",
		                	 end: "6/6/2017",
		                	 lastModified: "7/03/2016 17:05"
		                 },
		                 {
		                	 title: "Sample Project 4",
		                	 start: "5/25/2016",
		                	 end: "9/30/2016",
		                	 lastModified: "3/25/2015 17:23"
		                 }
		                 ];
		$scope.savedApps = savedApps;

	})
	.controller("newApplController", function ($scope,$http) {
		/*this.appForm={};
            this.submit=function(product){
                product.appForm.push(this.appForm);
                this.review={};
            }*/
		$scope.depts = ["Computer Science", "Computer Engineering", "Phytotron", "Plant Bio"];
		var appForm = {
				projectTitle: "",
				//nameApplicant: "",
				//emailApplicant: "",
				applicantRow: [{
					nameApplicant: "",
					emailApplicant: "",
					departmentApplicant: ""
				}],
				//departmentApplicant: "",
				namePI: "",
				emailPI: "",
				departmentPI: "",
				experimentRow: [{
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
		$scope.appForm = appForm;
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
		$scope.list = [];
		$scope.submit = function () {
			if ($scope.appForm) {
				$scope.list.push(this.appForm);
				$http.post("/submitApp",appForm)
				.success(function(appForm, status, headers, config) {
					$scope.message = appForm;
				})
				.error(function(data, status, headers, config) {
					alert( "failure message: " + JSON.stringify({data: data}));
				});
				$scope.appForm = '';

			}
		};
		$scope.listb = [];
		$scope.save = function () {
			if ($scope.appForm) {
				$scope.listb.push(this.appForm);
				$scope.appForm = '';
			}
		}
		$scope.return = function () {
			window.history.back();
		}

	}).controller("chamberController", function ($scope, $http,$log) {
//		$http.get('http://localhost:8080/greeting')
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
		/*.success(function (data) {
			$scope.greeting = data;
		}).error(function(response){
			alert("Error")}) ;
		 */

		/*$http.get("http://rest-service.guides.spring.io/greeting")
            .then(function (response) {
                $scope.store = response.data;
            }, function (errResponse) {
                console.error('Error while fetching users');
                return $q.reject(errResponse);
            })*/
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
	.controller("historyController", function ($scope) {
		var historyApps = [
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
		                   ];
		$scope.historyApps = historyApps;
		$scope.sortColumn = "projectTitle";
		$scope.reverseSort = false;
		$scope.sortData = function (column) {
			$scope.reverseSort = ($scope.sortColumn == column) ? !$scope.reverseSort : false; //If else condition
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

})();