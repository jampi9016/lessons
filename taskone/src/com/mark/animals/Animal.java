package com.mark.animals;

public abstract class Animal {
  
  protected String name;

  protected Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  abstract void talk();

}
