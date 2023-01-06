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

/* Write a GUI application to help track student success.  
* Your solution should look something like this.  
* Include two buttons to keep track of the number of passes and fails, 
* with a label to give an ongoing status update.  
* Use a regular (not anonymous) inner class to take care of the 
* event handling for both buttons.  Hint: the JLabel class has a 
* method that you can use to update the text on a JLabel object 
* any time after it has been instantiated.
*/
