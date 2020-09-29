
import java.util.Random;
public class DieSimulator
{
    public static void main()
    {
        Random generator = new Random();
        int diceRoll = generator.nextInt(6);
        diceRoll = diceRoll + 1;
        System.out.println(diceRoll);
    }
}
