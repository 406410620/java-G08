package rpg66;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SouthPanel extends JPanel implements  MouseListener , MouseMotionListener{
	private Image playerimg = new ImageIcon(this.getClass().getResource("/img/player.jpg")).getImage();//玩家頭像
	private Icon icon = new ImageIcon(this.getClass().getResource("/img/dice.gif"));//骰子動圖
	private JLabel label = new JLabel(icon);
	Player p = new Player();
	int x;
	int dc;
	private Image diceimg1 = new ImageIcon(this.getClass().getResource("/img/dice1.png")).getImage();//骰子圖案
	private Image diceimg2 = new ImageIcon(this.getClass().getResource("/img/dice2.png")).getImage();
	private Image diceimg3 = new ImageIcon(this.getClass().getResource("/img/dice3.png")).getImage();
	private Image diceimg4 = new ImageIcon(this.getClass().getResource("/img/dice4.png")).getImage();
	private Image diceimg5 = new ImageIcon(this.getClass().getResource("/img/dice5.png")).getImage();
	private Image diceimg6 = new ImageIcon(this.getClass().getResource("/img/dice6.png")).getImage();
	public SouthPanel() {
		super();
		addMouseListener(this);
		addMouseMotionListener(this);
		this.add(label);
		
	}
	
	public void getdata(Player player) {
		p = player;
	}
	
	public void getdice(int x) {
		this.x = x;
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		if(x!=0) {
			label.setVisible(false);
			switch(x) {
			case 1:
				g2.drawImage(diceimg1,660,0,150,150,null);
				break;
			case 2:
				g2.drawImage(diceimg2,660,0,150,150,null);
				break;
			case 3:
				g2.drawImage(diceimg3,660,0,150,150,null);
				break;
			case 4:
				g2.drawImage(diceimg4,660,0,150,150,null);
				break;
			case 5:
				g2.drawImage(diceimg5,660,0,150,150,null);
				break;
			case 6:
				g2.drawImage(diceimg6,660,0,150,150,null);
				break;
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(dc<100) {
				dc++;
			}else {
				label.setVisible(true);
				x=0;
				dc=0;
			}
			repaint();
		}
		label.setBounds(660,0,200,200);
		g2.drawImage(playerimg, 0, 0, 145, 150,null );
		g2.setColor(Color.BLACK);
		g2.setFont(new Font("新細明體", Font.PLAIN, 40));
		g2.drawString(p.name,150 ,40 );
		g2.setFont(new Font("新細明體", Font.PLAIN, 20));
		//g2.setColor(Color.white);
		//g2.drawString("level: "+p.role[0].level, 155, 60);
		g2.setColor(Color.YELLOW);
		g2.drawString("money: "+p.x[0]+"$", 155, 80);
		g2.setColor(Color.RED);
		g2.drawString("the "+p.x[1]+" stage", 155, 100);
		g2.setFont(new Font("新細明體", Font.PLAIN, 80));
		g2.drawString(p.x[1]+" stage", 1230, 80);
		g2.setFont(new Font("新細明體", Font.PLAIN, 15));
		g2.setColor(Color.black);
		g2.drawString("own Role: "+p.rolecount,155 ,120 );
		for(int i=0;i<p.rolecount;i++) {
			g2.drawString((i+1)+"."+p.role[i].name,155+i*60, 140);
		}
		
		/*g2.setColor(Color.BLACK);
		g2.setFont(new Font("新細明體", Font.PLAIN, 12));
		g2.drawString("6666", 100, 100);*/
		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.print(" x = "+e.getX()+", y = "+e.getY()+"\n");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
