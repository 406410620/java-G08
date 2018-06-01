package rpg66;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;



import w7.Rect;

public class MyPanel extends JPanel implements MouseListener , MouseMotionListener {
	private ImageIcon[] img1 ;//= new ImageIcon(":..\\..\\..\\img\\yuki.jpg");
	private JLabel[] label ;//= new JLabel(img1);
	protected String N;//決定要畫的圖
	private Rect r;//畫棋盤用的
	private Color u=Color.BLACK;
	public MyPanel() {
		super();
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public void addimg(JLabel label){
		this.add(label);
		repaint();
	}
	
	public void drawmap() {
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Boolean f = false;
		int mapcount=0;
		/*if(N=="map") {//畫棋盤
			for(int j=0;j<10;j++) {
				for(int i=0;i<10;i++) {
					f = false;
					if(x==mapcount) {
						//f=true;
					}
					mapcount++;
					r=new Rect(30+j*140,30+i*70,100+j*140,100+i*70,Color.BLACK,f);
					r.draw(g);
				}
				if(j%2==0) {
					if(x==mapcount) {
						
					}
					mapcount++;
					r = new Rect(100+j*140,660,170+j*140,730,Color.BLACK,f);
					r.draw(g);
				}else {
					if(x==mapcount) {
						
					}
					mapcount++;
					r = new Rect(100+j*140,30,170+j*140,100,Color.BLACK,f);
					r.draw(g);
				}
			}
		}*/
		
	}



	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}



	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.print(" x = "+e.getX()+", y = "+e.getY()+"\n");
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
