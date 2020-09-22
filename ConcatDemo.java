public class ConcatDemo
{
   public static void main(String[] args)
   {
      String animal1 = new String( "quick brown fox" );
      String animal2 = new String( "lazy dog" );
      String article = new String( "the" );
      String action = new String( "jumps over" );
      String space = " ";
      String message = article + space + animal1 + space + action + space + article + space + animal2;
      System.out.println(message);
      
      String sentence1 = new String( "      abc   " );
      String sentence2 = new String( "   def" );
      String sentence3 = new String( "ghi         " );
       
      message = sentence1+sentence2+sentence3;
      message = message.replace(" ","");

      System.out.println(message);
   }
}