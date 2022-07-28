//Aranyak lines 1-26
//Comments: I have put one of the questions there and made a new JFrame, will finish later
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;

public class MainPage extends JFrame{
    public static void main(String args[]){
        window();
        
    }

    public static void window(){
        JLabel label = new JLabel("How many hours of sleep did you get today?");
        label.setAlignmentX(0);
        label.setAlignmentY(0);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setBounds(50,100,20,30);
        JFrame window = new JFrame("Please answer the following questions!");
        window.setVisible(true);
        window.setSize(1000,1000);
        window.add(label);
}
}
