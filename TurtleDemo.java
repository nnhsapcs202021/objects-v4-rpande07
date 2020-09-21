/*
 * Every java program contains one of more classes (e.g. TurtleDemo).
 * 
 * In general, every source file (e.g. TurtleDemo.java) contains one class (e.g. Turtle Demo).
 * 
 * The source file name must match the class na,e. 
 * 
 * By convention, class names start with an uppercase letter. 
 * 
 * @author riapande
 * @version 09 Sept 2020
 */


import java.awt.Color;

public class TurtleDemo
{
    /* 
     * A class contains methods.
     * 
     * Most Java programs contain a class with a main method. 
     * 
     * The main method is executed when the program starts.
     * 
     */
    public static void main(String[] args)
    {
        //small change
        World ocean = new World(); //like the canvas drawing on with Turtle objects
        Turtle crush = new Turtle(ocean); //place a new Turtle into the "ocean" World
        Turtle leo = new Turtle(ocean);
        crush.setPenColor(Color.ORANGE);
        crush.penDown();
        crush.forward(50);
        crush.forward(100);

        /* 
         * A method contains statements.
         * 
         * Statements may invoke other methods (e.g. forward).
         * 
         * In general, methods are invoked on objects (e.g. crush)
         * 
         * When invoking a method, arguments are passed in parentheses (e.g. 50)
         * 
         */

        crush.forward(25); //the crush object will move forward by 25 pixels

        // this is a single-line comment (like # python)

        /*
         * Identifiers are any combonation of:
         * letters
         * digits (but not as first character)
         * underscores (_)
         * dollar signs ($)
         * 
         * These are the varioud identifiers;
         */

        int y, x2, x_y, x$;

        // This is not a valid identifier:
        // int 2y;

        /*
         * Identifiers are case sensitive (case matters).
         * 
         * These are different:
         */
        Turtle squirt, SQUIRT, sQUirT;

        /*
         * By convention, constant values are all uppercase. Use an underscore between words.
         */

        int SPEED_OF_LIGHT = 300000000; // meters/second

        /* 
         * By convention, most identifiers start with a lowercase letter.
         * Subsequent words start with an uppercase letter (CamelCase)
         */
        World pacificOcean;

    }

    public static void drawLine()
    {
        /*
         * Objects are entities in a program.
         * Objects have attributes.
         * Objects are manipulated by invoking methods.
         * 
         * ocean and crush are variables that reference objects
         * 
         * classes describe a collection of objects.
         *  All objects of a class have the same behavior (method),
         *  and they have the same type of attributes (but they may have different values).
         * 
         * 
         */
        World ocean = new World();
        
        /*
         * We use the new operator to construct (creat, instantiate) an objects.
         * 
         * The class of the object is specified immediately after the new operator (e.g. Turtle)
         * 
         * If we need to pass additional information to construct the object, arguments are
         * specified in parentheses after the class (e.g. ocean).
         */
        
        Turtle crush = new Turtle(ocean);
        
        /*
         * Variables store values to be used later.
         * Variables have a type (e.g. int), a name (e.g. width), and a value (e.g. 20)
         */
        int width = 20; // declaring a variable
        width = 20; //assigning a value to a variable
        
        /*
         * Java has several primative data types:
         *  boolean holds a value of true or false
         *  int holds an integer number
         *  double holds a real number (floating point)
         *  char holds a single character
         */
        
        
        // here is a boolean
        boolean isSummer= true;
        
        // here is a double
        double salesTaxRate = 0.075;
        
        // here is a char
        char letter = 'c';
        
        /* 
         * When involing method, we use the dot operator (i.e., '.') to invoke a method on an object.
         * 
         * Some methods take no arguments, bu we still have parentheses (e.g., penDown).
         * 
         * Some methods take one or more arguments (e.g., forward).
         * 
         * Mutator methods modify the state (i.e., values of attributes) of the object
         */
        

        
    }

}
