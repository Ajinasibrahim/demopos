package com.example.demo.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Model1Dto;
import com.example.demo.model.Model1;

import com.example.demo.service.Model1Service;

@RestController
public class Sample {
	@Autowired
	Model1Service model1Service;
	
	@PostMapping("/add")
	public String addmodel1(@RequestBody Model1 m)
	{
		model1Service.add(m);
		return "added";
	}
	@GetMapping("/get")
	public List<Model1Dto> get()
	{
		return model1Service.getdto();
	}
	

}
