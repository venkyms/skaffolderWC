package com.skaffolderwc.db.mycontacts_db.service.base;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.skaffolderwc.db.mycontacts_db.entity.Contact;

//IMPORT RELATIONS
import com.skaffolderwc.db.mycontacts_db.entity.Company;

@Service
public class ContactBaseService {

	
	@Autowired
	private Datastore datastore;


    //CRUD METHODS
    
    //CRUD - CREATE
    	
	public Contact insert(Contact obj) {
		datastore.save(obj);
		return obj;
	}
	
    	
    //CRUD - REMOVE
    
	public void delete(String id) {
		Query<Contact> query = datastore.createQuery(Contact.class).field("_id").equal(new ObjectId(id));
		datastore.delete(query);
	}

    	
    //CRUD - FIND BY Company
    	
	public List<Contact> findByCompany(String idCompany) {
		return datastore.createQuery(Contact.class).field("company").equal(new ObjectId(idCompany)).asList();
	}
    	
    //CRUD - GET ONE
    	
	public Contact get(String id) {
		return datastore.find(Contact.class).field("_id").equal(new ObjectId(id)).get();
	}

    	
        	
    //CRUD - GET LIST
    	
	public List<Contact> getList() {
		return (ArrayList<Contact>) datastore.find(Contact.class).asList();
	}

    	
    //CRUD - EDIT
    	
	public Contact update(Contact obj) {
		datastore.save(obj);
		return obj;
	}
	
    	
    
    

    
    /*
     * CUSTOM SERVICES
     * 
     *	These services will be overwritten and implemented in ContactService.java
     */
    


}
