package com.skaffolderwc.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.PropertySource;

import com.skaffolderwc.controller.base.CompanyBaseController;

@RestController
@PropertySource("classpath:${configfile.path}/skaffolderWC.properties")
@RequestMapping(value="${endpoint.api}", headers = "Accept=application/json")
public class CompanyController extends CompanyBaseController {

	//OVERRIDE HERE YOUR CUSTOM CONTROLLER

}
