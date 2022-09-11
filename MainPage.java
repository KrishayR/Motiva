// Krishay

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.io.FileWriter;

public class MainPage extends JFrame{
    public static void main(String[] args) {
        new MainPage();
    }

    public MainPage(){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run(){
                JFrame frame = new JFrame("Motiva");
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setSize(new Dimension(960, 540));
                frame.setResizable(false);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //frame.getContentPane().setBackground(new Color(0x34495E));
                try {
                    frame.add(new Pane());
                } catch (FontFormatException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public class Pane extends JPanel {
        public Pane() throws FontFormatException, IOException {
            setLayout(new GridBagLayout());
            setBackground(new Color(0x34495E));
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.insets = new Insets(-5, 8, 70, 8);

            add(makeQuestionPane("How many hours of sleep did you get today?", new String[]{"5 hours", "6 hours", "7 hours", "8 hours", "9 hours", "10 hours"}), gbc);
            add(makeQuestionPane("How many glasses of water did you drink today?", new String[]{"3 glasses", "4 glasses", "5 glasses", "6 glasses", "7 glasses", "8 glasses", "9 glasses", "10 glasses"}), gbc);
            add(makeQuestionPane("How many servings of fruits did you eat today?", new String[]{"0", "1", "2", "3", "4", "5 or more"}), gbc);
            add(makeQuestionPane("How many minutes have you exercised for today?", new String[]{"0-20 min", "21-40 min", "41-60 min", "1 - 1:30 hour/s", "1:30 - 2 hours", "2+"}), gbc);
        }

        protected JPanel makeQuestionPane(String question, String[] options) throws FontFormatException, IOException {
            InputStream is = askQuestions.class.getResourceAsStream("GlacialIndifference-Regular.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            Font biggerFont = font.deriveFont(Font.BOLD, 24f);
            FileWriter fw = new FileWriter("main_ans.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            JPanel questionPane = new JPanel(new BorderLayout());
            JLabel label = new JLabel(question, JLabel.CENTER);
            label.setFont(biggerFont); 
            label.setForeground(new Color(0x38B6FF));
            questionPane.add(label, BorderLayout.NORTH);
            ButtonGroup q1BG = new ButtonGroup();
            JPanel optionsPane = new JPanel(new GridBagLayout());
            for (String option : options) {
                JRadioButton btn = new JRadioButton(option);
                btn.setForeground(Color.WHITE);
                //btn.setVerticalTextPosition(JRadioButton.BOTTOM);
                //btn.setHorizontalTextPosition(JRadioButton.CENTER);
                q1BG.add(btn);
                optionsPane.add(btn);
            }
            questionPane.add(optionsPane);
            questionPane.setBackground(new Color(0x34495E));
            optionsPane.setBackground(new Color(0x34495E));
            UIManager.put("OptionPane.background", new ColorUIResource(52, 73, 94));
            UIManager.put("Panel.background", new ColorUIResource(52, 73, 94));
            UIManager.put("OptionPane.cancelButtonText", "Close");
            UIManager.put("OptionPane.okButtonText", "Next");


            int result = JOptionPane.showConfirmDialog(null, questionPane,  "Motiva", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.CANCEL_OPTION){
                System.exit(0);
            }else{
                for (Enumeration<AbstractButton> buttons = q1BG.getElements(); buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();
                    if (button.isSelected()) {
                           pw.write(button.getText() + "\n");
                    }
                }
            }
            pw.close();
            return questionPane;
        }
    }
}
