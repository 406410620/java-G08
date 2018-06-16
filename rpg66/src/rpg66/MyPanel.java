package rpg66;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;



import w7.Rect;

public class MyPanel extends JPanel implements MouseListener , MouseMotionListener {
	
	private Image img = new ImageIcon(":..\\..\\..\\img\\yuki.jpg").getImage();//test
	private Image img2 = new ImageIcon(this.getClass().getResource("/img/orange.jpg")).getImage();//磚塊素材
	private Image img3 = new ImageIcon(":..\\..\\..\\img\\01.jpg").getImage();//test
	private Image img5 = new ImageIcon(this.getClass().getResource("/img/rolebackground.jpg")).getImage();//角色背景
	
	private Image fireimg1 = new ImageIcon(this.getClass().getResource("/img/fireleft.png")).getImage();//火把
	private Image fireimg2 = new ImageIcon(this.getClass().getResource("/img/fireright.png")).getImage();//火把
	//private Image fireimg1 = new ImageIcon(this.getClass().getResource("/img/fireleft.png")).getImage();//火把

	protected Boolean setmenu = false; 
	protected String N;//決定要畫的圖
	private Rect r;//畫棋盤用的
	int px;
	int py;
	
	private Color u=Color.BLACK;
	Random rand = new Random();
	int x=1;
	int mapcount=110;
	int battlecount=0;
	int drawcount;
	int maincount=0;
	int pn;
	int thing;
	Pokmon pokmon;
	Player p = new Player();
	Player p2 = new Player();
	Thing t = new Thing();
	private Image roleimg;
	private Image pokmonimg;
	public MyPanel() {
		super();
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public void getthing(Thing thing){
		t = thing;
	}
	
	public Player returnplayer(Player player) {
		p = player;
		//System.out.print(player.name);
		//System.out.print(p.name);
		return p;
	}
	
	public void copyplayer() {
		if(p.name!=null&&p2.name==null) {
			p2 = p;
		}
	}
	
	public void battle(int n) {
		pn =n;
		System.out.print("--"+n+"--");
		pokmon = new Pokmon(n);
		pokmonimg = new ImageIcon(this.getClass().getResource("/img/pp"+pn+".png")).getImage();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		Boolean f = false;//玩家位置為黑色
		if(N=="main") {
			
			//N="map";//吃毒
			g2.setColor(Color.black);
			this.setBackground(Color.GRAY);
			g2.fillRect(780, 350, 10, 20);//由此長方形延伸
			
			g2.drawLine(780, 350, 0,100);//延伸四條線
			g2.drawLine(780, 370, 0, 680);
			g2.drawLine(790, 350, 1540,100);
			g2.drawLine(790, 370, 1540,680);
			int[] xv3 = {780,790,1540,1540,0,0};
			int[] yv3 = {350,350,100,0,0,100};
			g2.setColor(new Color(115,74,18));
			g2.fillPolygon(xv3, yv3, 6);
			
			int[] xv4 = {780,790,1540,0};
			int[] yv4 = {370,370,680,680};
			g2.setColor(new Color(115,74,18));
			g2.fillPolygon(xv4, yv4, 4);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i=0;i<=300;i+=10) {
				g2.drawImage(fireimg2,790+3*i*5,350-1*i*5,10+3*i*5,10+3*i*5,null);	
				g2.drawImage(fireimg1,770-6*i*5,350-1*i*5,10+3*i*5,10+3*i*5,null);
			}
			for(int i=0;i<=20;i++) {
				g2.drawImage(fireimg2,790+3*i*maincount,350-1*i*maincount,10+3*i*maincount,10+3*i*maincount,null);	
				g2.drawImage(fireimg1,770-6*i*maincount,350-1*i*maincount,10+3*i*maincount,10+3*i*maincount,null);
			}
			repaint();
			maincount++;
			if(maincount>200) {
				maincount=0;
			}
			if(t.n!=0) {
				switch(t.n) {
				case 1:
					g2.setFont(new Font("新細明體", Font.PLAIN, 50));
					g2.setColor(Color.RED);
					g2.drawString("ka.....step a trap",500, 600);
					break;
				case 2:
					g2.setFont(new Font("新細明體", Font.PLAIN, 50));
					g2.setColor(Color.RED);
					g2.drawString("Boooo,quiet!.....encounter pokmon",500, 600);
					break;
				case 3:
					g2.setFont(new Font("新細明體", Font.PLAIN, 50));
					g2.setColor(Color.WHITE);
					g2.drawString("levelup",500, 600);
					break;
				case 4:
					g2.setFont(new Font("新細明體", Font.PLAIN, 50));
					g2.setColor(Color.yellow);
					g2.drawString("pass by bank....get some money",500, 600);
					break;
				case 5:
					g2.setFont(new Font("新細明體", Font.PLAIN, 50));
					g2.setColor(Color.green);
					g2.drawString("pass by beddingworldbed....all roles' hp ++",500, 600);
					break;
				case 6:
					g2.setFont(new Font("新細明體", Font.PLAIN, 50));
					g2.setColor(Color.RED);
					g2.drawString("Little brother, I see you skeletal surprise....all role's atk ++",400, 600);
					break;
				case 7:
					g2.setFont(new Font("新細明體", Font.PLAIN, 50));
					g2.setColor(Color.blue);
					g2.drawString("all roles' def up",500, 600);
					break;
				case 8:
					g2.setFont(new Font("新細明體", Font.PLAIN, 50));
					g2.setColor(Color.white);
					g2.drawString("all roles' all value up",500, 600);
					break;
				case 9:
					g2.setFont(new Font("新細明體", Font.PLAIN, 50));
					g2.setColor(Color.RED);
					g2.drawString("get a mysterious Treasure box，anything can happen",500, 600);
					break;
				case 10:
					g2.setFont(new Font("新細明體", Font.PLAIN, 50));
					g2.setColor(Color.GREEN);
					g2.drawString("pass by hotel，hp UP UP ++",500, 600);
					break;
				case 11:
					g2.setFont(new Font("新細明體", Font.PLAIN, 50));
					g2.setColor(Color.ORANGE);
					g2.drawString("pass by mercenary guild",500, 600);
					break;
				case 12:
					g2.setFont(new Font("新細明體", Font.PLAIN, 50));
					g2.setColor(Color.RED);
					g2.drawString("Boss war!!!",500, 600);
					break;
				default:
					break;
				}
			}
			
			if(setmenu==false) {
				int[] xv = {0,40,0};
				int[] yv = {200,360,500};
				g2.setColor(Color.pink);
				g2.fillPolygon(xv, yv,3);
				int[] xv2 = {0,30,0};
				int[] yv2 = {240,360,460};
				g2.setColor(new Color(160,82,45));
				g2.fillPolygon(xv2, yv2,3);
			}
			
			
			//g.drawImage(img,0,0,1453,745,null);
		}else if(N=="map") {//畫棋盤
			//N="main";//吃毒
			mapcount = 0;//debug
			g2.setStroke(new BasicStroke(5.0f));
			//g2.drawImage(img,0,0,1453,800,null);
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
		}else if(N=="pokmon") {
			for(int i=0;i<12;i++){
				g2.setColor(Color.black);
				this.setBackground(new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
				g2.fillRect(780, 350, 10, 20);//由此長方形延伸
				g2.drawLine(780, 350, 0,100);//延伸四條線
				g2.drawLine(780, 370, 0, 680);
				g2.drawLine(790, 350, 1540,100);
				g2.drawLine(790, 370, 1540,680);
			}
			switch(rand.nextInt(3)+1) {
			case 1:
				g2.drawImage(pokmonimg,620,280,200,200,null);
				break;
			case 2:
				g2.drawImage(pokmonimg,680,280,200,200,null);
				break;
			case 3:
				g2.drawImage(pokmonimg,650,280,200,200,null);
				break;
			}
			// g2.drawImage(pokmonimg,650,280,200,200,null);
			for(int i=0;i<p.rolecount;i++) {
				roleimg = new ImageIcon(this.getClass().getResource("/img/r"+(p.role[i].n+1)+".png")).getImage();		
				switch(rand.nextInt(2)+1) {
				case 1:
					g2.drawImage(roleimg,i*150-30,380,200,400,null);
					break;
				case 2:
					g2.drawImage(roleimg,i*150+30,380,200,400,null);					
					break;
				}
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			battlecount++;
			if(battlecount>20) {
				g2.setFont(new Font("新細明體", Font.PLAIN, 50));
				g2.setColor(Color.RED);
				g2.drawString("encounter Slime "+pn+"!!!",480, 120);
			}
			if(battlecount>40) {
				if(p.role[0].grow[0]>0) {
					g2.setFont(new Font("新細明體", Font.PLAIN, 50));
					g2.setColor(Color.YELLOW);
					g2.drawString("Defeat Slime"+pn+"!!!",480, 220);
				}else {
					g2.setFont(new Font("新細明體", Font.PLAIN, 50));
					g2.setColor(Color.YELLOW);
					g2.drawString("Be defeated by Slime"+pn+"!!!",480, 220);
				}
			}
			if(battlecount>60) {
				if(p.role[0].grow[0]>0) {
					N="main";
					if(p.x[1]==110) {
						N="win";
					}
					battlecount=0;
				}else {
					N="role";
					battlecount=0;
				}
			}
		}else if(N=="role") {
			this.setBackground(null);
			for(int i=0;i<12;i++) {
				for(int j=0;j<20;j++) {
					g2.drawImage(img5,0+j*80,0+i*70,80,70,null);
				}
			}
			for(int i=0;i<p.rolecount;i++) {
				roleimg = new ImageIcon(this.getClass().getResource("/img/r"+(p.role[i].n+1)+".png")).getImage();
				g2.drawImage(roleimg,i*150-30,20,200,400,null);
				g2.setColor(Color.white);
				g2.setFont(new Font("新細明體", Font.PLAIN, 20));
				g2.drawString("Career: "+p.role[i].name,30+i*150, 350);
				g2.setFont(new Font("新細明體", Font.PLAIN, 15));
				g2.setColor(Color.YELLOW);
				g2.drawString("Level: "+p.role[i].level,30+i*150, 380);//
				g2.setFont(new Font("新細明體", Font.PLAIN, 15));
				g2.setColor(Color.GREEN);
				g2.drawString("Hp: "+p.role[i].grow[0],30+i*150, 400);
				g2.setColor(Color.RED);
				g2.drawString("Atk: "+p.role[i].grow[1],30+i*150, 420);
				g2.setColor(new Color(100,149,237));
				g2.drawString("Def: "+p.role[i].grow[2],30+i*150, 440);
			}
			if(p.role[0].grow[0]<=0) {//losegame
				for(int i=0;i<12;i++) {
					for(int j=0;j<20;j++) {
						g2.drawImage(img5,0+j*80,0+i*70,80,70,null);
					}
				}
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(drawcount>30) {
					g2.setFont(new Font("新細明體", Font.PLAIN, 100));
					g2.setColor(Color.white);
					g2.drawString("Player: "+p.name,100, 100);
				}
				if(drawcount>70) {
					g2.setFont(new Font("新細明體", Font.PLAIN, 60));
					g2.setColor(Color.yellow);
					g2.drawString("Money: "+p.x[0]+"$",100, 180);
				}
				if(drawcount>110) {
					g2.setFont(new Font("新細明體", Font.PLAIN, 60));
					g2.setColor(Color.RED);
					g2.drawString("Stage: "+p.x[1],100, 260);
				}
				if(drawcount>150) {
					g2.setFont(new Font("新細明體", Font.PLAIN, 250));
					g2.setColor(Color.RED);
					g2.drawString("Challenge fail",100, 540);
				}
				drawcount++;
				repaint();
			}
		}else if(N=="win") {
			//passgame
			System.out.print("+++++");
				for(int i=0;i<12;i++) {
					for(int j=0;j<20;j++) {
						g2.drawImage(img5,0+j*80,0+i*70,80,70,null);
					}
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(drawcount>30) {
					g2.setFont(new Font("新細明體", Font.PLAIN, 100));
					g2.setColor(Color.white);
					g2.drawString("Player: "+p.name,100, 100);
				}
				if(drawcount>70) {
					g2.setFont(new Font("新細明體", Font.PLAIN, 60));
					g2.setColor(Color.yellow);
					g2.drawString("Money: "+p.x[0]+"$",100, 180);
				}
				if(drawcount>110) {
					g2.setFont(new Font("新細明體", Font.PLAIN, 60));
					g2.setColor(Color.RED);
					g2.drawString("Stage: "+p.x[1],100, 260);
				}
				if(drawcount>150) {
					g2.setFont(new Font("新細明體", Font.PLAIN, 250));
					g2.setColor(Color.RED);
					g2.drawString("Challenge success",100, 540);
				}
				drawcount++;
				repaint();
			}
	}else if(N=="bag") {
		this.setBackground(Color.BLACK);
		g2.setFont(new Font("新細明體", Font.PLAIN, 250));
		g2.setColor(Color.white);
		g2.drawString("Nothing",100, 540);
	}
}

	public Boolean setmenu() {
		return setmenu;
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
		if(setmenu==false) {
			if(e.getX()>0&&e.getX()<40&&e.getY()>200&&e.getY()<500){
				setmenu=true;
		}	
		}else {
			//N="main";
			setmenu=false;
		}
		
		System.out.print(" x = "+e.getX()+", y = "+e.getY()+"\n");
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	
}
