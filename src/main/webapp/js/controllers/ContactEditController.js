// START - USED SERVICES
/*
 *	ContactService.create
 *		PARAMS: 
 *		
 *
 *	ContactService.get
 *		PARAMS: 
 *		
 *
 *	CompanyService.list
 *		PARAMS: 
 *		
 *
 *	ContactService.update
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

app.controller('ContactEditController', ['$scope', '$location', '$routeParams', '$q', 'CompanyService', 'ContactService', 'CompanyService',
    function ($scope, $location, $routeParams, $q, CompanyService , ContactService , CompanyService) {

    	//manage create and save
		$scope.external = {};
		
    	if ($routeParams.id != 'new')
    	{
        	$scope.id = $routeParams.id;
        	$scope.obj = ContactService.get({_id: $scope.id});
        	
    	}
    	else{
    		$scope.obj = new ContactService();
        	
    	}
    	
    	$scope.save = function(){
    		$scope.obj.$save().then(function(data){
    			$scope.obj=data;
        		$location.path('/home/');
    		});
    	}
    	
    	$scope.remove = function(){
    		ContactService.remove({_id: $scope.obj._id}).$promise.then(function(){
				$('#removeModal').modal('hide');
				$('.modal-backdrop').remove();
				$('.modal-open').removeClass("modal-open");
        		$location.path('/home/');
    		});
    	}
    	
    		
        //manage relation company
        		
    	$scope.list_Company = CompanyService.query();

}]);