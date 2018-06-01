package rpg66;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import w7.DrawPanel;

public class MyFrame extends JFrame implements ActionListener {
	private MyPanel myPanel;
	private MyPanel southPanel = new MyPanel();
	
	private JButton play;
	private JButton dice;
	private JButton map;
	private JButton bag;
	Boolean h = true;
	private GridLayout gb = new GridLayout();
	private CardLayout c = new CardLayout();
	GridBagConstraints g = new GridBagConstraints();
	
	
	public MyFrame(String title) {
		super(title);
		/*
		Player p = new Player();
		p.addrole(0);
		p.addrole(0);
		System.out.println(p.role[0].level);
		System.out.println(p.role[1].level);
		p.role[1].levelup();
		System.out.println(p.role[0].level);
		System.out.println(p.role[1].level);
		*/
		myPanel = new MyPanel();
		southPanel = new MyPanel();
		play = new JButton("play");
		dice = new JButton("dice");
		//myPanel.N="map";
		myPanel.setLayout(c);
		add(myPanel,BorderLayout.CENTER);
		add(southPanel,BorderLayout.SOUTH);
		myPanel.add(play,BorderLayout.CENTER);
		
		
		//myPanel.add(play);
		//myPanel.addimg();
		play.addActionListener(this);
		
		
		southPanel.setBackground(Color.GREEN);
		dice.setPreferredSize(new Dimension(60,40));
		southPanel.add(dice);
		dice.addActionListener(this);
		southPanel.setPreferredSize(new Dimension(0, 50));

		//testPanel.setVisible(false);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==dice) {
			int x;
			Dice dice = new Dice();
			x=dice.toss();
			
			System.out.printf("%d",x);
		}
		
		if(e.getSource()==play) {
			h=!h;
			southPanel.setVisible(h);
		}
		
	}

	
	
}
