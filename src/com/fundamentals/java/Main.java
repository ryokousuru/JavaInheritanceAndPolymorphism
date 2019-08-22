package com.fundamentals.java;

public class Main {

    public static void main(String[] args) {

        //cubeExample();
        //armchairExample();
        //mugExample();
        //waterBottleExample();
        //dinnerTableExample();
        alphabetExample();
        //doubleAlphabetExample1();
        //doubleAlphabetExample2();
        //doubleAlphabetExample3();
        //doubleAlphabetExample4();
        //doubleAlphabetExample5();
        //doubleAlphabetExample6();
        //doubleAlphabetExample7();
        //doubleAlphabetExample8();
        //doubleAlphabetExample9();  // all classes in format "D*" have method overloading
        //doubleAlphabetExample10();   //run time polymorphism example - classes in "B*" & "C*" format
        }

        /*
         *alphabetExample UML diagram can be viewed at:
         * https://drive.google.com/file/d/10hNlji3bCD3R7NxYrxXSoqcLVyeVjLcX/view?usp=sharing
        * doubleAlphabetExample UML diagram can be viewed at:
        * https://drive.google.com/file/d/1daoDHNK_4HoQMxQq_R7wFVl20oa8WqVd/view?usp=sharing
         */




        public static void cubeExample() {
            Cube cu = new Cube();
            cu.numberOfCorners = 8;
            cu.color = "yellow";
            cu.Turn();
        }

	    // numberOfSmallCushions, numberOfBigCushions & extras
        // properties didn't need to be defined in the subclass

        public static void armchairExample() {

            Armchair ar = new Armchair();
            ar.numberOfSmallCushions = 2;
            ar.numberOfBigCushions = 1;
            ar.extras = "fluffy pillows";
            ar.numberOfFootrests = 1;
            ar.Showcase();
            }
        public static void mugExample() {
            Cup cp = new Cup();
            cp.shape = "cylindrical";
            cp.capacity = 20;
            cp.Pour();
        }
        public static void waterBottleExample() {
            PillBottle pi = new PillBottle();
            pi.type = "pill";
            pi.color = "white";
            pi.height = 7;
            pi.capacity = 2.75;
            pi.Unscrew();
        }
        public static void dinnerTableExample() {
            CoffeeTable cf = new CoffeeTable();
            cf.center = "no leaf";
            cf.shape = "rectangular";
            cf.height = 40;
            cf.Display();
        }

        public static void alphabetExample() {
            A ape = new A();
            ape.position = "First";
            ape.number = 1;
            ape.Call();

            B bat = new B();
            bat.position = "Second";
            bat.number = 2;
            bat.Call();

            C cat = new C();
            cat.position = "Third";
            cat.number = 3;
            cat.Call();

            D dog = new D();
            dog.position = "Fourth";
            dog.number = 4;
            dog.Call();
        }
        public static void doubleAlphabetExample1() {
            AA aa = new AA();
            aa.FirstDigit = 'A';
            aa.SecondDigit = 'A';
            aa.NumberOfStrokes = 6;
            aa.Tell();
        }

        public static void doubleAlphabetExample2() {

            AB ab = new AB();
            ab.FirstDigit = 'A';
            ab.SecondDigit = 'B';
            ab.NumberOfStrokes = 5;
            ab.Tell();

            BB bb = new BB();
            bb.FirstDigit = 'B';
            bb.SecondDigit = 'B';
            bb.NumberOfStrokes = 4;
            bb.Tell();

            CB cb = new CB();
            cb.FirstDigit = 'C' ;
            cb.SecondDigit = 'B' ;
            cb.NumberOfStrokes = 3;
            cb.Tell();

            DB db = new DB();
            db.FirstDigit = 'D' ;
            db.SecondDigit = 'B' ;
            db.NumberOfStrokes = 4;
            db.Tell();
            db.Alphabet(5);
            db.Alphabet("five", "English");
        }

        public static void doubleAlphabetExample3() {

            AC ac = new AC();
            ac.FirstDigit = 'A';
            ac.SecondDigit = 'C';
            ac.NumberOfStrokes = 4;
            ac.Tell();

            BC bc = new BC();
            bc.FirstDigit = 'B';
            bc.SecondDigit = 'C';
            bc.NumberOfStrokes = 3;
            bc.Tell();

            CC cc = new CC();
            cc.FirstDigit = 'C' ;
            cc.SecondDigit = 'C' ;
            cc.NumberOfStrokes = 2;
            cc.Tell();

            DC dc = new DC();
            dc.FirstDigit = 'D' ;
            dc.SecondDigit = 'C' ;
            dc.NumberOfStrokes = 3;
            dc.Tell();
            dc.Alphabet(21);
            dc.Alphabet("twenty-one", "American");
        }

        public static void doubleAlphabetExample4() {

            AD ad = new AD();
            ad.FirstDigit = 'A' ;
            ad.SecondDigit = 'D' ;
            ad.NumberOfStrokes = 5;
            ad.Tell();

            BD bd = new BD();
            bd.FirstDigit = 'B' ;
            bd.SecondDigit = 'D' ;
            bd.NumberOfStrokes = 4;
            bd.Tell();

            CD cd = new CD();
            cd.FirstDigit = 'C' ;
            cd.SecondDigit = 'D' ;
            cd.NumberOfStrokes = 3;
            cd.Tell();

            DD dd = new DD();
            dd.FirstDigit = 'D' ;
            dd.SecondDigit = 'D' ;
            dd.NumberOfStrokes = 4;
            dd.Tell();
            dd.Alphabet("upper", "LOWER");
            dd.Alphabet("capital");
        }

        public static void doubleAlphabetExample5() {

            AE ae = new AE();
            ae.FirstDigit = 'A';
            ae.SecondDigit = 'E';
            ae.NumberOfStrokes = 7;
            ae.Tell();

            BE be = new BE();
            be.FirstDigit = 'B';
            be.SecondDigit = 'E';
            be.NumberOfStrokes = 6;
            be.Tell();

            CE ce = new CE();
            ce.FirstDigit = 'C' ;
            ce.SecondDigit = 'E' ;
            ce.NumberOfStrokes = 6;
            ce.Tell();

            DE de = new DE();
            de.FirstDigit = 'C' ;
            de.SecondDigit = 'E' ;
            de.NumberOfStrokes = 6;
            de.Tell();
            de.Alphabet("accent");
            de.Alphabet(" acute (é)", "grave (è)");
        }

        public static void doubleAlphabetExample6() {

            AB ab = new AB();
            ab.FirstDigit = 'A';
            ab.SecondDigit = 'B';
            ab.NumberOfStrokes = 5;
            ab.Tell();

            AC ac = new AC();
            ac.FirstDigit = 'A';
            ac.SecondDigit = 'C';
            ac.NumberOfStrokes = 4;
            ac.Tell();

            AD ad = new AD();
            ad.FirstDigit = 'A';
            ad.SecondDigit = 'D';
            ad.NumberOfStrokes = 5;
            ad.Tell();

            AE ae = new AE();
            ae.FirstDigit = 'A';
            ae.SecondDigit = 'E';
            ae.NumberOfStrokes = 7;
            ae.Tell();
    }

        public static void doubleAlphabetExample7() {

            BB bb = new BB();
            bb.FirstDigit = 'B';
            bb.SecondDigit = 'B';
            bb.NumberOfStrokes = 4;
            bb.Tell();

            BC bc = new BC();
            bc.FirstDigit = 'B';
            bc.SecondDigit = 'C';
            bc.NumberOfStrokes = 3;
            bc.Tell();

            BD bd = new BD();
            bd.FirstDigit = 'B';
            bd.SecondDigit = 'D';
            bd.NumberOfStrokes = 4;
            bd.Tell();

            BE be = new BE();
            be.FirstDigit = 'B';
            be.SecondDigit = 'E';
            be.NumberOfStrokes = 6;
            be.Tell();
    }

        public static void doubleAlphabetExample8() {

            CB cb = new CB();
            cb.FirstDigit = 'C' ;
            cb.SecondDigit = 'B' ;
            cb.NumberOfStrokes = 3;
            cb.Tell();

            CC cc = new CC();
            cc.FirstDigit = 'C' ;
            cc.SecondDigit = 'C' ;
            cc.NumberOfStrokes = 2;
            cc.Tell();

            CD cd = new CD();
            cd.FirstDigit = 'C' ;
            cd.SecondDigit = 'D' ;
            cd.NumberOfStrokes = 3;
            cd.Tell();

            CE ce = new CE();
            ce.FirstDigit = 'C' ;
            ce.SecondDigit = 'E' ;
            ce.NumberOfStrokes = 6;
            ce.Tell();
    }
        public static void doubleAlphabetExample9() {
            DB db = new DB();
            db.FirstDigit = 'D' ;
            db.SecondDigit = 'B' ;
            db.NumberOfStrokes = 4;
            db.Tell();
            db.Alphabet(5);
            db.Alphabet("five", "English");

            DC dc = new DC();
            dc.FirstDigit = 'D' ;
            dc.SecondDigit = 'C' ;
            dc.NumberOfStrokes = 3;
            dc.Tell();
            dc.Alphabet(21);
            dc.Alphabet("twenty-one", "American");

            DD dd = new DD();
            dd.FirstDigit = 'D' ;
            dd.SecondDigit = 'D' ;
            dd.NumberOfStrokes = 4;
            dd.Tell();
            dd.Alphabet("upper", "LOWER");
            dd.Alphabet("capital");

            DE de = new DE();
            de.FirstDigit = 'C' ;
            de.SecondDigit = 'E' ;
            de.NumberOfStrokes = 6;
            de.Tell();
            de.Alphabet("accent");
            de.Alphabet(" acute (é)", "grave (è)");
    }
        public static void doubleAlphabetExample10() {
            BB bee = new CB();
            bee.Fast();
            BC cee = new CC();
            cee.Environment();
            BD dee = new CD();
            dee.Season();
            BE eee = new CE();
            eee.Swim();
    }
    }

