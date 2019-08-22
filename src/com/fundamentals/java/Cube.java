package com.fundamentals.java;
/*
 * Demonstrates a simple one method class
 * patterned after example on pages 63-64
 * */
public class Cube {
    public int numberOfCorners;
    public String color;
    public void Turn() {
        System.out.println("The number of corners is " + this.numberOfCorners);
        System.out.println("The cube is as " + this.color + " as the petals on a daisy.");

        /*
        * simple boolean tests on assignment operators
        * while loops from Head First Java by Kathy Sierra
        * and Bert Bates - page 11 example
        * */

        int x = 9;
        while(x > 4) {
            /*
            * loop will run because
            * x is greater than 4
            * or else would loop forever
            * */
            x = x - 1;
            System.out.println(x);
        }
        int z = 27;
        while(z == 17) {
            /*
            * loop code won't run because
            * z is not equal to 17
            * */
            System.out.println(z);
        } // end of the while loop
    } // end of the Turn method
}
