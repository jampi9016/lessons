package com.mark.carpark;

public enum TireType {
	HighSpeed("H"), LowSpeed("L");
	
	private String name;
	
	private TireType(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
//	@Override
//	public String toString() {
//		switch (this) {
//		case HighSpeed:
//			return "H";
//		case LowSpeed:
//			return "L";
//		default:
//			throw new IllegalArgumentException();
//		}
//	}
}
