package com.project.flightbooking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.flightbooking.dao.PlaneRepository;
import com.project.flightbooking.entity.Plane;

@Service
@Transactional
public class PlaneServiceImp implements PlaneService {

	@Autowired
	PlaneRepository planeRepo;
	


	@Override
	public List<Plane> listallplane() {
		// TODO Auto-generated method stub
		System.out.println("here to check list1");
		return  planeRepo.findAll();
		
			
	}



	@Override
	public Plane findbyId(int id) {
		// TODO Auto-generated method stub
		Optional<Plane> result = planeRepo.findById(id);
		Plane plane = null; 
		if(result.isPresent())
		{
			plane=result.get();
		}else
		{
			 throw new RuntimeException("nothing found with id "+ id);
		}
		return plane;
	}

	@Override
	public void save(Plane plane) {
		// TODO Auto-generated method stub
		System.out.println(plane);
		planeRepo.save(plane);
	}

	@Override
	public void deletebyId(int id) {
		// TODO Auto-generated method stub
		planeRepo.deleteById(id);
	}



	@Override
	public List<Plane> searchPlanebyName(int nameid) {
	//	 TODO Auto-generated method stub
		if((Integer)nameid == null ) {
		return  planeRepo.findbyName(nameid);
		}
		System.out.println("name received is "+nameid);
		
		return planeRepo.findAll();
	
	}

}
