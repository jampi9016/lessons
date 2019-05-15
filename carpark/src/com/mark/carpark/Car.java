package com.mark.carpark;

public class Car {

	private String brand;

	private Integer mileage;

	public Car(String brand, Integer mileage) {
		this.brand = brand;
		this.mileage = mileage;
	}

	public void print() {
		System.out.println(this);
	}

	public String getBrand() {
		return brand;
	}

	public Integer getMileage() {
		return mileage;
	}

	@Override
	public String toString() {
		return brand + ", " + mileage;
	}

}
