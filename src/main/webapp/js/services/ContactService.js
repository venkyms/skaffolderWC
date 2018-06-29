/**

  _____                      _              _ _ _     _   _     _        __ _ _      
 |  __ \                    | |            | (_) |   | | | |   (_)      / _(_) |     
 | |  | | ___    _ __   ___ | |_    ___  __| |_| |_  | |_| |__  _ ___  | |_ _| | ___ 
 | |  | |/ _ \  | '_ \ / _ \| __|  / _ \/ _` | | __| | __| '_ \| / __| |  _| | |/ _ \
 | |__| | (_) | | | | | (_) | |_  |  __/ (_| | | |_  | |_| | | | \__ \ | | | | |  __/
 |_____/ \___/  |_| |_|\___/ \__|  \___|\__,_|_|\__|  \__|_| |_|_|___/ |_| |_|_|\___|
                                                                                     
                                                                                   
 *  DO NOT EDIT HIS FILE!!
 * 
 *  FOR CUSTOMIZE ImpiegatiService PLEASE EDIT js/services/custom/ContactCustomService.js
 * 
 *  -- THIS FILE WILL BE OVERWRITTEN ON THE NEXT SKAFFOLDER'S CODE GENERATION --
 * 
 */


app.factory('ContactService', ['$resource', '$rootScope', 'ContactServiceCustom',
  function($resource, $rootScope, ContactServiceCustom){
    return $resource( $rootScope.baseUrl + "/contacts/:_id", {_id:'@_id'}, $.extend({
        'findBycompany': { 
        	url: $rootScope.baseUrl + '/contacts/findBycompany/:key',
        	method: 'GET',
        	isArray: true,
        	params: {
        		 
        	}
        },
    }, ContactServiceCustom));
}]);