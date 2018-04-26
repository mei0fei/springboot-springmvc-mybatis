package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.City;
import com.example.service.CityService;

@Controller
public class CityController {
	
	@Autowired
    CityService cityService;
	
	
	@GetMapping("/showCities")
    public String findCities(Model model) {
        
		Sort sort = new Sort(new Sort.Order(Direction.ASC, "id"));
		Pageable pageable = new PageRequest(0, 3, sort);
		
        Iterable<City> cities =  cityService.findAll(pageable);
        for(City city: cities) {
        	System.out.println(city);
        }
        return "";
    }
}
