package com.demo.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.dao.CountryDAO;
import com.demo.spring.model.Country;

@Service("countryService")
public class CountryService {

	@Autowired
	CountryDAO countryDao;
	
	@Transactional
	public List<Country> getAllCountries(){
		return countryDao.getAllCountries();
	}
	
	@Transactional
	public Country getCountry(int id) {
		return countryDao.getCountry(id);
		
	}
	
	@Transactional
	public void addCountry(Country country) {
		countryDao.addCountry(country);
	}
	
	@Transactional
	public void updateCountry(Country country) {
		countryDao.updateCountry(country);
	}
	
	@Transactional
	public void deleteCountry(int id) {
		countryDao.deleteCountry(id);
	}
}
