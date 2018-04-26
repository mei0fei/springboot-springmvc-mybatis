package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Isolation;


import com.example.model.City;
import com.example.repository.CityRepository;

@Service
@Transactional(
		isolation=Isolation.READ_COMMITTED,
		propagation = Propagation.SUPPORTS, 
		readOnly=true)
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository repository;

	@Override
	@Transactional(readOnly=false)
	public City save(City city) {
		// TODO Auto-generated method stub
		return repository.save(city);
	}

	@Override
	public City findOne(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public Page<City> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return repository.findAll(pageable);
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return repository.count();
	}

	@Override
	@Transactional(readOnly=false)
	public void delete(City city) {
		// TODO Auto-generated method stub
		repository.delete(city);
	}

	@Override
	public boolean exists(long id) {
		return repository.existsById(id);
	}
}