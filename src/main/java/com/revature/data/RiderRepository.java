package com.revature.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Rider;

@Repository
public interface RiderRepository extends JpaRepository<Rider, Integer>{
	
	Rider findByUsernameIgnoreCase(String username);

}