package com.GasTracker.API.CarData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CarsRepository {

	@Autowired
	private JdbcTemplate _jdbcTemplate;
	
	public Car findByKey(String key) {	
		
		Car car = null;
		List<Car> result = _jdbcTemplate.query("SELECT * FROM mpg_data WHERE data_key = ?",
				(rs, rowNum) ->  new Car(rs.getInt("id"), rs.getString("manufacturer"), rs.getString("make"), rs.getString("model"), rs.getInt("city"), rs.getInt("hwy"), rs.getInt("cmb"), rs.getInt("year"), rs.getString("data_key")
				), key);
		if(result.size() > 0) {
			car = result.get(0);
		}else {
			car = null;
		}
		
		//Cool bean way
		//Leaving this here for future reference
	    //car = (Car) _jdbcTemplate.queryForObject("SELECT * FROM mpg_data WHERE data_key = ?",  new BeanPropertyRowMapper(Car.class), key);
		
		return car;
	}
	
	public List<String> getMakes(){
		List<String> result = _jdbcTemplate.queryForList("SELECT make FROM mpg_data", String.class);
		return result;
	}
	
	
}