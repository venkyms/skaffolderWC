package com.skaffolderwc.db.mycontacts_db.service.base;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.skaffolderwc.db.mycontacts_db.entity.Company;

//IMPORT RELATIONS
import com.skaffolderwc.db.mycontacts_db.entity.Company;

@Service
public class CompanyBaseService {

	
	@Autowired
	private Datastore datastore;


    //CRUD METHODS
    
    //CRUD - CREATE
    	
	public Company insert(Company obj) {
		datastore.save(obj);
		return obj;
	}
	
    	
    //CRUD - REMOVE
    
	public void delete(String id) {
		Query<Company> query = datastore.createQuery(Company.class).field("_id").equal(new ObjectId(id));
		datastore.delete(query);
	}

    	
    //CRUD - GET ONE
    	
	public Company get(String id) {
		return datastore.find(Company.class).field("_id").equal(new ObjectId(id)).get();
	}

    	
        	
    //CRUD - GET LIST
    	
	public List<Company> getList() {
		return (ArrayList<Company>) datastore.find(Company.class).asList();
	}

    	
    //CRUD - EDIT
    	
	public Company update(Company obj) {
		datastore.save(obj);
		return obj;
	}
	
    	
    
    

    
    /*
     * CUSTOM SERVICES
     * 
     *	These services will be overwritten and implemented in CompanyService.java
     */
    


}
