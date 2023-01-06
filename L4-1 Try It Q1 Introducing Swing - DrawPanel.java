import java.awt.Graphics;
import javax.swing.JPanel;
 
public class DrawPanel extends JPanel
{
   // This method is called automatically by the JVM when the window needs to be (re)drawn.
   @Override
   public void paintComponent( Graphics g )
   {
       super.paintComponent( g );
 
       // Get the dimensions of the panel in pixels
       int panelWidth = getWidth();
       int panelHeight = getHeight();
 
       // Draw RANDOM lines
       g.drawLine( (int)(Math.random() * panelWidth),
   (int)(Math.random() * panelHeight),
                       (int)(Math.random() * panelWidth),
   (int)(Math.random() * panelHeight) );
       g.drawLine( (int)(Math.random() * panelWidth),
   (int)(Math.random() * panelHeight),
                       (int)(Math.random() * panelWidth),
   (int)(Math.random() * panelHeight) );
   }
}
