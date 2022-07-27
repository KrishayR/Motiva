//Aranyak
//Comments: Needs a little debugging but should work, still have to try and link it to the main page
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class StartButton extends JFrame implements ActionListener  {
    public static void main(String[] args){}
    JButton button; 
    StartButton(){

        button = new JButton();
        button.setBounds(100, 40, 100, 50);
        button.addActionListener(this);
        button.setText("Start!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(100,30);
        this.setVisible(true);
        this.add(button);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            //might not need lines 23-26
            System.out.println("Hi");
        }

    }
}
