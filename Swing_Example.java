import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Swing_Example extends JFrame implements ActionListener {
    JLabel lb,number;
    JButton b,b2,b3;
    JRadioButton jb[] = new JRadioButton[4];
    ButtonGroup bg;
  
    int count=0, current=0;
  
    Swing_Example() {
        lb = new JLabel();
        add(lb);

        bg = new ButtonGroup();
        for (int i=0;i<4;i++) {
            jb[i] = new JRadioButton();
            add(jb[i]);
            bg.add(jb[i]);
        }

        b = new JButton("Next");
        b.addActionListener(this);
        add(b);

        b2 = new JButton("Restart");
        b2.addActionListener(this);
        add(b2);

        b3= new JButton("Submit");
        b3.addActionListener(this);
        add(b3);

        setTitle("Swing_Example");
        setSize(500,350);
        setVisible(true);
        setLayout(null);
      
        lb.setBounds(50, 60, 300, 20);
        b2.setBounds(50, 200, 80, 30);
        b.setBounds(150, 200, 80, 30);
        b3.setBounds(250, 200, 80, 30);
      
        jb[0].setBounds(55, 90, 180, 20);
        jb[1].setBounds(55, 110, 180, 20);
        jb[2].setBounds(55, 130, 180, 20);
        jb[3].setBounds(55, 150, 180, 20);

        JLabel author = new JLabel();
        author.setText("Aman Singh");
        author.setBounds(220, 270, 220, 20);
        add(author);

        number = new JLabel();
        number.setBounds(40, 45, 160, 10);
        add(number);
        start();
    }

    
    public static void main(String []args) {
        new Swing_Example();  
    }
} 
