package com.mark.carpark;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Car a = new Car("BMW", "E36", 1.6, 207);
		Car b = new Car("Audi", "A5", 2.0, 199);
		
		List<Car> carpark = new ArrayList<Car>();
		carpark.add(a);
		carpark.add(b);
		carpark.add(new Car("Mazda", "6", 2.5, 250));
		
//		Iterator<Car> iterator = carpark.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());			
//		}
		
		for (Car car : carpark) {
			System.out.println(car);
		}
	
//		=============================
//		
//		for (int i = 0; i < carpark.size(); i++) {
//			System.out.println(carpark.get(i));
//		}

//		=============================
//		
//		Car[] carpark = { a, b };
//		
//		for (int i = 0; i < carpark.length; i++) {
//			System.out.println(carpark[i]);				
//		}
		
//		=============================
//		
//		Car[] carpark = new Car[5];
//		
//		carpark[0] = a;
//		carpark[1] = b;
//		
//		for (int i = 0; i < carpark.length; i++) {
//			if (carpark[i] != null) {
//				System.out.println(carpark[i]);	
//			}
//			
//		}

//		=============================
//		
		
//		System.out.println("My A car is: " + a.toString());
//		System.out.println("My B car is: " + b);
		
		
//		System.out.println(a.getBrand() + ", " + a.getMileage());
//		System.out.println(b.getBrand() + ", " + b.getMileage());
	}
	
	
	// az auto adatait felvinni a carpark.c alapján 
	// enum használata
	// to string vesszovel elválaszt és külön print car formázva
	
//
//	public static void details(Car a) {
//		System.out.println(a.getName());
//		a.details();
//	}
}
