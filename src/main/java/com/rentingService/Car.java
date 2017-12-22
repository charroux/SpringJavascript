package com.rentingService;


/**
 * 
 * @author Dupeyrat Kevin
 * 
 * Class qui représente une voiture
 * Elle aura pour attribut une couleur, une marque, un model
 * et une plaque d'immatriculation
 *
 */

public class Car {
	
	private String plateNumber;
	private String model;
	private boolean rented;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Car(String plateNumber, String model, boolean rented) {
		super();
		this.plateNumber = plateNumber;
		this.model = model;
		this.rented = rented;
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public boolean isRented() {
		return rented;
	}
	
	public void setRented(boolean rented) {
		this.rented = rented;
	}

	@Override
	public String toString() {
		return "Car [plateNumber=" + plateNumber + ", model=" + model
				+ ", rented=" + rented + "]";
	}
	
	
}
