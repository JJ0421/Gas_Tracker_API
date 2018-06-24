package com.GasTracker.API.CarData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarsService implements ICarsService{

	@Autowired
	private CarsRepository _carsRepo;
	
	public Car findByKey(String key) {
		return _carsRepo.findByKey(key);
	}
	
	public List<String> getMakes(){
		return _carsRepo.getMakes();
	}
	
}
