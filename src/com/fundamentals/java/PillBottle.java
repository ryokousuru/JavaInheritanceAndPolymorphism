package com.fundamentals.java;
/*
 * WaterBottle and PillBottle classes demonstrate
 * how to use an inherited class with redefined functions
 * patterned after example on pages 69-70
 * */
public class PillBottle extends WaterBottle{

    public void Unscrew()
    {
        System.out.println("It\'s a " + this.color + " " + this.type + " bottle");
        System.out.println("It\'s " + this.height + " centimeters tall.");
        System.out.println("It contains " + this.capacity + " ounces.");
    }
}
