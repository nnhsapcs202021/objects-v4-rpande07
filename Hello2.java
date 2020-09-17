import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Hello2
{
   public static void main(String[] args) throws Exception
   {
      URL imageLocation = new URL( "https://lh3.googleusercontent.com/proxy/Int15YaQ5prPmSB0juuYQPAT3Z1OYn__A3-I9Us9OSh54urnxjMzFsqsPQ_EsgSCm5DQt4F4MM7IPqoitNMqmQR3CDEY5JRHiGoOMm3AmeSkCu-rZXPrhq-NBPu7KVct4vxaa4JVZ0YuCu8eFRDdi2s");
      JOptionPane.showMessageDialog(null, "Greetings", "Title", JOptionPane.PLAIN_MESSAGE,
            new ImageIcon(imageLocation));
   }
}
