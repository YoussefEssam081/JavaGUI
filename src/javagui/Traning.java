
package javagui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Traning extends JFrame implements ActionListener
{
        JLabel L1 = new JLabel("Number 1");
        JLabel L2 = new JLabel("Number 2");
        JLabel L3 = new JLabel("Result");
        JButton B1 = new JButton("Add");
        JButton B2 = new JButton("Subtract");
        JButton B3 = new JButton("Multiply");
        JButton B4 = new JButton("Divide");
        JTextField T1 = new JTextField();
        JTextField T2 = new JTextField();
        JTextField T3 = new JTextField();
    public Traning() 
    {
        this.add(L1);
         this.add(L2);
         this.add(L3);
         this.add(B1);
         this.add(B2);
         this.add(B3);
         this.add(B4);
         this.add(T1);
         this.add(T2);
         this.add(T3);
        this.setTitle("Exercise 11.2");
        
        this.setSize(800, 200);
        this.setLayout(null);
        L1.setBounds(10, 10, 80, 30);
        L2.setBounds(230, 10, 80, 30);
        L3.setBounds(430, 10, 80, 30);
        T1.setBounds(80, 10, 80, 30);
        T2.setBounds(300, 10, 80, 30);
        T3.setBounds(480, 10, 80, 30);
        B1.setBounds(80, 80, 80, 30);
        B2.setBounds(180, 80, 100, 30);
        B3.setBounds(300, 80, 80, 30);
        B4.setBounds(400, 80, 80, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.show();
       B1.addActionListener(this);
       B2.addActionListener(this);
       B3.addActionListener(this);
       B4.addActionListener(this); 
    }
    

    @Override
    public void actionPerformed(ActionEvent E) 
    {
        String S = T1.getText();
       // xstr = JOptionPane.showInputDialog(xstr);
        float F = Float.parseFloat(S);
        String S2 = T2.getText();
       // xstr2 = JOptionPane.showInputDialog(xstr);
        float F2 = Float.parseFloat(S2);
        if (E.getSource()==B1) 
        {
            float DHF = F+F2;
            String JOO = Float.toString(DHF);
            T3.setText(JOO);
        }
        else if (E.getSource()==B2)
        {
           float DHF = F-F2;
            String JOO = Float.toString(DHF);
            T3.setText(JOO);
        }
        else if (E.getSource()==B3) 
        {
            float DHF = F*F2;
            String JOO = Float.toString(DHF);
            T3.setText(JOO);
        }
        else if (E.getSource()==B4)
        {
            float DHF = F/F2;
            String JOO = Float.toString(DHF);
           T3.setText(JOO);
        }
    }
    
}
