package rpg66;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Buyrole extends JFrame implements ActionListener {
	JButton a = new JButton("buy(1000$)");
	JButton b = new JButton("buy(1500$)");
	JButton c = new JButton("buy(2000$)");
	JPanel k = new JPanel();
	RolePanel rolepanel=new RolePanel();
	Player p = new Player();
	FlowLayout f = new FlowLayout();
	public Buyrole() {
		super("Role store");
		//this.setSize(422, 240);
		this.setBounds(391, 126,600,440);
		this.setResizable(false);
		add(rolepanel,BorderLayout.CENTER);
		add(k,BorderLayout.SOUTH);
		k.setLayout(f);
		f.setHgap(100);
		k.add(a);
		k.add(b);
		k.add(c);
		a.addActionListener(this);
		b.addActionListener(this);
		c.addActionListener(this);
	}
	
	
	public Player returnplayer(Player player) {
		p = player;
		return p;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		upsixsixdata updata = new upsixsixdata();
		if(e.getSource()==a) {
			if(p.x[0]>=1000 && p.rolecount<10) {
				p.x[0]-=1000;
				p.addrole(0);
				try {
                    updata.money_update(p.x[0]);
                } catch (ClassNotFoundException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
			}
		}
		
		if(e.getSource()==b && p.rolecount<10) {
			if(p.x[0]>=1500) {
				p.x[0]-=1500;
				p.addrole(1);
				try {
                    updata.money_update(p.x[0]);
                } catch (ClassNotFoundException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
			}
			else {
				//
			}
		}
		
		if(e.getSource()==c && p.rolecount<10) {
			if(p.x[0]>=2000) {
				p.x[0]-=2000;
				p.addrole(2);
				try {
                    updata.money_update(p.x[0]);
                } catch (ClassNotFoundException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
			}
			else {
				//
			}
		}
	}
}

class RolePanel extends JPanel implements MouseListener , MouseMotionListener{
	private Image img1 = new ImageIcon(this.getClass().getResource("/img/r1.png")).getImage();
	private Image img2 = new ImageIcon(this.getClass().getResource("/img/r2.png")).getImage();
	private Image img3 = new ImageIcon(this.getClass().getResource("/img/r3.png")).getImage();
	Random rand = new Random();
	public RolePanel() {
		super();
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;	
		g2.drawImage(img1,-80,-10,400,400,null);
		g2.drawImage(img2,200,-5,250,400,null);
		g2.drawImage(img3,350,-10,280,400,null);
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		this.setBackground(new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
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
		System.out.print(" x = "+e.getX()+", y = "+e.getY()+"\n");
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
