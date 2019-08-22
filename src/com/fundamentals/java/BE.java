package com.fundamentals.java;

public class BE extends AE
{
    public char FirstDigit;
    public char SecondDigit;
    public int NumberOfStrokes;

    public void Tell() {
        System.out.println("For BE, the first digit is " + this.FirstDigit +
                " and the second is " + this.SecondDigit + ".");
        System.out.println("Both digits together are written with " + this.NumberOfStrokes + " pencil strokes.\n");
    }
    public void Swim() {
        System.out.println("Summer\n");
    }
}