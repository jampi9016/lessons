package com.mark.shelter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void clearAge(Animal animal) {
		animal.setAge(0);
	}

	public static void main(String[] args) {

		Dog a = new Dog("Buksi", 3, Gender.Male);
		Dog b = new Dog("Fickó", 10, Gender.Male);
		Dog c = new Dog("Zoknis", 5, Gender.Female);
		Cat d = new Cat("Cirmi", 2, Gender.Female);
		Cat e = new Cat("Kormi", 5, Gender.Male);
		Cat f = new Cat("Sanyi", 3, Gender.Male);

		List<Animal> animals = new ArrayList<Animal>();
		animals.add(a);
		animals.add(b);
		animals.add(c);
		animals.add(d);
		animals.add(e);
		animals.add(f);

		a.pant();

		for (Animal animal : animals) {
			System.out.println(animal);
		}

		for (Animal animal : animals) {
			clearAge(animal);
		}
		
		for (Animal animal : animals) {
			System.out.println(animal);
		}
		
		Man man1 = new Man("Béla");
		Hero man2 = new Hero("Batman");
		man1.eat();
		man2.eat();
		man2.fly();

//		Dog[] dogArray = { a, b, c };
//
//		System.out.println("Array of dogs:");
//		for (int i = 0; i < dogArray.length; i++) {
//			System.out.println(dogArray[i]);
//
//		}
//
//		System.out.println("\n");
//
//		List<Dog> dogs = new ArrayList<Dog>();
//		dogs.add(a);
//		dogs.add(b);
//		dogs.add(c);
//
//		System.out.println("List of dogs:");
//		for (Dog dog : dogs) {
//			System.out.println(dog);
//			dog.talk();
//		}
//
//		System.out.println("\n");
//
//	
//
//		System.out.println("List of cats:\n");
//		List<Cat> cats = new ArrayList<Cat>();
//		cats.add(d);
//		cats.add(e);
//		cats.add(f);
//
//		for (Cat cat : cats) {
//			System.out.println(cat);
//			cat.talk();
//		}
//
//		System.out.println("\n");
//		a.talk();
//		d.talk();

	}

}
