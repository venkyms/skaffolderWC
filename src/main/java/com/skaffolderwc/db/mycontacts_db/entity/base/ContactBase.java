package com.skaffolderwc.db.mycontacts_db.entity.base;

/**
 * 
 * 
  _____                      _              _ _ _     _   _     _        __ _ _      
 |  __ \                    | |            | (_) |   | | | |   (_)      / _(_) |     
 | |  | | ___    _ __   ___ | |_    ___  __| |_| |_  | |_| |__  _ ___  | |_ _| | ___ 
 | |  | |/ _ \  | '_ \ / _ \| __|  / _ \/ _` | | __| | __| '_ \| / __| |  _| | |/ _ \
 | |__| | (_) | | | | | (_) | |_  |  __/ (_| | | |_  | |_| | | | \__ \ | | | | |  __/
 |_____/ \___/  |_| |_|\___/ \__|  \___|\__,_|_|\__|  \__|_| |_|_|___/ |_| |_|_|\___|
 
                                                                                   
 * DO NOT EDIT THIS FILE!! 
 *
 *  FOR CUSTOMIZE ContactBase PLEASE EDIT ../Contact.java
 * 
 *  -- THIS FILE WILL BE OVERWRITTEN ON THE NEXT SKAFFOLDER CODE GENERATION --
 * 
 */
 

/**
 * This is the model of Contact object
 * 
 */
 
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

import org.mongodb.morphia.annotations.Id;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.skaffolderwc.utils.ObjectIdListSerializer;


//IMPORT RELATIONS
import com.skaffolderwc.db.mycontacts_db.entity.Company;

@Entity("Contact")
public class ContactBase {
	
	@Id
	@JsonSerialize(using = ToStringSerializer.class)
	private ObjectId _id;
	
	// Attributes
    private String email;
    private String name;
    private String note;
    private String phone;
    private String surname;
	
	
	// Relations company
	@JsonSerialize(using = ToStringSerializer.class)
	private ObjectId company;
	
	
	
	

    // GETTER AND SETTER
    
	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId id) {
		this._id = id;
	}


	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
    
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
    
	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}
    
	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
    
	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}
    

	
    
    // Relations 1:m company
	public ObjectId getCompany() {
		return company;
	}

	public void setCompany(ObjectId company) {
		this.company = company;
	}
    
    
    
    
}