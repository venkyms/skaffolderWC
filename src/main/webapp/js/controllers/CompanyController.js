// START - USED SERVICES
/*
 *	CompanyService.delete
 *		PARAMS: 
 *		
 *
 *	CompanyService.list
 *		PARAMS: 
 *		
 *
 */
// END - USED SERVICES

// START - REQUIRED RESOURCES
/*
 * CompanyService  
 */
// END - REQUIRED RESOURCES


//CRUD LIST FOR [object Object]

app.controller('CompanyController', ['$scope', 'CompanyService',
    function ($scope, CompanyService ) {
		
    	$scope.list = CompanyService.query();
    	
}]);