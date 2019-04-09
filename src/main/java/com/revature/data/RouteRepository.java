package com.revature.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer>{

}
