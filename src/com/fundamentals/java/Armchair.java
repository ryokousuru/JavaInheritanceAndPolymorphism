package com.fundamentals.java;
/*
 * Sofa and Armchair classes demonstrate
 * how to use a simple inherited class
 * patterned after example on page 66
 * */
public class Armchair extends Sofa {
    public int numberOfFootrests;
    public void Showcase() {
        System.out.println("There are " + this.numberOfBigCushions + " of the larger cushions.");
        System.out.println("and there are also " + this.numberOfSmallCushions + " of the smaller ones.");
        System.out.println("There are a couple of the " + this.extras + " on top of the sofa.");
        System.out.println("The armchair has " + this.numberOfFootrests + " footrest right above the floor.");
    }
}