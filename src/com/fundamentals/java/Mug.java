package com.fundamentals.java;
/*
 * Mug and Cup classes demonstrate how
 * to use an inherited class with functions
 * patterned after example on pages 68-69
 * */
public class Mug {
    public String shape;
    public int capacity;
    public void Pour() {
        System.out.println("Apart from the handle, the shape is " + this.shape);
        System.out.println("The capacity is right about " + this.capacity + " ounces.");
    }
}
