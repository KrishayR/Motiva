//Aranyak lines 1-60
//Comments: I have put all questions there and made a new JFrame, but the questions are overlapping
//Need to figure out how to make them not overlap then make buttons
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class MainPage extends JFrame{
    public static void main(String args[]){
        window();
        
        
    }

    public static void window(){
        JLabel label = new JLabel("How many hours of sleep did you get today?");
        JPanel panel = new JPanel();
        label.setAlignmentX(0);
        label.setAlignmentY(0);
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setBounds(50,200,20,30);
        JLabel label2 = new JLabel("How many servings of fruits or vegetables did you eat today?");
        label2.setAlignmentX(100);
        label2.setAlignmentY(100);
        label2.setHorizontalTextPosition(JLabel.LEFT);
        label2.setBounds(50,100,20,30);
        JLabel label3 = new JLabel("How many glasses of water did you drink today?");
        label3.setAlignmentX(200);
        label3.setAlignmentY(200);
        label3.setHorizontalTextPosition(JLabel.LEFT);
        label3.setBounds(200,150,20,30);
        JLabel label4 = new JLabel("How many minutes did you exercise for today?");
        label4.setAlignmentX(300);
        label4.setAlignmentY(300);
        label4.setHorizontalTextPosition(JLabel.RIGHT);
        label4.setBounds(50,100,20,30);
        JFrame window = new JFrame("Please answer the following questions!");
        panel.setVisible(true);
        panel.setSize(960,540);
        panel.add(label);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        window.setSize(960,540);
        window.add(panel);
        label.setLocation(100, 100);
        label2.setLocation(100, 500);
        label3.setLocation(400, 100);
        label4.setLocation(400, 500);
        window.setVisible(true);

        
        


    }
}
