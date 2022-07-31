//Aranyak
//Started Summary
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Summary extends JFrame {

    public static void main(String[] args){
    ImageIcon image = new ImageIcon("grade.png");
    JLabel label = new JLabel(image);
    label.setText("You got an A+!(100%)");
    label.setIcon(image);
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.TOP);


    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(960,540);
    frame.setVisible(true);
    frame.add(label);



    }
    
}
