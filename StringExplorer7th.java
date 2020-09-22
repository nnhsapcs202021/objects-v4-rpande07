
/**
 * Write a description of class StringExplorer7th here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringExplorer7th
{
    public static void StringExplorer7th()
    {
        String river = new String("Mississippi");
        String river2 = "Mississippi"; //String literal
        river.replace("i", "x");
        System.out.println(river);
        
        /*
         * The replace method returns a reference to a new String.
         * It does not change the String object on which it is invoked.
         * The String class has no mutator methods. It is not possible to change a String object.
         * String are immutable
         */
        
        String riverX = river.replace("i", "x");
        System.out.println(riverX);
    }
}
