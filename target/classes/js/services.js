/// <reference path="controller.js" />

app.factory('shareData',function(){
	return{
		sendAppData: function(input){
			console.log("I am in service"+input.namePI)
			return input;
		}
	}
	
	
	/*
	 var sharedService = {};
	  sharedService.message = '';
	  sharedService.prepForBroadcast = function(msg) {
	    this.message = msg;
	    this.broadcastItem();
	  };
	  sharedService.broadcastItem = function() {
	    $rootScope.$broadcast('handleBroadcast');
	  };
	  return sharedService;

	  */
});