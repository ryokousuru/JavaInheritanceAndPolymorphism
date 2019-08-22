package com.fundamentals.java;

public class CB extends BB
{
    public char FirstDigit;
    public char SecondDigit;
    public int NumberOfStrokes;

    public void Tell() {
        System.out.println("For CB, the first digit is " + this.FirstDigit +
                " and the second is " + this.SecondDigit + ".");
        System.out.println("Both digits together are written with " + this.NumberOfStrokes + " pencil strokes.\n");
    }
    public void Fast() {
        System.out.println("running around\n");
    }
}
