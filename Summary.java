//Aranyak
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.awt.*;
import java.lang.Float;
public class Summary {

    


    public Summary() throws IOException, FontFormatException {
        InputStream is = Summary.class.getResourceAsStream("GlacialIndifference-Regular.ttf");
        Font font = Font.createFont(Font.TRUETYPE_FONT, is);
        Font biggerFont = font.deriveFont(20f);
        Font smallerFont = font.deriveFont(15f);

        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(1,2));

        JPanel panel = new JPanel(new GridBagLayout());
        frame.add(panel);
        panel.setSize(480,540);

        JPanel panel2 = new JPanel(new GridBagLayout());
        frame.add(panel2);
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        try {
            Scanner sc = new Scanner(new File("main_ans.txt"));
            
            String output = "";
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                if(output.length() != 0) {
                    output = output + "\n";
                }
                output = output + line;
                }
            
            
            JLabel chardata = new JLabel();
            gbc.gridx = 0;
            gbc.gridy = 0;
            chardata.setText(output);
            //panel.add(chardata,gbc);
            //JLabel hi = new JLabel();
            //hi.setText("You got x%! Here are your results");
            //gbc.gridx = 0;
            //gbc.gridy = 1;
            
            sc.close();
            //frame.add(chardata,gbc);
            //frame.add(hi,gbc);
            //panel.add(hi,gbc);
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //formulas
        FileReader file = new FileReader("db.txt");
        
        try (BufferedReader buffer = new BufferedReader(file)) {
            String age_s = buffer.readLine();
            int age = Integer.parseInt(age_s);
            System.out.println(age);
            String weight_s = buffer.readLine();
            double weight = Float.parseFloat(weight_s);
            weight = weight/2.2;
            if(age<30){
                weight = weight * 40;
                weight = weight/28.3;
                weight = weight/8;

            }
            else if(age>30 && age<55){
                weight = weight*35;
                weight = weight/28.3;
                weight = weight/8;
            }
            else if(age>55){
                weight = weight*30;
                weight = weight/28.3;
                weight = weight/8;
            }

            

            double cups = weight;
            cups = Math.round(cups * 10.0)/10.0;
            if(cups>10){
                cups = 10;
            }
            
            FileReader file1= new FileReader("main_ans.txt");
            BufferedReader buff1 = new BufferedReader(file1);
            String roundSleep = buff1.readLine();
            JLabel roundSleep1 = new JLabel("You slept for " + roundSleep + "!");
            roundSleep1.setFont(biggerFont);
            roundSleep1.setForeground(Color.WHITE);

            gbc.gridx = 0;
            gbc.gridy = 1;
            


            panel.add(roundSleep1,gbc);

            System.out.println(cups);
            JLabel cupsFeedback = new JLabel();
            gbc.gridx = 0;
            gbc.gridy = 6;
            cupsFeedback.setText("You were supposed to drink around " + cups + " cups of water");
            cupsFeedback.setFont(smallerFont);
            cupsFeedback.setForeground(new Color(0x38B6FF));
            panel.add(cupsFeedback,gbc);
            gbc.insets = new Insets(5, 0, 0, 0);
            gbc.ipady = 25;

            
            String roundGlasses = buff1.readLine();
            JLabel roundGlasses1 = new JLabel("You drank " + roundGlasses + "!");
            roundGlasses1.setFont(biggerFont);
            roundGlasses1.setForeground(Color.WHITE);
            
            gbc.gridx = 0;
            gbc.gridy = 5;
            
            panel.add(roundGlasses1, gbc);

            String roundFruits = buff1.readLine();
            JLabel roundFruits1 = new JLabel("You ate " + roundFruits + " servings of fruits!");
            roundFruits1.setFont(biggerFont);
            roundFruits1.setForeground(Color.WHITE);
            gbc.gridx = 0;
            gbc.gridy = 8;
            
            panel.add(roundFruits1, gbc);

            String roundExercise = buff1.readLine();
            JLabel roundExercise1 = new JLabel("You exercised for " + roundExercise + "!");
            roundExercise1.setFont(biggerFont);
            roundExercise1.setForeground(Color.WHITE);
            gbc.gridx = 0;
            gbc.gridy = 11;
            
            panel.add(roundExercise1, gbc);
            
            if(age>= 6 && age<= 12){

                JLabel amountOfSleep = new JLabel();
                amountOfSleep.setText("You were supposed to sleep for around 10 hours");
                amountOfSleep.setFont(smallerFont);
                amountOfSleep.setForeground(new Color(0x38B6FF));
                gbc.gridx = 0;
                gbc.gridy = 2;
                panel.add(amountOfSleep,gbc);
                gbc.insets = new Insets(5, 0, 0, 0);
                gbc.ipady = 25;
            }
            //Sleep formulas
            else if(age>= 13 && age<= 18){
                JLabel amountOfSleep = new JLabel();
                amountOfSleep.setText("You were supposed to sleep for around 9 hours");
                amountOfSleep.setFont(smallerFont);
                amountOfSleep.setForeground(new Color(0x38B6FF));
                gbc.gridx = 0;
                gbc.gridy = 2;
                panel.add(amountOfSleep,gbc);
                gbc.insets = new Insets(5, 0, 0, 0);
                gbc.ipady = 25;
            }
            else if(age>= 19 && age<= 60){
                JLabel amountOfSleep = new JLabel();
                amountOfSleep.setText("You were supposed to sleep for around 8 hours");
                amountOfSleep.setFont(smallerFont);
                amountOfSleep.setForeground(new Color(0x38B6FF));
                gbc.gridx = 0;
                gbc.gridy = 2;
                panel.add(amountOfSleep,gbc);
                gbc.insets = new Insets(5, 0, 0, 0);
                gbc.ipady = 25;
            }
            else if (age>60){
                JLabel amountOfSleep = new JLabel();
                amountOfSleep.setFont(smallerFont);
                amountOfSleep.setForeground(new Color(0x38B6FF));
                amountOfSleep.setText("You were supposed to sleep for around 7 hours");
                gbc.gridx = 0;
                gbc.gridy = 2;
                panel.add(amountOfSleep,gbc);
                gbc.insets = new Insets(5, 0, 0, 0);
                gbc.ipady = 25;
            }
            //Exercising formulas
            if(age>=6 && age<= 17){
                JLabel amountOfExercise = new JLabel();
                amountOfExercise.setFont(smallerFont);
                amountOfExercise.setForeground(new Color(0x38B6FF));
                amountOfExercise.setText("You were supposed to exercise for around 1 hour");
                gbc.gridx = 0;
                gbc.gridy = 12;
                panel.add(amountOfExercise,gbc);
                gbc.insets = new Insets(5, 0, 0, 0);
                gbc.ipady = 25;
            }
            if(age>=6 && age<= 17){
                JLabel amountOfExercise = new JLabel();
                amountOfExercise.setFont(smallerFont);
                amountOfExercise.setForeground(new Color(0x38B6FF));
                amountOfExercise.setText("You were supposed to exercise for around 1 hour");
                gbc.gridx = 0;
                gbc.gridy = 12;
                panel.add(amountOfExercise,gbc);
                gbc.insets = new Insets(5, 0, 0, 0);
                gbc.ipady = 25;
            }
            else if(age>=18 && age<= 64){
                JLabel amountOfExercise = new JLabel();
                amountOfExercise.setFont(smallerFont);
                amountOfExercise.setForeground(new Color(0x38B6FF));
                amountOfExercise.setText("You were supposed to exercise for around 30 min - 1 hour");
                gbc.gridx = 0;
                gbc.gridy = 12;
                panel.add(amountOfExercise,gbc);
                gbc.insets = new Insets(5, 0, 0, 0);
                gbc.ipady = 25;
            }
            else if(age>=65){
                JLabel amountOfExercise = new JLabel();
                amountOfExercise.setFont(smallerFont);
                amountOfExercise.setForeground(new Color(0x38B6FF));
                amountOfExercise.setText("You were supposed to exercise for around 10-30 min");
                gbc.gridx = 0;
                gbc.gridy = 12;
                panel.add(amountOfExercise,gbc);
                gbc.insets = new Insets(5, 0, 0, 0);
                gbc.ipady = 25;
            }
            
            JLabel amountOfFruits = new JLabel();
            amountOfFruits.setText("You were supposed to eat 2-3 servings of fruits");
            amountOfFruits.setFont(smallerFont);
            amountOfFruits.setForeground(new Color(0x38B6FF));
            gbc.gridx = 0;
            gbc.gridy = 9;
            panel.add(amountOfFruits,gbc);
            gbc.insets = new Insets(5, 0, 0, 0);
            gbc.ipady = 25;


            GridBagConstraints gbcPanel = new GridBagConstraints();


            ImageIcon A = new ImageIcon("assets/A.png");
            JLabel label = new JLabel(A);
            gbcPanel.gridx = 3;
            gbcPanel.gridy = 0;
            label.setIcon(A);
            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.TOP);
            panel2.add(label, gbcPanel);

            
            ImageIcon B = new ImageIcon("assets/B.png");
            ImageIcon C = new ImageIcon("assets/C.png");
            ImageIcon D = new ImageIcon("assets/D.png");
            ImageIcon F = new ImageIcon("assets/F.png");
            label.setText("You got an B+!(90%)");
            label.setFont(biggerFont);
            label.setForeground(Color.WHITE);
            buffer.close();
            

            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(960,540);
            frame.setVisible(true);
            panel.setBackground(new Color(0x34495E));
            panel2.setBackground(new Color(0x34495E));
        }

    }

     public static void main(String[] args) throws IOException, FontFormatException  {
        Summary s = new Summary();
    }
}
