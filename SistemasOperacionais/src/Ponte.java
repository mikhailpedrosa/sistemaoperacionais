import java.awt.*;

import javax.swing.*;


public class Ponte extends JPanel{

	Image ponte,carroE,carroD;
	
	public Ponte() {
        
        MediaTracker mt = new MediaTracker(this);
        Toolkit toolkit = Toolkit.getDefaultToolkit();       
        ponte = toolkit.getImage("image/bridge1.jpg");
        carroE = toolkit.getImage("image/redcar.gif");        
        carroD = toolkit.getImage("image/bluecar.gif");
        
        mt.addImage(carroE, 0);
        mt.addImage(carroD, 1);
        mt.addImage(ponte, 2);         
        setPreferredSize(new Dimension(ponte.getWidth(null), ponte.getHeight(null)));
        
        try {
            mt.waitForID(0);
            mt.waitForID(1);
            mt.waitForID(2);
        } catch (java.lang.InterruptedException e) {
            System.out.println("Alguma das imagens esta faltando");
        }
    }
	
	public void paintComponent(Graphics g) {
        g.drawImage(ponte, 0, 0, this);
	}
	
}
