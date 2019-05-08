package com.mark.animals;

public class Main {

  public static void main(String[] args) {
    
    Animal a = new Cat("Cirmike");
    Animal b = new Dog("Morzsi");
    Animal c = new Horse("Sanyi");
    
    doSomething(a);
    doSomething(b);
    doSomething(c);
  }

  public static void doSomething(Animal a) {
    System.out.println(a.getName() + " talk!");
    a.talk();
  }

}
