package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;

import com.javacourse.project.hibernateAndJpa.Entities.City;

public interface ICityService {
	List<City> getAll();
	void add(City city); //Signature yani imza olarak adlandırılır.
	void update(City city);
	void delete(City city);
	City getById(int id);
}
