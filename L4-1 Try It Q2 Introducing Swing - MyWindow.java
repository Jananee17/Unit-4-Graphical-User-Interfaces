import javax.swing.JFrame;
 
public class MyWindow
{
   public static void main(String[] args)
   {
       JFrame appWindow = new JFrame( "Smiley Panel" );
       /* appWindow.setTitle("New Title Text!"); */
 
       SmileyPanel drawPanel = new SmileyPanel();
       appWindow.add(drawPanel);
 
       appWindow.setSize( 210, 210);
       appWindow.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       appWindow.setVisible( true );
   }
}
