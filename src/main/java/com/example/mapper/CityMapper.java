
package com.example.mapper;

import java.util.List;


import com.example.model.City;


public interface CityMapper {
	List<City> findAllCity();
	City selectCityById(long id);
	void insertCity(City city);
	void updateCity(City city);
	void deleteCity(long id);
	City findByState(String state);
	long count();
	
}
