// START - USED SERVICES
/*
 *	ContactService.delete
 *		PARAMS: 
 *		
 *
 *	ContactService.list
 *		PARAMS: 
 *		
 *
 */
// END - USED SERVICES

// START - REQUIRED RESOURCES
/*
 * ContactService  
 */
// END - REQUIRED RESOURCES


//CRUD LIST FOR [object Object]

app.controller('HomeController', ['$scope', 'ContactService',
    function ($scope, ContactService ) {
		
    	$scope.list = ContactService.query();
    	
}]);