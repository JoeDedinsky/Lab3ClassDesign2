import java.awt.Dimension;
import java.awt.Color;
/*
 * Lab2 Driver:   ClassDesignIIDriver.java
 * Author: Rob Nash
 * 
 * Purpose: This is a test file to be included in the same (working) directory as your 
 * new class definitions.  Once you define a class (say, the Date class), uncomment the driver code
 * associated with that class to test it.  Match your output with the provided output, and pay 
 * particular attention to each new technique as we make use of it (Overloading, Constructors, Copy 
 * Constructors, Access Modifiers, Class Invariants, etc.)
 * 
 */


public class ClassDesignIIDriver {
    private int foo = -1;  //used in one of the mutator functions below
    
    
    public static void main(String[] args) {
        // uncomment the desired Driver or Demo below and run this code to test your progress
        // shapeDriver();
        lineSegmentDriver();
        // immutableFractionDriver();
        // customMathDriver();
        // passByReferenceDemo();
    }

    private static void shapeDriver() {
        System.out.println("uncomment the code to use the shapeDriver");

        Shape a = new Shape();
        Shape b = new Shape(10, 10, Color.DARK_GRAY);
        
        a.setX(120);
        b.setY(140);
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }
    
    public static void lineSegmentDriver() {
        System.out.println("uncomment the code to use the lineSegmentDriver");
         LineSegment a = new LineSegment();
        LineSegment b = new LineSegment(new Point2D(1,1), new Point2D(2,2));
        LineSegment c = new LineSegment(b);
        
        a.setStart(new Point2D(3, 3));
        a.setEnd(new Point2D(4, 4));
        
        System.out.println("Line a: " + a.toString());
        System.out.println("Line b: " + b.toString());
        System.out.println("Line c: " + c.toString());
        
        System.out.println("Line b's distance between points: " + b.getDistance());
        
        System.out.println("Does a equal b? " + a.equals(b));
        System.out.println("Does a equal c? " + a.equals(c));
        System.out.println("Does b equal c? " + b.equals(c));

    }
    
    
    public static void immutableFractionDriver() {

        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(3, 4);
        Fraction c = new Fraction(b);
    
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        
        // fix the following 2 errors
        System.out.println("a.num:" + a.numerator);
        System.out.println("b.denom:" + b.denominator);

        // Question which of the following code is correct to change the fraction a?
        // Answer: a = a.add(b)
        // a.add(b);
        a = a.add(b);
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("b.equals(c): " + b.equals(c));

        
    }

    private static void customMathDriver() {

        double a = Math2.PI;
        double b = Math2.E;
        double c = a + b;
        
        System.out.println("The larger of the two is " + Math2.max(10, 20));
        System.out.println("And the larger of the two is " + Math2.max(10.34, 10.31));
        System.out.println("2^8 is " + Math2.pow(2, 8));
        System.out.println("Pi is roughly equal to "+ Math2.PI);
        System.out.println("E is roughly equal to "+ Math2.E);
        System.out.println("Pi + E is " + c);

    }

    /* Answers to Questions.

    3a. Passing a primitive sends a copy to the method, so
        when the method is executed nothing changes about
        the original variable. Passing an object sends the
        memory address associated with the object, so if
        the method changes fields or attributes related to
        the object then the original will also be changed,
        but the memory address is not changed, as the address
        is still passed-by-value.
    3b. No, the scope does not change.
    3c. yes, see 3a.

     */
    public static void passByReferenceDemo() {
        int a = 3;                      // a primitive variable
        Dimension b = new Dimension();  // a reference variable
        
        System.out.println("a is :" + a);
        System.out.println("b is :" + b);
        
        mutate(a);
        mutate(b);
        
        System.out.println("a is :"+ a);
        System.out.println("b is :" + b);
        
    }
    
    public static void mutate(int z) {
        // Question: does it matter that I called my input data "z" here?
        /* Answer: Yes and no. No because you can name the parameter
        whatever you like, and yes because you have to make sure
        to use this name within the scope of this method to make
        any changes.
        */
        z = -1000;
        // this.foo = -1000;
        // Question: why does the line above cause compiler errors?
        // Answer: the mutate method is static.
    }
    
    public static void mutate(Dimension c) {  
        c.height = -1000;
        c.width = -1000;
        // Question: if I didn't hand this function a copy of b from main,
        // but rather a reference to the object that is known in main as b, what happens here?
        // Answer: not sure what is being asked here. I assume it changes
        // the height and width of b.

        // Question: if I make a change to c, are my changes reflected back
        // in the code that called this function?  In other words, did this change b of main?
        // Answer: Yes it does change b.
    }
}