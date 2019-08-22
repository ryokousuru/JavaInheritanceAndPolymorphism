package com.fundamentals.java;
/*
 * A through D classes demonstrate
 * a simple example of polymorphism
 * patterned after example on pages 74-75
 * */
public class D extends C {
    public void Call() {
        System.out.println(this.position + " letter of the alphabet");
        System.out.println("\'D\' is alphabet letter number " + this.number);
    }
}
