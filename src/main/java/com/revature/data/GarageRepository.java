package com.revature.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Garage;

@Repository
public interface GarageRepository extends JpaRepository<Garage, Integer>{
	

}
