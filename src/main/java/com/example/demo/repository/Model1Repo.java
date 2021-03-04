package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Model1Dto;
import com.example.demo.model.Model1;

@Repository
public interface Model1Repo extends JpaRepository<Model1, Integer> {

	@Query(value = "select m1.*,m2.type as mtype from model1 m1,model2 m2 where model1.id=model2.mod2",nativeQuery = true)
	List<Model1Dto> findAllByDto();
	
}
