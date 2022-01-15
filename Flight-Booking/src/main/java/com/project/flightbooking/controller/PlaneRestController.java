package com.project.flightbooking.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.flightbooking.entity.Plane;
import com.project.flightbooking.service.PlaneService;

import AirlinesEnum.Airlines;


@RestController
@RequestMapping(path="/api")
public class PlaneRestController {
	
	Logger logger = LoggerFactory.getLogger(PlaneRestController.class);
	
	
	@Autowired
	PlaneService planeservice;


	@RequestMapping(path ="/listplane")
	public List<Plane> listAll()
	{
		logger.info("get list of all plane");
		System.out.println("here to get list");
		return planeservice.listallplane();
	}
	
	@RequestMapping(path ="/plane/searchByName")
	@ResponseBody
	public List<Plane> SearchByName(@RequestParam String name)
	{
		logger.info("get list of all plane");
		System.out.println("here to get list");
//		logger.info("Air line name to iD is "+Airlines.getId());
		return planeservice.searchPlanebyName(Airlines.EMIRATES.getId());
	}
	
	
	@PostMapping(path ="/saveplane")
	public Plane saveplane(@RequestBody Plane plane)
	{
		logger.info("register plane and add in database." +plane);
		planeservice.save(plane);
		return plane;
	}

	@RequestMapping(path ="/getAirlinebyId/{enumid}")
	public Airlines getAirlinebyID(@PathVariable int enumid)
	{
		System.out.println("here to get list");
		return Airlines.getById(enumid);
	}
	
	@RequestMapping(path ="/getAirlinebyPlanes/{planes}")
	public Airlines getAirlineByPlanes(@PathVariable int planes)
	{

		System.out.println("here to get list");
		return Airlines.getBytotalPlanes(planes);
	}
	
	
	@PostMapping(path = "plane/addplane")
	public void addPlane(@RequestBody Plane plane) {
		logger.info("register plane and add in database." +plane);
		planeservice.save(plane);
		logger.info("registered " +plane);
		if (plane == null) {
			logger.info("new plane registration failed" +plane);
			throw new RuntimeException("new plane not created or saved: ");
		
		}
		
	}
	


}
