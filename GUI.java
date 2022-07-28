// Krishay
import java.awt.*;
import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;


public class GUI {
 public static void main(String[] args) throws FontFormatException, IOException {
   JFrame frame = new JFrame();
   ImageIcon motto = new ImageIcon("assets/motto.png");
   JLabel motto_l = new JLabel(motto);
   frame.add(motto_l);
   InputStream is = GUI.class.getResourceAsStream("LeagueSpartan-Bold.ttf");
   Font font = Font.createFont(Font.TRUETYPE_FONT, is);
   Font biggerFont = font.deriveFont(Font.BOLD, 48f);

   frame.setResizable(false);
   frame.setSize(960, 540);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setTitle("Motiva");
   frame.getContentPane().setBackground(new Color(0x34495E));
   frame.setVisible(true);
 }

}

