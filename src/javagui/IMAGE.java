
package javagui;
import java.applet.*;
import java.awt.*;
import javax.swing.JFrame;
import java.net.URL;

public class IMAGE extends Applet
{

    public IMAGE() throws HeadlessException 
    {
         
  
    }
    
    
Image img;

@Override
public void init()
{
     super.init();
    img = getImage(getCodeBase(), "E:\\D.H.F\\FB_IMG_1501107815444");
    System.out.println(getCodeBase());
}



public void paint(Graphics g)
{
   // super.paint(g);
   // g.drawImage(img, 0, 0, this);
}

    private void setTitle(String _graphics_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
