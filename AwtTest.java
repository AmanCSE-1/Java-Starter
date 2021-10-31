import java.awt.*;
import java.awt.event.*;

public class AwtTest extends Frame implements ItemListener {
    Label lb;
    CheckboxGroup options;
    Checkbox a1,a2,a3,a4;

    public AwtTest(){
        setTitle("AwtTest Example");
        setSize(380, 300);
        setLayout(null);
        setVisible(true);
        setBackground(Color.DARK_GRAY);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }); 
        
        lb=new Label();
        lb.setText("What is the capital of India ?");
        lb.setBounds(70,50, 160, 30);
        lb.setBackground(Color.LIGHT_GRAY);
        lb.setVisible(true);
        
        author = new Label();
        author.setText("Aman Singh");
        author.setBounds(140, 240, 200, 20);
        author.setBackground(Color.YELLOW);

        Label status = new Label();
        status.setBounds(80,210,150,20);
        status.setVisible(true);

        options = new CheckboxGroup();
        a1= new Checkbox("Mumbai",options,false);
        a1.setBounds(80, 80, 80, 30);
        a2= new Checkbox("Chennai",options,false);
        a2.setBounds(80, 110,80, 30);
        a3= new Checkbox("New Dehli",options,false);
        a3.setBounds(80, 140,80, 30);
        a4= new Checkbox("Kolkata",options,false);
        a4.setBounds(80, 170,80, 30);

        a1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e) {
                status.setBackground(Color.RED);
                status.setText(" Your Answer is Incorrect");
            }
        });
        
        a2.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e) {
                status.setBackground(Color.RED);
                status.setText(" Your Answer is Incorrect");
            }
        });
        
        a3.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e) {
                status.setBackground(Color.GREEN);
                status.setText(" Your Answer is Correct");
            }
        });

        a4.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e) {
                status.setBackground(Color.RED);
                status.setText(" Your Answer is Incorrect");
            }
        });

        add(author);
        add(status);
        add(lb);
        add(a1);
        add(a2);
        add(a3);
        add(a4);

        }

    public static void main(String []args) {
        new AwtTest();
    }
} 
