package rpg66;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;



import w7.Rect;

public class MyPanel extends JPanel implements MouseListener , MouseMotionListener {
	//private ImageIcon img1 = new ImageIcon(":..\\..\\..\\img\\yuki.jpg");
	//private JLabel label = new JLabel(img1);
	
	private Image img = new ImageIcon(":..\\..\\..\\img\\yuki.jpg").getImage();
	private Image img2 = new ImageIcon(":..\\..\\..\\img\\orange.jpg").getImage();
	//private Image img = new ImageIcon(":..\\..\\..\\img\\test.gif").getImage();
	//private JLabel label2 = new Alabel(img);
	
	protected String N;//決定要畫的圖
	private Rect r;//畫棋盤用的
	private Color u=Color.BLACK;
	Random rand = new Random();
	int x=1;
	int mapcount=0;
	public MyPanel() {
		super();
		addMouseListener(this);
		addMouseMotionListener(this);
		
	}
	
	public void addimg(){
		
		//this.add(label);
		//repaint();
	}
	
	public void drawmap() {
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		Boolean f = false;
		mapcount = 0;
		if(N=="img") {
			for(int i=0;i<12;i++) {
				for(int j=0;j<20;j++) {
					g2.drawImage(img2,0+j*80,0+i*70,80,70,null);
				}
			}
			//g.drawImage(img,0,0,1453,745,null);
		}
		if(N=="map") {//畫棋盤
			g2.setStroke(new BasicStroke(5.0f));
			//g.drawImage(img,0,0,1453,800,null);
			for(int i=0;i<12;i++) {
				for(int j=0;j<20;j++) {
					g2.drawImage(img2,0+j*80,0+i*70,80,70,null);
				}
			}
			for(int j=0;j<10;j++) {
				if(j%2==0) {
					for(int i=0;i<10;i++) {
						mapcount++;
						if(x==mapcount) {
							f=true;
						}
						r=new Rect(30+j*140,30+i*70,100+j*140,100+i*70,Color.BLACK,f);
						r.draw(g2);
						
						f = false;
					}
					mapcount++;
					if(x==mapcount) {
						f=true;
					}
					r = new Rect(100+j*140,660,170+j*140,730,Color.BLACK,f);
					r.draw(g2);
					f=false;
					
				}else {
					for(int i=9;i>=0;i--) {
						mapcount++;
						if(x==mapcount) {
							f=true;
						}
						
						r=new Rect(30+j*140,30+i*70,100+j*140,100+i*70,Color.BLACK,f);
						r.draw(g2);
						f = false;
						
					}
					mapcount++;
					if(x==mapcount) {
						f=true;
					}
					
					r = new Rect(100+j*140,30,170+j*140,100,Color.BLACK,f);
					r.draw(g2);
					f=false;
					
				}
			}//	
			System.out.print("count =" + mapcount+"\n"+"x = "+x);
		}
		
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
