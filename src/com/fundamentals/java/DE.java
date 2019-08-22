package com.fundamentals.java;

public class DE extends CE
{
    public char FirstDigit;
    public char SecondDigit;
    public int NumberOfStrokes;

    public void Tell() {
        System.out.println("For DE, the first digit is " + this.FirstDigit +
                " and the second is " + this.SecondDigit + ".");
        System.out.println("Both digits together are written with " + this.NumberOfStrokes + " pencil strokes.\n");
    }

        public void Alphabet (String glyph){                                        //overloaded method
            System.out.println("The English alphabet requires no "
                    + glyph + " marks above native words.");
        }

        public void Alphabet (String goUp, String goDown)
        {                                                                           //overloaded method
            System.out.println("So there are no " + goUp + " or "
                    + goDown + " marks above any of the letters.");
        }
}
