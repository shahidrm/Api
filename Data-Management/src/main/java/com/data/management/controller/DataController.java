package com.data.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.management.model.ModelTask;
import com.data.management.model.ModelUsers;
import com.data.management.service.ServiceManagement;

@RestController
public class DataController {
	
	@Autowired
	ServiceManagement serviceManagement;
	
	@PostMapping("/createData")
	public ModelUsers saveData(@RequestBody ModelUsers modelUsers) {
		return serviceManagement.saveData(modelUsers);
	}

}
