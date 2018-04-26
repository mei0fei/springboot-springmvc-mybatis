package com.example.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.model.City;

public interface CityService {
	City save(City city);
	City findOne(long id);
	Page<City> findAll(Pageable pageable);
	Long count();
	void delete(City city);
	boolean exists(long id);
	
}
