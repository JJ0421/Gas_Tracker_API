package com.GasTracker.API.CarData;

import java.util.List;

public interface ICarsService {
	public Car getCarInfo(String key);	
	public List<String> getMakes();
	public List<String> getModels(String make);
	public List<Integer> getYears(String make, String model);
}
