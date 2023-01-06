import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
 
public class MouseTrackerWindow
{
   public static void main( String[] args )
   {
       //New frame window
       JFrame appWindow = new JFrame("Mouse Event Tracker");
 
       //Instantiating 4 JPanels of different colors and width
       JPanel greenPanel = new JPanel();
       greenPanel.setBackground(Color.GREEN);
       greenPanel.setBounds(0,0,250,250);
 
       JPanel bluePanel = new JPanel();
       bluePanel.setBackground(Color.BLUE);
       bluePanel.setBounds(250,0,250,250);
 
       JPanel redPanel = new JPanel();
       redPanel.setBackground(Color.RED);
       redPanel.setBounds(250,250,250,250);
 
       JPanel pinkPanel = new JPanel();
       pinkPanel.setBackground(Color.PINK);
       pinkPanel.setBounds(0,250,250,250);
 
       //Adding Window size and layouts
       appWindow.setSize( 548, 550);
       appWindow.setLayout(null);
       appWindow.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       appWindow.setVisible( true );
 
       //Adding the 4 different JPanels
       appWindow.add(greenPanel);
       appWindow.add(bluePanel);
       appWindow.add(redPanel);
       appWindow.add(pinkPanel);
 
   }
}
