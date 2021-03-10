package com.service.comparingservice.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.comparingservice.model.Car;
import com.service.comparingservice.repositories.CarRepository;

import antlr.collections.List;

@RestController
@RequestMapping("/car")
public class RSTController {
	@Autowired
	private CarRepository repo;
	@GetMapping("/{id}")
	public Optional<Car> getCar(@PathVariable("id") Long  id)
	{
		return repo.findById(id);
	}

	
	/*
	 * @PostMapping("/") public java.util.List<Car> saveCar(@RequestBody
	 * java.util.List<Car> car) { return repo.saveAll(car); }
	 */
	 
	@GetMapping("/name/{name}")
	public Car GetNames(@PathVariable("name") String name)
	{
		Car car=repo.findAllByIdentificationIDIgnoreCase(name);
		return car;
	}
	@GetMapping("/list")
	public java.util.List<String> getList()
	{
		return repo.findAllNames();
	}
}
