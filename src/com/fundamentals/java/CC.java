package com.fundamentals.java;

public class CC extends BC
{
    public char FirstDigit;
    public char SecondDigit;
    public int NumberOfStrokes;

    public void Tell() {
        System.out.println("For CC, the first digit is " + this.FirstDigit +
                " and the second is " + this.SecondDigit + ".");
        System.out.println("Both digits together are written with " + this.NumberOfStrokes + " pencil strokes.\n");
    }
    public void Environment() {
        System.out.println("Runtime Environment\n");
    }
}
