package com.revature.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Car;
import com.revature.model.Rider;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{
	
	Car findByStatusIgnoreCase(String status);

}
