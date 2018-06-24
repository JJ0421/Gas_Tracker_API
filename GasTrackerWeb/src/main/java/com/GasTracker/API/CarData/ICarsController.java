package com.GasTracker.API.CarData;

import java.util.List;

public interface ICarsController {
	public Car findByKey(String key);
	public List<String> getMakes();
	public List<String> getModels(String make);
}
