package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "model2")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Model2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String mname;
	private boolean status;
	private String type;
	
	@ManyToOne
	@JoinColumn(name = "mod1")
	@JsonBackReference("manage")
	private Model1 m1;

}
