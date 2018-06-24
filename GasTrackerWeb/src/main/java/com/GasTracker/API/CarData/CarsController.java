package com.GasTracker.API.CarData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsController {

	@Autowired
	private CarsService _carsService;
	
	@RequestMapping("/api/findCar/{key}")
	public Car getCarInfo(@PathVariable String key) {
		return _carsService.findByKey(key);
	}
	
	@RequestMapping("api/getMakes")
	public List<String> getMakes(){
		return _carsService.getMakes();
	}
}
