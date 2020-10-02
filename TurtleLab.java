import java.awt.Color;

public class TurtleLab
{
    public static void main(String[] args)
    {
        World myWorld = new World(); 
        Turtle blue = new Turtle(myWorld); 
        Turtle dicaprio = new Turtle(myWorld);
        blue.setPenColor(Color.blue);
        blue.penUp();
        blue.moveTo(100,150);
        blue.penDown();
        for (int i = 0; i < 50; i++){
            blue.forward(100);
            blue.turn(110);
        }
    }
}