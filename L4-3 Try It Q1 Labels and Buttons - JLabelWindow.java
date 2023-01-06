import javax.swing.JFrame;
 
public class JLabelWindow
{
   public static void main(String[] args)
   {
       JLabelFrame appWindow = new JLabelFrame();
 
       appWindow.setSize( 320, 240 );
       appWindow.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       appWindow.setVisible( true );
   }
}
