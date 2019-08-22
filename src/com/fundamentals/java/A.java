package com.fundamentals.java;
/*
 * A through D classes demonstrate
 * a simple example of polymorphism
 * patterned after example on pages 74-75
 * */
public class A {
  public String position;
  public int number;
  public void Call() {
      System.out.println(this.position + " letter of the alphabet");
      System.out.println("\'A\' is alphabet letter number " + this.number);
  }
}
