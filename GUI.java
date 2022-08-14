// Krishay
import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;

public class GUI {

    public static void main(String[] args) throws FontFormatException, IOException {
        new GUI();
    }

    public GUI() throws FontFormatException, IOException {
        ImageIcon motto = new ImageIcon("assets/motto.png");


        JFrame frame = new JFrame("Motiva");        
        JLabel motto_l = new JLabel(motto);
        motto_l.setIcon(motto);              
        frame.add(motto_l);
        
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        JButton start = new JButton("Start");
        InputStream is = GUI.class.getResourceAsStream("GlacialIndifference-Regular.ttf");
        Font font = Font.createFont(Font.TRUETYPE_FONT, is);
        Font biggerFont = font.deriveFont(25f);
        start.setForeground(new Color(0xFFFFFF));
        start.setBorderPainted(false);
        start.setFocusPainted(false);
        start.setBackground(new Color(0x38B6FF));
        start.setOpaque(true);
        start.setFont(biggerFont);
        gbc.gridx = 0;
        gbc.gridy = -2;
        frame.add(start, gbc);
        start.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                frame.dispose();
                frame.setVisible(false);
                askQuestions.main(null);
                } catch (Exception ex) {
                System.out.println("");
                }
                
            }
            });
        frame.pack();
        frame.setResizable(false);
        frame.setSize(960, 540);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Motiva");
        frame.getContentPane().setBackground(new Color(0x34495E));
        frame.setVisible(true);
        }
        
    }
