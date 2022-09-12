//Aranyak
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.awt.*;
import java.lang.Float;
public class Summary extends JFrame {

    


    public Summary() throws IOException {
        
        
        JPanel panel = new JPanel(new GridBagLayout());
        //JPanel pane = new JPanel(new GridBagLayout());
        
        
        panel.setSize(300,300);

        GridBagConstraints gbc = new GridBagConstraints();
        
        
        


        JLabel label2 = new JLabel();
        gbc.gridx = 0;
        gbc.gridy = -3;
        label2.setText("Here are some recommendations to help improve your lifestyle!!");        
        //panel.add(label2, gbc);


        
        //label3.setText("<---- Image goes here");
        //panel.add(label3, gbc);

    
        this.add(panel);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        this.pack();
        
    
        
            

        
        
    
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
            //this.add(chardata,gbc);
            //this.add(hi,gbc);
            //panel.add(hi,gbc);
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        /*Scanner sc2 = new Scanner(new File("db.txt"));
        String output2 = "";
        
        while(sc2.hasNextLine()) {
            String line2 = sc2.nextLine();
            if(output2.length() != 0) {
                    output2 += "\n";
            }
            output2 = output2 + line2;
            
        }
        JLabel l = new JLabel();
        l.setText(output2);
        System.out.println(output2);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(l,gbc);
        sc2.close();
         */


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
            gbc.gridx = 2;
            gbc.gridy = 2;
            
            panel.add(roundSleep1,gbc);

            


            System.out.println(cups);
            JLabel cupsFeedback = new JLabel();
            gbc.gridx = 2;
            gbc.gridy = 5;
            cupsFeedback.setText("You were supposed to drink around " + cups + " cups of water");
            panel.add(cupsFeedback,gbc);

            
            String roundGlasses = buff1.readLine();
            JLabel roundGlasses1 = new JLabel("You drank " + roundGlasses + "!");
            gbc.gridx = 2;
            gbc.gridy = 4;
            
            panel.add(roundGlasses1,gbc);

            String roundFruits = buff1.readLine();
            JLabel roundFruits1 = new JLabel("You ate " + roundFruits + " servings of fruits!");
            gbc.gridx = 2;
            gbc.gridy = 6;
            
            panel.add(roundFruits1,gbc);

            String roundExercise = buff1.readLine();
            JLabel roundExercise1 = new JLabel("You exercised for " + roundExercise + "!");
            gbc.gridx = 2;
            gbc.gridy = 9;
            
            panel.add(roundExercise1,gbc);

            
            if(age>= 6 && age<= 12){

                JLabel amountOfSleep = new JLabel();
                amountOfSleep.setText("You were supposed to sleep for around 10 hours");
                gbc.gridx = 2;
                gbc.gridy = 3;
                panel.add(amountOfSleep,gbc);
                
            }
            //Sleep formulas
            else if(age>= 13 && age<= 18){
                JLabel amountOfSleep = new JLabel();
                amountOfSleep.setText("You were supposed to sleep for around 9 hours");
                gbc.gridx = 2;
                gbc.gridy = 3;
                panel.add(amountOfSleep,gbc);
            }
            else if(age>= 19 && age<= 60){
                JLabel amountOfSleep = new JLabel();
                amountOfSleep.setText("You were supposed to sleep for around 8 hours");
                gbc.gridx = 2;
                gbc.gridy = 3;
                panel.add(amountOfSleep,gbc);
            }
            else if (age>60){
                JLabel amountOfSleep = new JLabel();
                amountOfSleep.setText("You were supposed to sleep for around 7 hours");
                gbc.gridx = 2;
                gbc.gridy = 3;
                panel.add(amountOfSleep,gbc);
            }
            //Exercising formulas
            if(age>=6 && age<= 17){
                JLabel amountOfExercise = new JLabel();
                amountOfExercise.setText("You were supposed to exercise for around 1 hour");
                gbc.gridx = 2;
                gbc.gridy = 10;
                panel.add(amountOfExercise,gbc);
            }
            if(age>=6 && age<= 17){
                JLabel amountOfExercise = new JLabel();
                amountOfExercise.setText("You were supposed to exercise for around 1 hour");
                gbc.gridx = 2;
                gbc.gridy = 10;
                panel.add(amountOfExercise,gbc);
            }
            else if(age>=18 && age<= 64){
                JLabel amountOfExercise = new JLabel();
                amountOfExercise.setText("You were supposed to exercise for around 30 min - 1 hour");
                gbc.gridx = 2;
                gbc.gridy = 10;
                panel.add(amountOfExercise,gbc);
            }
            else if(age>=65){
                JLabel amountOfExercise = new JLabel();
                amountOfExercise.setText("You were supposed to exercise for around 10-30 min");
                gbc.gridx = 2;
                gbc.gridy = 10;
                panel.add(amountOfExercise,gbc);
            }
            JLabel amountOfFruits = new JLabel();
            amountOfFruits.setText("You were supposed to eat 2-3 servings of fruits");
            gbc.gridx = 2;
            gbc.gridy = 8;
            panel.add(amountOfFruits,gbc);


            //this.add(NumOfCups);
            
            //System.out.println(cups,gbc);
            ImageIcon A = new ImageIcon("assets/A.png");
            JLabel label = new JLabel(A);
            gbc.gridx = 1;
            gbc.gridy = 0;
            label.setIcon(A);
            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.TOP);
            panel.add(label, gbc);
            ImageIcon B = new ImageIcon("assets/B.png");
            ImageIcon C = new ImageIcon("assets/C.png");
            ImageIcon D = new ImageIcon("assets/D.png");
            ImageIcon F = new ImageIcon("assets/F.png");
            label.setText("You got an B+!(90%)");
            buffer.close();
            
            this.setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(960,540);
            this.setVisible(true);
        }
        
        
        
            
    }

     public static void main(String[] args) throws IOException  {
        Summary s = new Summary();
    }
}
    
