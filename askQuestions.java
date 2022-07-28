// Krishay
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.InsetsUIResource;

import java.io.IOException;
import java.io.InputStream;




public class askQuestions {

    public static void main(String[] args) throws FontFormatException, IOException {
        JFrame frame = new JFrame("Motiva");
        InputStream is = askQuestions.class.getResourceAsStream("GlacialIndifference-Regular.ttf");
        Font font = Font.createFont(Font.TRUETYPE_FONT, is);
        Font biggerFont = font.deriveFont(Font.BOLD, 48f);

        UIManager.put("OptionPane.background", new ColorUIResource(52, 73, 94));
        UIManager.put("Panel.background", new ColorUIResource(52, 73, 94));
        UIManager.put("OptionPane.minimumSize", new Dimension(960, 540)); 
        UIManager.put("OptionPane.maximumSize", new Dimension(960, 540)); 
        UIManager.put("OptionPane.textField", new ColorUIResource(52, 73, 94)); 
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        UIManager.put("OptionPane.messageFont", biggerFont);
        UIManager.put("OptionPane.cancelButtonText", "Cancel");
        UIManager.put("OptionPane.okButtonText", "Next");


        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old are you? (years): "));
        if(age <= 0 | age>=150){
            JOptionPane.showMessageDialog(null, "Please enter a value between 1 and 150 ", "Error", -1);
            JOptionPane.getRootFrame().dispose();  
        }
        float weight = Float.parseFloat(JOptionPane.showInputDialog("What is your weight? (lbs): "));
        if(weight <= 10 | weight>=1000){
            JOptionPane.showMessageDialog(null, "Please enter a value between 10 and 100t0 ", "Error", -1);
            JOptionPane.getRootFrame().dispose();  
        } 
        JOptionPane.showMessageDialog(null, "Calculating recommended water/exercise for you... ", "Motiva", -1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }



