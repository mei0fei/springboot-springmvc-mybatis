
package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.mapper.CityMapper;
import com.example.model.City;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

/**
 * Tests for {@link CityMapper}.
 *
 */
@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CityMapperTest {

  @Autowired
  private CityMapper cityMapper;

  @Test
  public void findByStateTest() {
    City city = cityMapper.findByState("CA");
    System.out.println("---------findByStateTest-----------");
    System.out.println(city);
    assertThat(city.getName()).isEqualTo("San Francisco");
    assertThat(city.getState()).isEqualTo("CA");
    assertThat(city.getCountry()).isEqualTo("US");
  }
  
  @Test
  public void findAllCity() {
	System.out.println("---------findAllCity-----------");
    List<City> cities = cityMapper.findAllCity();
    for(City city: cities) {
    	System.out.println(city);
    }
  }
  
  @Test
  public void insertCity() {
	System.out.println("---------insertCity-----------");
	City city= new City();
	city.setCountry("abc");
	city.setName("xyz");
	city.setState("mnl");
    cityMapper.insertCity(city);
    System.out.println(city);

  }
  
  @Test
  public void deleteCity() {
	  System.out.println("---------deleteCity-----------");
	  long count = cityMapper.count();
	  cityMapper.deleteCity(count-1);
  }
}
