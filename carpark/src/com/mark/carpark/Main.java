package com.mark.carpark;

public class Main {

	public static void main(String[] args) {

		Car a = new Car("BMW", 15600);
		Car b = new Car("Audi", 200000);
		
		a.print();
		b.print();
		
		System.out.println("My A car is: " + a);
		System.out.println("My B car is: " + b);
		
		
//		System.out.println(a.getBrand() + ", " + a.getMileage());
//		System.out.println(b.getBrand() + ", " + b.getMileage());
	}
	
	
	// az auto adatait felvinni a carpark.c alapj�n 
	// enum haszn�lata
	// to string vesszovel elv�laszt �s k�l�n print car form�zva
	
//
//	public static void details(Car a) {
//		System.out.println(a.getName());
//		a.details();
//	}
}
