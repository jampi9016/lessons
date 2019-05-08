package com.mark.animals;

public class Cat extends Animal {

  public Cat(String name) {
    super(name);
  }

  @Override
  public void talk() {
    System.out.println("MIAU MIAU MIAU");
  }

}
