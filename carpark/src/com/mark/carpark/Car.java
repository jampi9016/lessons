package com.mark.carpark;

public class Car {

	private String brand;
	private String type;
	private Double engine;
	private Integer topSpeed;
	private TireType tire;

	public Car(String brand, String type, Double engine, Integer topSpeed) {
		this.brand = brand;
		this.type = type;
		this.engine = engine;
		this.topSpeed = topSpeed;

		if (topSpeed > 200) {
			this.tire = TireType.HighSpeed;
		} else {
			this.tire = TireType.LowSpeed;
		}
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public Double getEngine() {
		return engine;
	}

	public Integer getTopSpeed() {
		return topSpeed;
	}

	public TireType getTire() {
		return tire;
	}
	
	@Override
	public String toString() {
		return brand + ", " + type + ", " + engine + ", " + topSpeed + ", " + tire;
	}

}
