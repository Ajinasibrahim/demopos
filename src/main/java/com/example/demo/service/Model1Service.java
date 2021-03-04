package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Model1Dto;
import com.example.demo.model.Model1;
import com.example.demo.model.Model2;
import com.example.demo.repository.Model1Repo;
@Service
public class Model1Service {
	
	@Autowired
	Model1Repo model1Repo;
	


	public List<Model1Dto> getdto() {
	
		return model1Repo.findAllByDto();
	}

	public void add(Model1 m) {

		model1Repo.save(m);
	}


}
