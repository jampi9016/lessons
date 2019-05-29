package com.mark.shelter;

public class Dog implements Animal {

	private String name;
	private Integer age;
	private Gender gender;

	public Dog(String name, Integer age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String getName() {		
		return name;
	}

	@Override
	public Integer getAge() {
		return age;
	}
	
	@Override
	public void setAge(Integer age) {
		this.age = age;		
	}
	
	@Override
	public Gender getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return name + ", " + age + ", " + gender;
	}

	@Override
	public void talk() {
		System.out.println("VAU");
	}
	
	public void pant() {
		System.out.println("ASD");
	}



}
