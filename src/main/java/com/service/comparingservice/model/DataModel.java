package com.service.comparingservice.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import javassist.bytecode.Descriptor.Iterator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DataModel {
	private Long id;
	private String IdentificationID;
	private int engineinformationengine_statisticshorsepower;
	private int fuelinformationhighwaympg;
	public static List<DataModel> getFromList(List<Car> cr)
	{
		
		List<DataModel> dm;
		dm= new ArrayList<DataModel>();
		java.util.Iterator<Car> itr=cr.iterator();
		while(itr.hasNext())
		{
		Car car=itr.next();
		DataModel d= new DataModel(car.getId(),car.getIdentificationID(),car.getEngineinformationengine_statisticshorsepower(),car.getFuelinformationhighwaympg());
		dm.add(d);
		}
		return dm;
	}
}
