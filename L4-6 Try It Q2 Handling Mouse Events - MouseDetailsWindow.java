import javax.swing.JFrame;
 
public class MouseDetailsWindow
{
   public static void main( String[] args )
   {
       MouseDetailsFrame appWindow = new MouseDetailsFrame();
 
       appWindow.setSize( 300, 200 );
       appWindow.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       appWindow.setVisible( true );
   }
}
