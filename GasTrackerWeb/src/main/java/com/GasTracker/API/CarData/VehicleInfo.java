package com.GasTracker.API.CarData;

import java.util.ArrayList;
import java.util.List;

public class VehicleInfo {
	public String make;
	public List<ModelInfo> models;
	
	public VehicleInfo() {
		
	}
	
	public VehicleInfo(String make, List<ModelInfo> models) {
		this.make = make;
		this.models = models;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public List<ModelInfo> getModels() {
		return models;
	}
	public void setModels(List<ModelInfo> models) {
		this.models = models;
	}		
}



