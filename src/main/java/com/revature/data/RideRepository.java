package com.revature.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Ride;
import com.revature.model.Rider;

@Repository
public interface RideRepository extends JpaRepository<Ride, Integer>{
	
	public List<Ride> findByRiderId(int riderId);

}
