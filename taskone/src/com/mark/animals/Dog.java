package com.mark.animals;

public class Dog extends Animal {
  
  public Dog(String name) {
    super(name);
  }
  
  @Override
  public void talk() {
    System.out.println("VAU VAU VAU!");
    

    System.out.println(" -------- ");
    System.out.println("|        |");
    System.out.println("|        |");
    System.out.println("|        |");
    System.out.println(" --------");
  }
  
  public void runInCircle() {
    // ...
  }

}
