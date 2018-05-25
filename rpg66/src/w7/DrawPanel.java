package w7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JPanel;

public class DrawPanel extends JPanel implements MouseListener , MouseMotionListener{
	final int  MAX=100;
	Shapes shapes[];
	final int RECT = 1;
	final int OVAL = 2;
	final int VERT_TRI = 3;
	int s;
	private Shapes currentshape;
	private int type=1;
	private int count=0;
	private int maxcount=0;
	Random rand = new Random();
	int x1,x2,y1,y2;
	Color color= Color.BLACK;
	Boolean filled;
	public DrawPanel(){
		super();
		shapes = new Shapes[MAX];
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void randgen(int n){
		for(int i=0;i<n;i++) {
			s=rand.nextInt(3)+1;
			switch(s) {
			case RECT:
				x1 = rand.nextInt(1000)+1;
				y1 = rand.nextInt(900)+1;
				x2 = rand.nextInt(1000)+1;
				y2 = rand.nextInt(900)+1;
				filled = rand.nextBoolean();
				color = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
				shapes[count++] = new Rect(x1,y1,x2,y2,color,filled);
				break;
			case OVAL:
				x1 = rand.nextInt(1000)+1;
				y1 = rand.nextInt(900)+1;
				x2 = rand.nextInt(1000)+1;
				y2 = rand.nextInt(900)+1;
				filled = rand.nextBoolean();
				color = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
				shapes[count++] = new Oval(x1,y1,x2,y2,color,filled);
				break;
			case VERT_TRI:
				x1 = rand.nextInt(1000)+1;
				y1 = rand.nextInt(900)+1;
				x2 = rand.nextInt(1000)+1;
				y2 = rand.nextInt(900)+1;
				filled = rand.nextBoolean();
				color = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
				shapes[count++] = new Vertri(x1,y1,x2,y2,color,filled);
				break;
			}
		}
		maxcount=count;
		repaint();
	}
	
	public void Oval(){
		type=2;
		x1 = rand.nextInt(1000)+1;
		y1 = rand.nextInt(900)+1;
		x2 = rand.nextInt(1000)+1;
		y2 = rand.nextInt(900)+1;
		filled = rand.nextBoolean();
		//color = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
		shapes[count++] = new Oval(x1,y1,x2,y2,color,filled);
		maxcount=count;
		repaint();
	}
	
	public void Rect(){
		type=1;
		x1 = rand.nextInt(1000)+1;
		y1 = rand.nextInt(900)+1;
		x2 = rand.nextInt(1000)+1;
		y2 = rand.nextInt(900)+1;
		filled = rand.nextBoolean();
		//color = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
		shapes[count++] = new Rect(x1,y1,x2,y2,color,filled);
		maxcount=count;
		repaint();
	}
	
	public void setcolor(Color color){
		this.color=color;
	}
	
	public void Vertri(){
		type=3;
		x1 = rand.nextInt(1000)+1;
		y1 = rand.nextInt(900)+1;
		x2 = rand.nextInt(1000)+1;
		y2 = rand.nextInt(900)+1;
		filled = rand.nextBoolean();
		//color = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
		shapes[count++] = new Vertri(x1,y1,x2,y2,color,filled);
		maxcount=count;
		repaint();
	}
	
	public void addshape(int type) {
		this.type=type;
		switch(type) {
		case RECT:
			/*x1 = rand.nextInt(1000)+1;
			y1 = rand.nextInt(900)+1;
			x2 = rand.nextInt(1000)+1;
			y2 = rand.nextInt(900)+1;*/
			filled = rand.nextBoolean();
			//color = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
			shapes[count++] = new Rect(x1,y1,x2,y2,color,filled);
			break;
		case OVAL:
			/*x1 = rand.nextInt(1000)+1;
			y1 = rand.nextInt(900)+1;
			x2 = rand.nextInt(1000)+1;
			y2 = rand.nextInt(900)+1;*/
			filled = rand.nextBoolean();
			//color = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
			shapes[count++] = new Oval(x1,y1,x2,y2,color,filled);
			break;
		case VERT_TRI:
			/*x1 = rand.nextInt(1000)+1;
			y1 = rand.nextInt(900)+1;
			x2 = rand.nextInt(1000)+1;
			y2 = rand.nextInt(900)+1;*/
			filled = rand.nextBoolean();
			//color = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
			shapes[count++] = new Vertri(x1,y1,x2,y2,color,filled);
			break;
		}
		maxcount=count;
		repaint();
	}
	
	public void wipe(){
		count=0;
		repaint();
	}
	
	public void undo() {
		count--;
		if(count<0) count=0;
		repaint();
	}
	
	public void redo() {
		count++;
		if(count>maxcount) count--;
		repaint();
	}
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i=0;i<count;i++){
			shapes[i].draw(g);
		}
		if(currentshape!=null) {
			currentshape.draw(g);
		}
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.print("lalala\n");
		currentshape.x2 = e.getX();
		currentshape.y2 = e.getY();
		repaint();
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
		System.out.print("p\n");
		x1 = e.getX();
		y1 = e.getY();
		x2 = x1;
		y2 = y1;
		switch(type) {
		case RECT:
			currentshape = new Rect(x1,y1,x2,y2,color,filled);
			break;
		case OVAL:
			currentshape = new Oval(x1,y1,x2,y2,color,filled);
			break;
		case VERT_TRI:
			currentshape = new Vertri(x1,y1,x2,y2,color,filled);
			break;
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.print("rrr\n");
		x2 = e.getX();
		y2 = e.getY();
		currentshape = null;
		addshape(type);
	}
}
