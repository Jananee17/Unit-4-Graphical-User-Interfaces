import javax.swing.*;
 
public class PromptUser
{
   public static void main(String[] args)
   {
       int line1 = 1;
       int line2 = 2;
       // Prompt the user to enter 1 or 2 two draw shapes
       JOptionPane.showInputDialog("Enter 1 to draw rectangles: " + "\r\n"
               + "Enter 2 to draw ovals: ");
 
       if (line1 == 1)
       {
           MyWindowR();
       }
 
       if(line2 == 2)
       {
           MyWindowO();
       }
   }
   public static void MyWindowR()
   {
       JFrame appWindow = new JFrame("");
       /* appWindow.setTitle("New Title Text!"); */
 
       PanelOvals drawPanel = new PanelOvals();
 
       appWindow.add(drawPanel);
       appWindow.setSize(210, 210);
       appWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       appWindow.setVisible(true);
   }
 
   public static void MyWindowO()
   {
       JFrame appWindow = new JFrame("");
       /* appWindow.setTitle("New Title Text!"); */
 
       PanelRectangles drawPanel = new PanelRectangles();
 
       appWindow.add(drawPanel);
       appWindow.setSize(210, 210);
       appWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       appWindow.setVisible(true);
   }
 
}
