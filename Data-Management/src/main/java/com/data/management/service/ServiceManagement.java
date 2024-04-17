package com.data.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.management.model.ModelTask;
import com.data.management.model.ModelUsers;
import com.data.management.repository.TaskRepository;
import com.data.management.repository.UsersRepository;

@Service
public class ServiceManagement {
	
	@Autowired
	TaskRepository taskRepository;
	
	@Autowired
	UsersRepository usersRepository;

	public  ModelUsers saveData(ModelUsers modelUsers) {
		return usersRepository.save(modelUsers);
	}

	
	
	

}
