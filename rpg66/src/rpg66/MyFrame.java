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
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import w7.DrawPanel;

public class MyFrame extends JFrame implements ActionListener{
	private MyPanel myPanel;//�D�����e��
	private JPanel southPanel = new JPanel();//�U�����
	private JPanel menuPanel = new JPanel();//�������
	private JFrame nameFrame = new test("Enter your name");
	private JButton play;
	private JButton dice;//�Y��l
	private JButton map;//��ܦa��
	private JButton bag;//��ܭI�]
	private JButton enter;
	private JTextField textField = new JTextField();
	Boolean h = true;
	private GridLayout gb = new GridLayout();
	private CardLayout c = new CardLayout();
	GridBagConstraints g = new GridBagConstraints();
	int x;
	Player palyer1 = new Player();
	
	public MyFrame(String title) {
		super(title);
		//this.setResizable(false);//���w�����Y��
		/*Player p = new Player();//����role1��role2
		p.addrole(0);
		p.addrole(0);
		System.out.println(p.role[0].level);
		System.out.println(p.role[1].level);
		p.role[1].levelup();
		System.out.println(p.role[0].level);
		System.out.println(p.role[1].level); */
		myPanel = new MyPanel();
		play = new JButton("play");
		dice = new JButton("dice");
		map = new JButton("map");
		enter = new JButton("enter");
		play.addActionListener(this);
		dice.addActionListener(this);
		map.addActionListener(this);
		enter.addActionListener(this);
		//myPanel.N="map";
		myPanel.N="img";
		myPanel.addimg();
		myPanel.setLayout(c);
		add(myPanel,BorderLayout.CENTER);
		add(southPanel,BorderLayout.SOUTH);
		add(menuPanel,BorderLayout.WEST);
		menuPanel.add(play);
		menuPanel.add(map);
		southPanel.add(dice);
		
		
		southPanel.setBackground(Color.GREEN);
		menuPanel.setBackground(Color.PINK);
		dice.setPreferredSize(new Dimension(60,40));
		
	
		southPanel.setPreferredSize(new Dimension(0, 50));
		menuPanel.setPreferredSize(new Dimension(80, 0));
		//menuPanel.setVisible(false);
		Container cp=nameFrame.getContentPane();
		cp.add(textField);
		textField.setText("�п�A���W�l:");
		  //�����r�ءA��K�ϥΪ̧��
		textField.selectAll();
		textField.setBounds(0,0, 400, 200);
		textField.setFont(new Font("�s�ө���",Font.PLAIN,100));
		nameFrame.setLayout(null);
		nameFrame.add(textField);
		nameFrame.add(enter);
		nameFrame.setBounds(514, 264,0,0);
		nameFrame.setSize(400, 200);
		nameFrame.setBackground(Color.black);
		nameFrame.setVisible(true);
		nameFrame.setResizable(false);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==dice) {
			//int x;
			Dice dice = new Dice();
			x=dice.toss();
			myPanel.x+=x;
			if(myPanel.x==myPanel.mapcount) {
				System.out.print("win");
			}
			if(myPanel.x>myPanel.mapcount) {
				myPanel.x=myPanel.mapcount-(myPanel.x-myPanel.mapcount);
			}
			myPanel.repaint();
			System.out.printf("dice = %d \n",x);
			//repaint();
		}
		if(e.getSource()==map) {   
			if(myPanel.N!="map") {
				myPanel.N="map";
			}else {
				myPanel.N="img";
			}
			repaint();
		}
		if(e.getSource()==play) {
			h=!h;
			southPanel.setVisible(h);
		}
		if(e.getSource()==myPanel) {
			myPanel.setVisible(false);
		}
		
	}
	
}
