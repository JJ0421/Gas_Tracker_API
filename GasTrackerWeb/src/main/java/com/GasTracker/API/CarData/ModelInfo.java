package com.GasTracker.API.CarData;

import java.util.List;

public class ModelInfo{
	public String model;
	public List<Integer> years;
	
	public ModelInfo() {
		
	}
	
	public ModelInfo(String model, List<Integer> years) {
		this.model = model;
		this.years = years;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public List<Integer> getYears() {
		return years;
	}
	public void setYears(List<Integer> years) {
		this.years = years;
	}
	
}