/* 
 * ADD HERE YOUR CUSTOMIZAZION, 
 * THESE WILL OVERRIDE DEFAULT SERVICES 
 * THIS FILE WILL BE NEVER OVERWRITTEN BY SKAFFOLDER
 * 
 */

ContactService = app.factory('ContactServiceCustom', ['$rootScope', function($rootScope){
  return {
	  //WRITE HERE YOUR CUSTOM SERVICE
	};
  }]);