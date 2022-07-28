//Aranyak lines 1-50
//Comments: I have put all questions there and made a new JFrame, but the questions are overlapping
//Need to figure out how to make them not overlap then make buttons
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
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setBounds(50,200,20,30);
        JLabel label2 = new JLabel("How many servings of fruits or vegetables did you eat today?");
        label2.setAlignmentX(200);
        label2.setAlignmentY(200);
        label2.setHorizontalTextPosition(JLabel.LEFT);
        label2.setBounds(50,100,20,30);
        JLabel label3 = new JLabel("How many glasses of water did you drink today?");
        label3.setAlignmentX(200);
        label3.setAlignmentY(200);
        label3.setHorizontalTextPosition(JLabel.LEFT);
        label3.setBounds(200,150,20,30);
        JLabel label4 = new JLabel("How many minutes did you exercise for today?");
        label4.setAlignmentX(200);
        label4.setAlignmentY(200);
        label4.setHorizontalTextPosition(JLabel.RIGHT);
        label4.setBounds(50,100,20,30);
        JFrame window = new JFrame("Please answer the following questions!");
        window.setVisible(true);
        window.setSize(1000,1000);
        window.add(label);
        window.add(label2);
        window.add(label3);
        window.add(label4);
        



    }
}
