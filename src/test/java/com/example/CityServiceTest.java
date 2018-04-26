
package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.mapper.CityMapper;
import com.example.model.City;
import com.example.service.CityService;


/**
 * Tests for {@link CityMapper}.
 *
 */
@RunWith(SpringRunner.class)
@MybatisTest
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CityServiceTest {

  @Autowired
  private CityService service;

  @Test
  public void findOneTest() {
    City city = service.findOne(1);
    System.out.println(" ------findOneTest-------- ");
    System.out.println(city);
    System.out.println(" ---------------------- ");
    
  }
  
  @Test
  public void findAllTest() {
    /*Iterable<City> citys = service.findAll();
    System.out.println(" ------findAllTest-------- ");
    for(City city : citys) {
    	System.out.println(city);
    }
    System.out.println(" ---------------------- ");
    */
  }
  
  @Test
  public void save() {
	City city = new City();
	city.setCountry("国家");
	city.setState("省");
	city.setName("城市");
	
    city =  service.save(city);
    System.out.println(" ------save-------- ");
    System.out.println(city);
    System.out.println(" ---------------------- ");
    
  }
  
  @Test
  public void count() {
    long count =  service.count();
    System.out.println(" ------count-------- ");
    System.out.println(count);
    System.out.println(" ---------------------- ");
    
  }
  

  @Test
  public void delete() {
	long count = service.count();
    if( service.exists(count-1) ) {
	    System.out.println(" ------delete-------- ");
	    City city = service.findOne(count-1);
	    service.delete(city);
	    System.out.println(" ---------------------- ");
    }
    
  }
  

}
