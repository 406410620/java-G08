package rpg66;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JLabel;

public class Alabel extends JLabel{
	Image image;
	public Alabel(Image image) {
		this.image = image;
	}
	
	public void paintComponent(Graphics g){  
        super.paintComponent(g);  
        int x = this.getWidth();  
        int y = this.getHeight();  
        g.drawImage(image, 0, 0, x, y,null);  
    } 
}
