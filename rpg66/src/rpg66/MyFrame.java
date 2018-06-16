package rpg66;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import java.awt.Color;
import java.awt.Container;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import w7.DrawPanel;

public class MyFrame extends JFrame implements ActionListener{
	private MyPanel myPanel;//主視窗畫面
	private SouthPanel southPanel = new SouthPanel();//下方視窗
	private JPanel menuPanel = new JPanel();//左側選單
	//private JFrame nameFrame = new test("Enter your name");
	private JButton play;//遊戲開始
	private JButton dice;//擲骰子
	private JButton map;//顯示地圖
	private JButton bag;//顯示背包
	private JButton role;//顯示持有角色
	private JButton main;
	Boolean h = true;
	GridBagConstraints g = new GridBagConstraints();
	int x=1;
	Player[] player = new Player[2];
	Dice dices = new Dice();
	Thing thing = new Thing();
	Buyrole rolestore = new Buyrole();
	Random rand = new Random();
	String name = null;
	public MyFrame(String title) {
		super(title);
		player[0]= new Player();
		myPanel = new MyPanel();
		play = new JButton("Welcome to sixsix");
		dice = new JButton("dice");
		map = new JButton("map");
		bag = new JButton("bag");
		role = new JButton("role");
		main = new JButton("main");
		
		play.addActionListener(this);
		dice.addActionListener(this);
		map.addActionListener(this);
		bag.addActionListener(this);
		role.addActionListener(this);
		main.addActionListener(this);
		myPanel.N="main";
		
		myPanel.setLayout(null);
		add(myPanel,BorderLayout.CENTER);
		add(southPanel,BorderLayout.SOUTH);
		add(menuPanel,BorderLayout.WEST);
		
		myPanel.add(play);
		southPanel.add(dice);
		menuPanel.add(main);
		menuPanel.add(bag);
		menuPanel.add(map);
		menuPanel.add(role);
		southPanel.setBackground(new Color(30,144,255));
		menuPanel.setBackground(Color.PINK);
		
		play.setBounds(0,0, 1540, 900);
		play.setBackground(Color.PINK);
		play.setFont(new Font("新細明體",Font.PLAIN,100));
		
		southPanel.setPreferredSize(new Dimension(0, 150));
		menuPanel.setPreferredSize(new Dimension(80, 0));
		southPanel.setVisible(false);
		menuPanel.setVisible(false);
	}
	
	
	public void gamestart() throws InterruptedException {
		while(true) {
			menuPanel.setVisible(myPanel.setmenu());
			player[0]=rolestore.returnplayer(player[0]);
			player[0]=myPanel.returnplayer(player[0]);
			//play.setBackground(new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
			southPanel.getdata(player[0]);
			if(myPanel.drawcount>100) {
				southPanel.setVisible(false);
			}
			dice.setBounds(885,100,60,40);
			//myPanel.repaint();
			//repaint();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		upsixsixdata updata = new upsixsixdata();
		if(e.getSource()==dice) {
			x=dices.toss();
			southPanel.getdice(x);
			player[0].x[1]+=x;
			try {
                updata.place_update(player[0].x[1]);
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }
			if(player[0].x[1]==myPanel.mapcount) {
				System.out.print("win");
			}
			if(player[0].x[1]>myPanel.mapcount) {
				player[0].x[1]=myPanel.mapcount-(player[0].x[1]-myPanel.mapcount);
			}
			myPanel.x=player[0].x[1];
			thing.choose(player[0]);
			myPanel.getthing(thing);
			if(thing.x[player[0].x[1]-1]==2||thing.x[player[0].x[1]-1]==12) {
				myPanel.battle(thing.pn);
				myPanel.N="pokmon";
			}
			rolestore.setVisible(false);
			if(thing.rolestore==true) {
				rolestore.setVisible(true);
			}
			myPanel.drawcount=0;
			repaint();
		}
		if(e.getSource()==map) {
			if(myPanel.N!="map") {
				myPanel.N="map";
				southPanel.setVisible(false);
			}else {
				myPanel.N="main";
				southPanel.setVisible(true);
			}
			repaint();
		}
		if(e.getSource()==play) {
			//h=!h;
			//southPanel.setVisible(h);//debug，mapcount=0; move to if(N="map")
			play.setVisible(false);
			//String playcount = JOptionPane.showInputDialog( "how many player" );
			//int playercount = Integer.parseInt(playcount.intern());
			while(name==null) {
				name = JOptionPane.showInputDialog( "Enter your name" );
			}
			player[0] = new Player(name.intern());
			try {
                updata.name_update(player[0].name);
            } catch (ClassNotFoundException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
			southPanel.setVisible(true);
			//System.out.print(player[0].name);
		}
		if(e.getSource()==bag) {
			if(myPanel.N!="bag") {
				myPanel.N="bag";
				southPanel.setVisible(false);
			}else {
				myPanel.N="main";
				southPanel.setVisible(true);
			}
			repaint();
		}
		if(e.getSource()==role) {
			if(myPanel.N!="role") {
				myPanel.N="role";
				southPanel.setVisible(false);
			}else {
				myPanel.N="main";
				southPanel.setVisible(true);
			}
			repaint();
		}
		if(e.getSource()==main) {
			myPanel.N="main";
			southPanel.setVisible(true);
		}
	}
	
}
