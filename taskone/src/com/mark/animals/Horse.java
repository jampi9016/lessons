package com.mark.animals;

public class Horse extends Animal {

  public Horse(String name) {
    super(name);
  }

  @Override
  public void talk() {
    System.out.println("NYIHAHAHAHA");
  }

}
