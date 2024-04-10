import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JLabel label1;
    //constructor
    public GUI(){
        //Create frame
        JFrame frame = new JFrame("Test GUI");
        //Set frame size
        frame.setSize(300,500);
        //Makes program exit when we close the GUI
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Create panel & set defaults
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        panel.setLayout(new GridLayout(4, 1, 10,10));
        frame.add(panel);

        //Create Buttons & add to panel
        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);

        //Adding actions to buttons
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //code we want to run when B1 is pressed
                b1Press();
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call method you want to perform here
                b2Press();
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call method you want to perform here
                b3Press();

            }
        });

        //Create Label & add to panel
        label1 = new JLabel("label");
        label1.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label1);

        //Makes frame show up
        //Should be at the end of the constructor
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    //Methods that are called when buttons are clicked
    public void b1Press(){
        label1.setText("You clicked B1");
    }
    public void b2Press(){
        label1.setText("You clicked B2");
    }
    public void b3Press(){
        label1.setText("You clicked B3");
    }
}
