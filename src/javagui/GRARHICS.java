
package javagui;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;



public class GRARHICS extends JPanel implements ActionListener ,KeyListener
{
   // private  ImageIcon image;
    
    Timer TT= new Timer(50,this);
    int x=0,y=0,i1=4,i2=4,a=50,b=10 ,K;
    
    JButton B1 =new JButton("choose the color");
    JColorChooser Color =new JColorChooser();

    public GRARHICS() 
    {
        this.add(B1);
        B1.addActionListener(this);
        addKeyListener(this);
        setFocusTraversalKeysEnabled(true);
        setFocusable(true);
    }
    
    
    
    
    
    
    @Override
    protected void paintComponent(Graphics grphcs) 
    {
        //image =new ImageIcon("\"E:\\\\D.H.F\\\\FB_IMG_1462919017431");
       // image.paintIcon(this, grphcs, 0, 0);
        super.paintComponent(grphcs); 
        
        TT.start();
       
      
//       for(int i=50;i<=this.getHeight();i+=50)
//       {
//           grphcs.drawLine(i, 0, i, this.getHeight());
//           grphcs.drawLine(0, i, this.getWidth(), i);
//           
//       }
//        for(int i=0;i<=this.getHeight();i+=5)
//       {
//           grphcs.drawLine(0, 0, this.getWidth(),i);
//           grphcs.setColor(Color.BLUE);
// 
//       }
//         for(int i=0;i<=this.getWidth();i+=5)
//       {
//           grphcs.drawLine(0, 0, i,this.getHeight());
//           grphcs.setColor(Color.PINK);
// 
//       }


          //grphcs.setColor(Color.BLACK);
          
          grphcs.draw3DRect(150, 100, 200, 300,true);
          grphcs.fill3DRect(200, 150, 30, 50, true);
          grphcs.fill3DRect(270, 150, 30, 50, true);
          grphcs.fill3DRect(200, 250, 30, 50, true);
          grphcs.fill3DRect(270, 250, 30, 50, true);
          grphcs.fill3DRect(225, 320, 50, 70, true);
           // grphcs.setColor(Color.BLACK);
           grphcs.drawOval(x, y, 50, 50);
            grphcs.drawOval(a, b, 50, 50);
       
        
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==B1)
        {
          //  Color ASD =Color.showDialog(null,"",Color.RED);
        Color Color2 =JColorChooser.showDialog(null,"",Color.getColor()) ;
        this.setBackground(Color2);
         
        }
        if(x<0 || x>this.getWidth())
        {
            i1=-i1;
        }
        else if (y<0 || y>this.getHeight())
        {
            i2=-i2;
        }
       x+=i1;
       y+=i2;
       repaint();
    }

    @Override
    public void keyTyped(KeyEvent ke) 
    {
        
    }

    @Override
    public void keyPressed(KeyEvent ke)
    {
        K=ke.getKeyCode();
        
        switch(K)
        {
            case KeyEvent.VK_LEFT :
            {
            a-=5;
            break ;
            }
            
             case KeyEvent.VK_RIGHT :
             {
            a+=5;
            break ;
            }
            case KeyEvent.VK_DOWN :
            {
            b+=5;
            break ;
            }
            case KeyEvent.VK_UP :
            {
            b-=5;
            break ;
            }
            
        }
    }

    @Override
    public void keyReleased(KeyEvent ke)
    {
        
    }
    
    
    
}
