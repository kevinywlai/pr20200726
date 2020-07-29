// https://docs.angularjs.org/guide/controller

(function(angular) {
    'use strict';
	var myApp = angular.module('spicyApp1', []);
	
	myApp.controller('SpicyController', ['$scope', function($scope) {
		
		$scope.cityList =  username.cityList;
		
		console.log(username.cityList[1].cityName);
		
	    $scope.spice = 'very';
	
	    $scope.chiliSpicy = function() {
	        $scope.spice = 'chili';
	    };
	
	    $scope.jalapenoSpicy = function() {
	        $scope.spice = 'jalapeño';
	    };
	}]);
})(window.angular);