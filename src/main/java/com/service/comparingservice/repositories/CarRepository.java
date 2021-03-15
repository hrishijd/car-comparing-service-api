package com.service.comparingservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.service.comparingservice.model.Car;
import com.service.comparingservice.model.DataModel;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{
	Car findAllByIdentificationIDIgnoreCase(String name);
	@Query(value="select * from car",nativeQuery = true)
	List<Car> findAllNames();
}
