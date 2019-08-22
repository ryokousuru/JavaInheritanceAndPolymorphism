package com.fundamentals.java;
/*
 * DinnerTable and CoffeeTable classes demonstrate how
 * to use Constructors in base and derived classes
 * patterned after example on pages 71-72
 * */
public class CoffeeTable extends DinnerTable {
    public void Display() {
        System.out.println("The coffee table has " + this.center + " in the middle.");
        System.out.println("and it is " + this.shape + " shaped.");
        System.out.println("Is is " + this.height + " centimeters tall.");
    }
    public CoffeeTable() {
        System.out.println("The coffee table constructor is not the base constructor.");
        System.out.println("and it doesn\'t get called first.");
    }
}
