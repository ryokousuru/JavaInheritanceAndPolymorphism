package com.fundamentals.java;

public class DB extends CB
{
    public char FirstDigit;
    public char SecondDigit;
    public int NumberOfStrokes;

    public void Tell() {
        System.out.println("For DB, the first digit is " + this.FirstDigit +
                " and the second is " + this.SecondDigit + ".");
        System.out.println("Both digits together are written with " + this.NumberOfStrokes + " pencil strokes.\n");
    }

    public void Alphabet(int number) {
        System.out.println("There are " + number + " vowels in the alphabet.");  //overloaded method
    }

    public void Alphabet(String No, String British) {
        System.out.println("That is, there are " + No + " vowels in the " + British + " alphabet.\n");  //overloaded method
    }
}
