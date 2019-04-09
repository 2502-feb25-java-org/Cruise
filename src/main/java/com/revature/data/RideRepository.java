package com.revature.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Ride;

@Repository
public interface RideRepository extends JpaRepository<Ride, Integer>{

}
