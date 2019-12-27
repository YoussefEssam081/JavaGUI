
package javagui;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class GUI extends JFrame implements ActionListener,MouseMotionListener,MouseListener
{
    
        JButton B1 =new JButton(" RED");
           JButton B2 =new JButton(" YELLOW");
              JButton B3 =new JButton(" BLUE");
                 JButton B4 =new JButton(" WHITE");
                    JButton B5 =new JButton(" GREEN");
                    
                     JPanel P1 =new JPanel();
                     JPanel P2 =new JPanel();
           JLabel L1=new JLabel("");
    public  GUI()
    {
        JFrame F =new JFrame();
         this.setTitle("  ");
     this.setSize(1000,600);
     this.show();
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setLocation(100, 100);
     
         
         
              P1.setBackground(Color.BLACK);
              P2.setBackground(Color.WHITE);
         B1.addActionListener(this);
          B2.addActionListener(this);
           B3.addActionListener(this);
            B4.addActionListener(this);
             B5.addActionListener(this);
             
             
      
    
     this.add(P1);   this.add(P2); 
     P1.setBounds(0, 0, this.getWidth(), 50);
      P2.setBounds(0, 60, this.getWidth(), this.getHeight());
     P1.add(B1); P1.add(B2); P1.add(B3); P1.add(B4); P1.add(B5);
    
    }

   @Override
    public void actionPerformed(ActionEvent E) 
    {
       if(E.getSource()== B1)
       {
           P2.setBackground(Color.RED);
          
       }
       else if (E.getSource()== B2)
       {
           P2.setBackground(Color.YELLOW);
       }
        else if (E.getSource()== B3)
       {
           P2.setBackground(Color.BLUE);
       }
        else if (E.getSource()== B4)
       {
           P2.setBackground(Color.WHITE);
       }
        else if (E.getSource()== B5)
       {
           P2.setBackground(Color.GREEN);
       }
    }

    @Override
    public void mouseClicked(MouseEvent me)
    {
        
    }

    @Override
    public void mousePressed(MouseEvent me) 
    {
        
    }

    @Override
    public void mouseReleased(MouseEvent me)
    {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) 
    {
        
    }

    @Override
    public void mouseExited(MouseEvent me)
    {
      
     setBackground(Color.WHITE);
       
    }

 
    
    
    
    
    
    
    
  //  JFrame F2= new JFrame();
//      F2.setTitle("joo");
//     F2.setSize(500,500);
//    F2.show();
//     F2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     F2.setLocation(100, 100);
//      
//      JButton B1 =new JButton("save");
//       JButton B2 =new JButton("show");
//       JButton B3 =new JButton("menu");
//       JButton B4 =new JButton("menu");   
//       JButton B5 =new JButton("menu");
//     
//       
//       JRadioButton R1 =new JRadioButton("male");
//         JRadioButton R2 =new JRadioButton("female");
//         
//             ButtonGroup G= new ButtonGroup();
//             
//             JCheckBox C1 =new JCheckBox ("CS");
//             JCheckBox C2 =new JCheckBox ("SA");
//             JCheckBox C3 =new JCheckBox ("DB");
//             JCheckBox C4 =new JCheckBox ("IT");
//             
//            JMenuBar M =new JMenuBar();
//             JMenu M1 =new JMenu("file");
//             JMenu M2 =new JMenu("deite");
//             JMenu M3 =new JMenu("GOF");
//             
//             
//      JTextField T1 =new JTextField();
//       JTextField T2 =new JTextField();
//       
//     JLabel L1=new JLabel("full name");
//       JLabel L2=new JLabel("password");
//       JLabel L3=new JLabel("Gender");
//       JLabel L4=new JLabel("course");
//     
//       
//  
//      JPanel P1 =new JPanel();
//     
//       
//   
//    P1.setBackground(Color.CYAN);
//     P1.setForeground(Color.WHITE);
//
//     P1.setLayout(null);
//     
//   F2.add(P1);
//   
//    P1.add(L1);    P1.add(T1);  P1.add(B1); P1.add(R1); P1.add(R2); P1.add(L3);
//         P1.add(L2);    P1.add(T2);  P1.add(B2);   G.add(R1);  G.add(R2); 
//          P1.add(L4);     P1.add(C1);  P1.add(C2);  P1.add(C3);  P1.add(C4);
//     L1.setBounds(20, 20,100 , 50);
//     L2.setBounds(20, 50,100 , 50);
//      L3.setBounds(10, 150,70 , 20);
//         L4.setBounds(10, 200,70 , 20);
//         
//        T1.setBounds(90, 35, 125, 20);
//        T2.setBounds(90, 65, 125, 20);
//         B1.setBounds(10, 100, 70, 20);
//          B2.setBounds(90, 100, 70, 20);
//          R1.setBounds(100, 150, 70, 20);
//          R2.setBounds(170, 150, 70, 20);
//          C1.setBounds(60, 200,70 , 20);
//            C2.setBounds(140, 200,70 , 20);
//              C3.setBounds(220, 200,70 , 20);
//                C4.setBounds(310, 200,70 , 20);
//          
//    M1 .add(B3);  M1 .add(B4);  M1 .add(B5);  
//     M2 .add(B3);  M2 .add(B4);  M2 .add(B5); 
//      M3 .add(B3);  M3 .add(B4);  M3 .add(B5); 
//      M.add(M1);   M.add(M2);   M.add(M3);
//      P1.add(M);
//       M.setBounds(0, 0,100 , 30);
//        
//          B3.setBackground(Color.BLACK);
//          B4.setBackground(Color.LIGHT_GRAY);
//          B5.setBackground(Color.MAGENTA); 
    
//  
//     F2.setLayout(new GridLayout(3,1));

    @Override
    public void mouseDragged(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
