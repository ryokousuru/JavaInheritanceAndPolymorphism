package com.fundamentals.java;
/*
 * AA through DE classes demonstrate
 * an example of polymorphism
 * patterned after example on page 76
 * Classes AB - AE extend from AA (hierarchical)
 * Classes BB-DB extend from AB (multlevel)
 * ditto for BC-DC to AC, BD-DD to AD & BE-DE to AE
 * all subclasses override superclasses.
 * see also below
 * */
public class AA
{
    public char FirstDigit;
    public char SecondDigit;
    public int NumberOfStrokes;

    public void Tell() {
        System.out.println("For AA, the first digit is " + this.FirstDigit +
                " and the second is " + this.SecondDigit + ".");
        System.out.println("Both digits together are written with " + this.NumberOfStrokes + " pencil strokes.");

    }
}
/*
* Number of Strokes variable meaning - for example, the letter C is written
* with one 1 pencil stroke; B can be written with 2 or 3, depending on how
* the individual chooses to write it.
* */
