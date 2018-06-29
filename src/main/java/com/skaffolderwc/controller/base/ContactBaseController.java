package com.skaffolderwc.controller.base;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.bson.types.ObjectId;
import org.springframework.security.access.annotation.Secured;
import org.springframework.beans.factory.annotation.Autowired;
import com.skaffolderwc.db.mycontacts_db.service.ContactService;
import com.skaffolderwc.db.mycontacts_db.entity.Contact;

//IMPORT RELATIONS
import com.skaffolderwc.db.mycontacts_db.entity.Company;

public class ContactBaseController {
    
    @Autowired
	ContactService contactService;



//CRUD METHODS


    //CRUD - CREATE
    @Secured({  })
	@RequestMapping(value = "/contacts",method = RequestMethod.POST, headers = "Accept=application/json")
	public Contact insert(@RequestBody Contact obj) {
		 return contactService.insert(obj);
	}

	
    //CRUD - REMOVE
    @Secured({  })
	@RequestMapping(value = "/contacts/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void delete(@PathVariable("id") String id) {
		contactService.delete(id);
	}
	

    //CRUD - FIND BY Company
    @Secured({  })
	@RequestMapping(value = "/contacts/findBycompany/{key}", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Contact> findByCompany(@PathVariable("key") String idCompany) {
		return contactService.findByCompany(idCompany);
	}
	
    //CRUD - GET ONE
    @Secured({  })
	@RequestMapping(value = "/contacts/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Contact get(@PathVariable String id) {
		return contactService.get(id);
	}
	
	
    //CRUD - GET LIST
    @Secured({  })
	@RequestMapping(value = "/contacts", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Contact> getList() {
		return contactService.getList();
	}
	
	

    //CRUD - EDIT
    @Secured({  })
	@RequestMapping(value = "/contacts/{id}", method = RequestMethod.POST, headers = "Accept=application/json")
	public Contact update(@RequestBody Contact obj) {
		return contactService.update(obj);
	}
	


/*
 * CUSTOM SERVICES
 * 
 *	These services will be overwritten and implemented in  Custom.js
 */


	
}
