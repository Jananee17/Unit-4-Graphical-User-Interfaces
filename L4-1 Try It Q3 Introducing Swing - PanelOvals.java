import java.awt.Graphics;
import javax.swing.JPanel;
 
public class PanelOvals extends JPanel
{
   public void paintComponent(Graphics g)
   {
       g.drawOval(5, 5, 50, 50);
       g.drawOval(5, 5, 60, 60);
       g.drawOval(5, 5, 70, 70);
       g.drawOval(5, 5, 80, 80);
       g.drawOval(5, 5, 90, 90);
       g.drawOval(5, 5, 100, 100);
       g.drawOval(5, 5, 110, 110);
       g.drawOval(5, 5, 120, 120);
       g.drawOval(5, 5, 130, 130);
       g.drawOval(5, 5, 140, 140);
 
   }
}
