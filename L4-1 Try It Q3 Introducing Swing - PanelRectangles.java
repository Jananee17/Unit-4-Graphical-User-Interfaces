import java.awt.Graphics;
import javax.swing.JPanel;
 
public class PanelRectangles extends JPanel
{
   public void paintComponent(Graphics g)
   {
       g.draw3DRect(5, 5, 50, 50,true);
       g.draw3DRect(5, 5, 60, 60,true);
       g.draw3DRect(5, 5, 70, 70, true);
       g.draw3DRect(5, 5, 80, 80, true);
       g.draw3DRect(5, 5, 90, 90, true);
       g.draw3DRect(5, 5, 90, 90, true);
       g.draw3DRect(5, 5, 100, 100, true);
       g.draw3DRect(5, 5, 110, 110,true);
       g.draw3DRect(5, 5, 120, 120,true);
       g.draw3DRect(5, 5, 120, 130,true);
 
   }
}
