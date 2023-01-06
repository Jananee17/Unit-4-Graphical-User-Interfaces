import javax.swing.JFrame;
 
public class JTextFieldWindow
{
   public static void main( String[] args )
   {
       JTextFieldFrame appWindow = new JTextFieldFrame();
 
       appWindow.setSize( 320, 100 );
       appWindow.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       appWindow.setVisible( true );
   }
}
