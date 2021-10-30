import java.awt.*;
import java.awt.event.*;

public class AwtTest extends Frame implements ItemListener {
    Label lb;
    CheckboxGroup options;
    Checkbox a1;

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

        Label status = new Label();
        status.setBounds(80,210,150,20);
        status.setVisible(true);

        options = new CheckboxGroup();
        a1= new Checkbox("Mumbai",options,false);
        a1.setBounds(80, 80, 80, 30);

        a1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e) {
                status.setBackground(Color.RED);
                status.setText(" Your Answer is Incorrect");
            }
        });

        
        add(status);
        add(lb);
        add(a1);

        }

    public static void main(String []args) {
        new AwtTest();
    }
} 
