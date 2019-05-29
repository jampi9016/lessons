package com.mark.shelter;

public enum Gender {
	Male("M"), Female("F");

	private String name;

	private Gender(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
