package com.GasTracker.API.CarData;

import java.util.List;

public interface ICarsService {
	public Car findByKey(String key);
	
	public List<String> getMakes();
}
