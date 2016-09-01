package edu.services;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
//@Table(name = "Experimental_Condition")
public class ExperimentalConditions {
	
	private long experimental_id;
	String lightOn;
	int tempDay;
	String lightOff;
	int tempNight;
	boolean nightInterrupt;
	int numOfPots;
	String containerSize;
	String potSpace;
	String watering;
	String species;
	
	private Application application;
	@ManyToOne
    @JoinColumn(name = "applicationid")
	@JsonBackReference
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
	public ExperimentalConditions(){
	}
	public String getLightOn() {
		return lightOn;
	}
	public void setLightOn(String lightOn) {
		this.lightOn = lightOn;
	}
	public int getTempDay() {
		return tempDay;
	}
	public void setTempDay(int tempDay) {
		this.tempDay = tempDay;
	}
	public String getLightOff() {
		return lightOff;
	}
	public void setLightOff(String lightOff) {
		this.lightOff = lightOff;
	}
	public int getTempNight() {
		return tempNight;
	}
	public void setTempNight(int tempNight) {
		this.tempNight = tempNight;
	}
	public boolean isNightInterrupt() {
		return nightInterrupt;
	}
	public void setNightInterrupt(boolean nightInterrupt) {
		this.nightInterrupt = nightInterrupt;
	}
	public int getNumOfPots() {
		return numOfPots;
	}
	public void setNumOfPots(int numOfPots) {
		this.numOfPots = numOfPots;
	}
	public String getContainerSize() {
		return containerSize;
	}
	public void setContainerSize(String containerSize) {
		this.containerSize = containerSize;
	}
	public String getPotSpace() {
		return potSpace;
	}
	public void setPotSpace(String potSpace) {
		this.potSpace = potSpace;
	}
	public String getWatering() {
		return watering;
	}
	public void setWatering(String watering) {
		this.watering = watering;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getExperimental_id() {
		return experimental_id;
	}
	public void setExperimental_id(long experimental_id) {
		this.experimental_id = experimental_id;
	}
	
}
