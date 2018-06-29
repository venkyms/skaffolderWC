package com.skaffolderwc.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.PropertySource;

import com.skaffolderwc.controller.base.ContactBaseController;

@RestController
@PropertySource("classpath:${configfile.path}/skaffolderWC.properties")
@RequestMapping(value="${endpoint.api}", headers = "Accept=application/json")
public class ContactController extends ContactBaseController {

	//OVERRIDE HERE YOUR CUSTOM CONTROLLER

}
