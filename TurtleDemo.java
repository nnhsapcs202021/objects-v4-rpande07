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
    }
}
