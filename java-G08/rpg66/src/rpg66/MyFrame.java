package rpg66;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.prism.paint.Color;

import w7.DrawPanel;

public class MyFrame extends JFrame implements ActionListener {
	private MyPanel myPanel;
	JPanel basicPanel = new JPanel();
	private JButton west;
	private JButton east;
	private JButton north;
	private JButton south;
	private JButton center;
	private JButton play;
	private GridLayout g = new GridLayout();
	private CardLayout c = new CardLayout();
	public MyFrame(String title) {
		super(title);
		MyPanel test2 = new MyPanel();
		myPanel = new MyPanel();
		myPanel.setLayout(c);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		MyPanel testPanel = new MyPanel();
		
		test2.setBackground(java.awt.Color.green);
		add(myPanel,BorderLayout.CENTER);
		add(testPanel,BorderLayout.SOUTH);
		
		play = new JButton("play");
		test2.add(play,BorderLayout.CENTER);
		myPanel.add(test2);
		play.addActionListener(this);
		
		east = new JButton("east");
		testPanel.add(east);
		east.addActionListener(this);
		
		
       // myPanel.setVisible(false);
        //testPanel.setVisible(false);
		test2.setVisible(false);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}
