import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Calculator extends Frame implements ActionListener {
    TextField tf, tf2;
    Label lb;
    Button b1,b2,b3,b4,b5,b6;
  
    Calculator() {
        setTitle("Calculator");
        setLayout(null);
        setSize(300, 300);
        setVisible(true);
        setBackground(Color.DARK_GRAY);

        tf = new TextField();
        tf.setBounds(60, 50, 80, 30);

        tf2 = new TextField();
        tf2.setBounds(60, 100, 80, 30);

        lb = new Label();
        lb.setBounds(60, 150, 80, 30);
        lb.setBackground(Color.GRAY);

        b1 = new Button("+");
        b1.setBounds(180,50,40,20);
        b1.addActionListener(this);
        b1.setBackground(Color.GRAY);

        b2= new Button("-");
        b2.setBounds(180,80,40,20);
        b2.addActionListener(this);
        b2.setBackground(Color.GRAY);

        b3 = new Button("x");
        b3.setBounds(180,110,40,20);
        b3.addActionListener(this);
        b3.setBackground(Color.GRAY);

        b4 = new Button("/");
        b4.setBounds(180, 140, 40, 20);
        b4.addActionListener(this);
        b4.setBackground(Color.GRAY);

        b5 = new Button("Reset");
        b5.setBounds(60, 200, 60, 30);
        b5.addActionListener(this);
        b5.setBackground(Color.GRAY);

        b6 = new Button("%");
        b6.setBounds(180, 170, 40, 20);
        b6.addActionListener(this); add(b6);
        b6.setBackground(Color.GRAY);

        Label author = new Label();
        author.setText("Aman Singh");
        author.setBounds(80, 260, 200, 20); 
        author.setBackground(Color.GRAY); add(author);
        
        add(tf); add(tf2); add(b1); add(b2);
        add(b3); add(b4); add(b5); add(lb);
    }
    
    public void actionPerformed(ActionEvent e) {
        String s1 = tf.getText();
        String s2 = tf2.getText();
        
        double a = Double.parseDouble(s1);
        double b = Double.parseDouble(s2);
        double c = 0;

        if (e.getSource()==b1) 
            c = a+b;
        else if (e.getSource()==b2) 
            c = a-b;
        else if (e.getSource()==b3)
            c = a*b;
        else if (e.getSource()==b4)
            c = a/b;
        else if (e.getSource()==b6)
            c = a%b;
        
        else if (e.getSource()==b5) {
            tf.setText("");
            tf2.setText("");
        }
        
        DecimalFormat df = new DecimalFormat("#.##");
        String result = df.format(c);
        lb.setText(result);
    }

    
    public static void main(String []args) {
        new Calculator();
    }
} 
