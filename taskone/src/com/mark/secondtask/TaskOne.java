package com.mark.secondtask;

public class TaskOne {

  public static void main(String[] args) {
    
    f(10);
    f(3);
    f(6);
  }
  
  public static void f(int k) {

    for (int i = 0; i < k; i += 2) {
      System.out.println(i);
    }
  }

}
