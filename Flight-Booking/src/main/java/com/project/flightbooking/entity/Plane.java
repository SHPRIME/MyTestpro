package com.project.flightbooking.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import AirlinesEnum.Airlines;

@Entity
@Table(name="PLANE")
@NamedNativeQuery(name = "Plane.findbyName", query = "SELECT * FROM Plane WHERE airlineId = ?", resultClass = Plane.class)
@NamedNativeQuery(name = "Plane.findByCapacity", query = "SELECT * FROM Plane WHERE passengercapacity = ?", resultClass = Plane.class)
public class Plane{


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", nullable=false)
	private Integer id;

	@Enumerated(EnumType.STRING)
	@Column(name="AIRLINE_ID", length=20)
	private Airlines airlineId;

	@Column(length=100)
	private String destinationairport;

	@Column(length=10)
	private String fareinaed;

	@Column(length=100)
	private String manufacturer;

	@Column(length=100)
	private String originairport;

	@Column(length=10)
	private String passengercapacity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Airlines getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(Airlines airlineId) {
		this.airlineId = airlineId;
	}

	public String getDestinationairport() {
		return destinationairport;
	}

	public void setDestinationairport(String destinationairport) {
		this.destinationairport = destinationairport;
	}

	public String getFareinaed() {
		return fareinaed;
	}

	public void setFareinaed(String fareinaed) {
		this.fareinaed = fareinaed;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getOriginairport() {
		return originairport;
	}

	public void setOriginairport(String originairport) {
		this.originairport = originairport;
	}

	public String getPassengercapacity() {
		return passengercapacity;
	}

	public void setPassengercapacity(String passengercapacity) {
		this.passengercapacity = passengercapacity;
	}
	
	
		
}











