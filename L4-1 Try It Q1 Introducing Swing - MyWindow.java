import javax.swing.JFrame;
 
public class MyWindow
{
   public static void main(String[] args)
   {
       JFrame appWindow = new JFrame( "X-Window" );
 
       DrawPanel drawPanel = new DrawPanel();
       appWindow.add(drawPanel);
 
       appWindow.setSize( 320, 240 );
       appWindow.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       appWindow.setVisible( true );
   }
}

/* I noticed that since the question asked to modify the code and use random to randomize 
* the inputs of lines, the X shape in the window was not the same length each time 
* you resize it the lengths of the two lines creating the X was of different sizes. 
* But even sometimes it does not cross into an X.
*/
