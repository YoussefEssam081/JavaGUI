
package javagui;


import javax.swing.*;



public class Graphics extends JFrame
{
    GRARHICS DHF =new GRARHICS();

    public Graphics()
    {
        
     this.setTitle(" GRAPHICS ");
     this.setSize(500,500);
     this.show();
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setLocation(100, 100);
     this.add(DHF);
    }

    
    
    
}
