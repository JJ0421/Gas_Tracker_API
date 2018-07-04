package com.GasTracker.API.CarData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarsService implements ICarsService{

	@Autowired
	private CarsRepository _carsRepo;
	
	public Car getCarInfo(String key) {
		return _carsRepo.getCarInfo(key);
	}
	
	public List<String> getMakes(){
		return _carsRepo.getMakes();
	}


	public List<String> getModels(String make) {
		return _carsRepo.getModels(make);
	}


	public List<Integer> getYears(String make, String model) {
		return _carsRepo.getYears(make, model);
	}
	
	public List<VehicleInfo> getAll(){
		return _carsRepo.getAll();
	}
	
}
