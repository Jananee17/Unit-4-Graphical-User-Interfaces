import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 
public class MouseDetailsFrame extends JFrame
{
   private JLabel statusBar;
   private JPanel mousePanel;
 
   public MouseDetailsFrame()
   {
       super("Demo of ONLY mouseClicked Event");
 
       // We'll update the statusBar JLabel as mouse events occur
       statusBar = new JLabel("Mouse Outside JPanel");
       add(statusBar, BorderLayout.SOUTH);
 
       // We will track mouse events on a JPanel
       mousePanel = new JPanel();
       mousePanel.setBackground(Color.WHITE);
       add(mousePanel, BorderLayout.CENTER);
 
       // Create and register listener for mouse and mouse motion events
       mousePanel.addMouseListener(new MouseEventListener());
   }
 
   // Inner class that extends MouseAdapter and only overrides the mouseClicked() method
   class MouseEventListener extends MouseAdapter
   {
       // handle mouse click event and determine which button was pressed
       public void mouseClicked(MouseEvent event)
       {
           int xPos = event.getX();
           int yPos = event.getY();
 
           String details = String.format("Clicked %d time(s)",
                   event.getClickCount());
 
           if (event.isMetaDown()) // right mouse button
               details += " with right mouse button";
           else if (event.isAltDown()) // middle mouse button
               details += " with center mouse button";
           else // left mouse button
               details += " with left mouse button";
 
           statusBar.setText(details);
       }
   }
}
