package com.fundamentals.java;
/*
 * DinnerTable and CoffeeTable classes demonstrate how
 * to use Constructors in base and derived classes
 * patterned after example on pages 71-72
 * */
public class DinnerTable {
    public String center;
    public String shape;
    public int height;
    public void Display() {
        System.out.println("The supper table has an optional " +this.center + " in the middle.");
        System.out.println("and it is " + this.shape + " shaped.");
        System.out.println("It\'s " + this.height + " centimeters tall.");
    }

    public DinnerTable() {
        System.out.println("The dinner table constructor is the base constructor.");
        System.out.println("and the base constructor gets called first.");
    }
}

