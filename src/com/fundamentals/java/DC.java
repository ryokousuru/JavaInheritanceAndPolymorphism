package com.fundamentals.java;

public class DC extends CC
{
    public char FirstDigit;
    public char SecondDigit;
    public int NumberOfStrokes;

    public void Tell() {
        System.out.println("For DC, the first digit is " + this.FirstDigit +
                " and the second is " + this.SecondDigit + ".");
        System.out.println("Both digits together are written with " + this.NumberOfStrokes + " pencil strokes.\n");
    }

    public void Alphabet(int number) {
        System.out.println("There are " + number + " consonants in the alphabet.");  //overloaded method
    }

    public void Alphabet(String No, String America) {
        System.out.println("That is, there are " + No + " consonants in the " + America + " alphabet.\n");  //overloaded method
    }
}
