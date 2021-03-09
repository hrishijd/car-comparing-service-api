package com.service.comparingservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Car")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long        id;
		private int 		dimensionsheight;      
		
		  private int dimensionslength; private int dimensionswidth; private String
		  engineinformationdriveline; private String engineinformationenginetype;
		  private String engineinformationhybrid; private int
		  engineinformationnumberofforwardgears; private String
		  engineinformationtransmission; private int fuelinformationcitympg ; private
		  String fuelinformationfueltype; private int fuelinformationhighwaympg;
		  private String identificationclassification; private String identificationID;
		  private String identificationmake; private String identificationmodelyear;
		  private int identificationyear; private int
		  engineinformationengine_statisticshorsepower; private int
		  engineinformationenginestatisticstorque;
		 
}

