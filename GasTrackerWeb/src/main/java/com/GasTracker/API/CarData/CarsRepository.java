package com.GasTracker.API.CarData;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CarsRepository {

	@Autowired
	private JdbcTemplate _jdbcTemplate;
	
	public Car getCarInfo(String key) {	
		key = key.replace('^', '/');
		Car car = null;
		List<Car> result = _jdbcTemplate.query("SELECT * FROM mpg_data WHERE data_key = ?",
				(rs, rowNum) ->  new Car(rs.getInt("id"), rs.getString("manufacturer"), rs.getString("make"), rs.getString("model"), rs.getInt("city"), rs.getInt("hwy"), rs.getInt("cmb"), rs.getInt("year"), rs.getString("data_key")
				), key);
		if(result.size() > 0) {
			car = result.get(0);
		}else {
			car = null;
		}
		
		//Cool bean way ;)
		//Leaving this here for future reference
	    //car = (Car) _jdbcTemplate.queryForObject("SELECT * FROM mpg_data WHERE data_key = ?",  new BeanPropertyRowMapper(Car.class), key);
		
		return car;
	}
	
	public List<String> getMakes(){
		List<String> result = _jdbcTemplate.queryForList("SELECT DISTINCT make FROM mpg_data ORDER BY make ASC", String.class);
		return result;
	}
	
	public List<String> getModels(String make){
		List<String> result = _jdbcTemplate.queryForList("SELECT DISTINCT model FROM mpg_data WHERE make = ? ORDER BY model ASC", String.class, make);
		return result;
	}
	
	public List<Integer> getYears(String make, String model){
		List<Integer> result = _jdbcTemplate.queryForList("SELECT DISTINCT year FROM mpg_data WHERE make = ? AND model = ? ORDER BY year ASC", Integer.class, make, model);
		return result;
	}
	
	public List<VehicleInfo> getAll(){
		List<VehicleInfo> result = new ArrayList<VehicleInfo>();
		List<String> makes = getMakes();
		for(int i = 0; i < makes.size(); i++) {
			VehicleInfo info = new VehicleInfo();
			info.make = makes.get(i);
			info.models = new ArrayList<ModelInfo>();
			
			List<String> models = getModels(makes.get(i));
			for(int j = 0; j < models.size(); j++) {
				ModelInfo modelInfo = new ModelInfo();
				modelInfo.model = models.get(j);
				modelInfo.years = getYears(makes.get(i), models.get(j));
				info.models.add(modelInfo);
			}
			result.add(info);
		}
		
		return result;
	}
	
	
	
}
