package com.skaffolderwc.db.mycontacts_db.service.base;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.skaffolderwc.db.mycontacts_db.service.SecurityService;
import com.skaffolderwc.db.mycontacts_db.entity.User;

//IMPORT RELATIONS

@Service
public class UserBaseService {

	
	@Autowired
	private Datastore datastore;
	@Autowired
	private SecurityService securityService;


    //CRUD METHODS
    
    //CRUD - CREATE
    	
	public User insert(User obj) {
		datastore.save(obj);
		return obj;
	}
	
    	
    //CRUD - REMOVE
    
	public void delete(String id) {
		Query<User> query = datastore.createQuery(User.class).field("_id").equal(new ObjectId(id));
		datastore.delete(query);
	}

    	
    //CRUD - GET ONE
    	
	public User get(String id) {
		return datastore.find(User.class).field("_id").equal(new ObjectId(id)).get();
	}

    	
        	
    //CRUD - GET LIST
    	
	public List<User> getList() {
		return (ArrayList<User>) datastore.find(User.class).asList();
	}

    	
    //CRUD - EDIT
    	
	public User update(User obj) {
		datastore.save(obj);
		return obj;
	}
	
    	
    
    

    
    /*
     * CUSTOM SERVICES
     * 
     *	These services will be overwritten and implemented in UserService.java
     */
    
    public int countUsers() {
		return (int)datastore.createQuery(User.class).count();
	}
	
	public void newUser() {
		User user = new User();
		user.setUsername("admin");
        user.setPassword("1a1dc91c907325c69271ddf0c944bc72");
		ArrayList<String> roles = new ArrayList<>();
		roles.add("ADMIN");
		user.setRoles(roles);
		insert(user);
	}
	
	public boolean changePassword(String id, String passwordAdmin, String passwordNew) throws Exception {
		User admin = securityService.findUserByUsername("admin");
		User user = get(id);
		if(admin == null)
			return false;
		if(user == null)
			return false;
		if(admin.getPassword().equals(passwordAdmin)) {
			user.setPassword(passwordNew);
			update(user);
			return true;
		}
		return false;
	}


}
