package com.GasTracker.API.CarData;


public class Car {
	
	public int id;
	public String manufacturer;
	public String make;
	public String model;
	public int city;
	public int hwy;
	public int cmb;
	public int year;
	public String data_key;
	
	
	public Car(int id, String manufacturer, String make, String model, int city, int hwy, int cmb, int year, String data_key) {
		this.id = id;
		this.manufacturer = manufacturer;
		this.make = make;
		this.model = model;
		this.city = city;
		this.hwy = hwy;
		this.cmb = cmb;
		this.year = year;
		this.data_key = data_key;
	}
	
	public Car() {
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}
	public int getHwy() {
		return hwy;
	}
	public void setHwy(int hwy) {
		this.hwy = hwy;
	}
	public int getCmb() {
		return cmb;
	}
	public void setCmb(int cmb) {
		this.cmb = cmb;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getData_key() {
		return data_key;
	}
	public void setData_key(String data_key) {
		this.data_key = data_key;
	}
	

}
