package com.project.flightbooking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.project.flightbooking.entity.Plane;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Integer> {
	

	List<Plane> findbyName(int name);
	List<Plane> findByCapacity(String capacity);
	

}
