import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class SmileyPanel extends JPanel
{
   public void paintComponent(Graphics g)
   {
       super.paintComponent(g);
 
       Color faceColor = new Color(255, 102, 0);
 
       // frame the face
       g.setColor(Color.BLUE);
       g.drawRect(5, 5, 210, 210);
 
       // draw the face as a filled oval
       g.setColor(faceColor);
       g.fillOval(10, 10, 200, 200);
 
       // layer black ovals on white ovals for the eyes
       g.setColor(Color.YELLOW);
       g.fillOval(55, 65, 30, 25);
       g.fillOval(135, 65, 30, 25);
       g.setColor(Color.BLACK);
       g.fillOval(60, 70, 20, 15);
       g.fillOval(140, 70, 20, 15);
 
       // draw the mouth
       g.setColor(Color.BLUE);
       g.fillOval(50, 110, 120, 60);
 
       // "touch up" the mouth into a smile by layering shapes
       g.setColor(faceColor);
       g.fillRect(50, 110, 120, 40);
       g.fillOval(50, 120, 120, 40);
   }
}
