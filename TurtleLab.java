import java.awt.Color;

public class TurtleLab
{
    public static void main(String[] args)
    {
        World myWorld = new World(500,500); 
        Turtle blue = new Turtle(myWorld); 
        blue.setPenColor(Color.blue);
        blue.penUp();
        blue.moveTo(100,150);
        blue.penDown();
        for (int i = 0; i < 100; i++){
            blue.forward(100);
            blue.turn(110);
        }
        Turtle black = new Turtle(myWorld); 
        black.setPenColor(Color.black);
        black.penUp();
        black.moveTo(225,150);
        black.penDown();
        for (int i = 0; i < 100; i++){
            black.forward(100);
            black.turn(110);
        }
        Turtle red = new Turtle(myWorld); 
        red.setPenColor(Color.red);
        red.penUp();
        red.moveTo(350,150);
        red.penDown();
        for (int i = 0; i < 100; i++){
            red.forward(100);
            red.turn(110);
        }
        Turtle yellow = new Turtle(myWorld); 
        yellow.setPenColor(Color.yellow);
        yellow.penUp();
        yellow.moveTo(163,225);
        yellow.penDown();
        for (int i = 0; i < 100; i++){
            yellow.forward(100);
            yellow.turn(110);
        }
        Turtle green = new Turtle(myWorld); 
        green.setPenColor(Color.green);
        green.penUp();
        green.moveTo(287,225);
        green.penDown();
        for (int i = 0; i < 100; i++){
            green.forward(100);
            green.turn(110);
        }
    }
}