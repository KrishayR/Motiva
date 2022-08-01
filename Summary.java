//Aranyak
//Started Summary
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Summary extends JFrame {

    
    public static void main(String[] args){
    ImageIcon A = new ImageIcon("assets/A.png");
    ImageIcon B = new ImageIcon("assets/B.png");
    ImageIcon C = new ImageIcon("assets/C.png");
    ImageIcon D = new ImageIcon("assets/D.png");
    ImageIcon F = new ImageIcon("assets/F.png");
    JLabel label = new JLabel(A);
    label.setText("You got an A+!(100%)");
    label.setIcon(A);
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.TOP);


    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(960,540);
    frame.setVisible(true);
    frame.add(label);



    }
    
}
