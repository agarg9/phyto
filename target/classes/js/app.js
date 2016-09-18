
/// <reference path="angular.min.js" />

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
		.when("/openApp",{
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
	});
	
