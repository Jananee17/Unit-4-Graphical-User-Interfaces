import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
public class JTextFieldFrame extends JFrame
{
   // This JTextField reference will be accessed by the inner class.
   private JTextField userNameField;
 
   public JTextFieldFrame()
   {
       super("JTextField Demo");
       setLayout(new FlowLayout());
 
       // Create and add a JLabel to our JFrame in one step
       add(new JLabel("Who are you: "));
 
       // Create a JTextField with default text in it, and roughly 10 characters width
       userNameField = new JTextField("???");
       userNameField.setColumns(10);
 
       // Create a TextFieldEventListener object
       ActionListener userNameFieldListener = new TextFieldEventListener();
       // And associate it with the JTextField
       userNameField.addActionListener(userNameFieldListener);
       add(userNameField);
   }
 
   // Here is the inner class for event handling
   class TextFieldEventListener implements ActionListener
   {
       // We override the actionPerformed() method as required by the ActionListener Interface
       @Override
       public void actionPerformed(ActionEvent e)
       {
           // When the user presses the <Enter> key:
           if (userNameField.getText().equals("???"))
           {
               JOptionPane.showMessageDialog(null, "Please enter your name first!");
           }
           else
           {
               JOptionPane.showMessageDialog(null, "Welcome, " + e.getActionCommand() + "!");
           }
       }
   }
}
