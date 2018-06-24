package com.GasTracker.API.CarData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsController implements ICarsController{

	@Autowired
	private CarsService _carsService;
	
	@RequestMapping("/api/findCar/{key}")
	public Car getCarInfo(@PathVariable String key) {
		return _carsService.getCarInfo(key);
	}
	
	@RequestMapping("api/getMakes")
	public List<String> getMakes(){
		return _carsService.getMakes();
	}
	
	@RequestMapping("api/getModels/{make}")
	public List<String> getModels(@PathVariable String make){
		return _carsService.getModels(make);
	}
	
	@RequestMapping("/api/getYears/{make}/{model}")
	public List<Integer> getYears(@PathVariable String make, @PathVariable String model){
		return _carsService.getYears(make,  model);
	}
	
}
