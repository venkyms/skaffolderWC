// START - USED SERVICES
/*
 *	CompanyService.create
 *		PARAMS: 
 *		
 *
 *	ContactService.findBycompany
 *		PARAMS: 
 *		
 *
 *	CompanyService.get
 *		PARAMS: 
 *		
 *
 *	CompanyService.update
 *		PARAMS: 
 *		
 *
 */
// END - USED SERVICES

// START - REQUIRED RESOURCES
/*
 * CompanyService  
 * ContactService  
 */
// END - REQUIRED RESOURCES

app.controller('CompanyEditController', ['$scope', '$location', '$routeParams', '$q', 'CompanyService', 'ContactService', 'ContactService',
    function ($scope, $location, $routeParams, $q, CompanyService , ContactService , ContactService) {

    	//manage create and save
		$scope.external = {};
		
    	if ($routeParams.id != 'new')
    	{
        	$scope.id = $routeParams.id;
        	$scope.obj = CompanyService.get({_id: $scope.id});
        	$scope.external._Contactcompany = ContactService.findBycompany({key: $scope.id});
        	
    	}
    	else{
    		$scope.obj = new CompanyService();
        	$scope.external._Contactcompany = [];
        	
    	}
    	
    	$scope.save = function(){
    		$scope.obj.$save().then(function(data){
    			$scope.obj=data;
        		$location.path('/company/');
    		});
    	}
    	
    	$scope.remove = function(){
    		CompanyService.remove({_id: $scope.obj._id}).$promise.then(function(){
				$('#removeModal').modal('hide');
				$('.modal-backdrop').remove();
				$('.modal-open').removeClass("modal-open");
        		$location.path('/company/');
    		});
    	}
    	
    		
        //manage External relation company
        		
    	$scope.list_Contactcompany = ContactService.query();
    	
}]);