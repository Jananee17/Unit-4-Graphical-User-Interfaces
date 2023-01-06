import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.util.Objects;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
 
public class JLabelFrame extends JFrame
{
   private ImageIcon image1;
   private JLabel label1;
   private ImageIcon image2;
   private JLabel label2;
 
   public JLabelFrame()
   {
       setLayout(new FlowLayout());
       image1 = new ImageIcon(Objects.requireNonNull(getClass().getResource("checkmark.jpg")));
       label1 = new JLabel(image1);
       add(label1);
 
       image2 = new ImageIcon(Objects.requireNonNull(getClass().getResource("X.jpg")));
       label2 = new JLabel(image2);
       add(label2);
 
   }
}
