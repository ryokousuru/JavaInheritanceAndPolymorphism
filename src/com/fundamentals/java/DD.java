package com.fundamentals.java;

public class DD extends CD
{
    public char FirstDigit;
    public char SecondDigit;
    public int NumberOfStrokes;

    public void Tell() {
        System.out.println("For DD, the first digit is " + this.FirstDigit +
                " and the second is " + this.SecondDigit + ".");
        System.out.println("Both digits together are written with " + this.NumberOfStrokes + " pencil strokes.\n");
    }

    public void Alphabet(String up, String down) {                                        //overloaded method
        System.out.println("Each letter has an " + up.toUpperCase() +
                " and a " + down.toLowerCase() + " case form.");
    }

    public void Alphabet(String cap) {                                                    //overloaded method
        System.out.println("That means they can be written in " + cap.toUpperCase() +
                " or non-capital letters.\n");
    }
}

