package com.project.flightbooking.service;

import java.util.List;

import com.project.flightbooking.entity.Plane;

public interface PlaneService {
	
	
	public List<Plane> listallplane();
	public Plane findbyId(int id);
	public void save(Plane plane);
	public void deletebyId(int id);
	public List<Plane> searchPlanebyName(int i);

}
