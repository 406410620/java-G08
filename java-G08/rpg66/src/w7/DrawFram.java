package w7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawFram extends JFrame implements ActionListener {
	private DrawPanel drawPanel;
	private JButton randgen;
	private JButton rect;
	private JButton oval;
	private JButton vertri;
	private JButton circ;
	private JButton squ;
	
	private JButton clear;
	private JButton undo;
	private JButton redo;
	
	private JPanel shapePanel = new JPanel(new GridBagLayout());
	private JPanel actionPanel;
	private JPanel ButtonPanel;
	
	private JButton colorbtn;
	private JButton colorbtn2;
	private Icon colorIcon;
	private Icon colorIcon2;
	public Color color;
	
	private GridBagConstraints gbc = new GridBagConstraints();
	
	public DrawFram(String abc){
		super(abc);
		drawPanel = new DrawPanel();
		add(drawPanel, BorderLayout.CENTER);
		
		ButtonPanel = new JPanel();
		
		actionPanel = new JPanel();
		
		clear = new JButton("clear");
		actionPanel.add(clear);
		clear.addActionListener(this);
		
		undo = new JButton("undo");
		undo.addActionListener(this);
		actionPanel.add(undo);
		
		redo = new JButton("redo");
		actionPanel.add(redo);
		redo.addActionListener(this);
		
		//shapePanel
		
		randgen = new JButton("Randgen");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		randgen.addActionListener(this);
		shapePanel.add(randgen,gbc);
		
		
		rect = new JButton("Rect");
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		rect.addActionListener(this);
		shapePanel.add(rect,gbc);
		
		
		oval = new JButton("Oval");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		oval.addActionListener(this);
		shapePanel.add(oval,gbc);
		
		
		vertri = new JButton("Vertri");
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		shapePanel.add(vertri,gbc);
		vertri.addActionListener(this);
		
		circ = new JButton("Circle");
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		randgen.addActionListener(this);
		shapePanel.add(circ,gbc);
		
		squ = new JButton("Square");
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		randgen.addActionListener(this);
		shapePanel.add(squ,gbc);
		
		colorIcon = new ImageIcon(getClass().getResource("color.png"));
		
		colorbtn = new JButton("C1", colorIcon);
		/*gbc.gridx = 3;
		gbc.gridy = 0;
		gbc.gridheight = 2;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;*/
		colorbtn.addActionListener(this);
		shapePanel.add(colorbtn);
		
		colorbtn2 = new JButton("C2", colorIcon);
		/*gbc.gridx = 4;
		gbc.gridy = 0;
		gbc.gridheight = 2;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;*/
		colorbtn2.addActionListener(this);
		shapePanel.add(colorbtn2);
		
		//ButtonPanel.add(actionPanel);
		ButtonPanel.add(shapePanel);
		ButtonPanel.add(colorbtn);
		ButtonPanel.add(colorbtn2);
		//add(shapePanel,BorderLayout.SOUTH);
		add(ButtonPanel,BorderLayout.SOUTH);
		add(actionPanel,BorderLayout.NORTH);
	}
	
	
	public void actionPerformed(ActionEvent e){
	    if(e.getSource()==randgen){
	    	drawPanel.randgen(1);
	    }
	    if(e.getSource()==oval){
	    	drawPanel.Oval();
	    }
	    if(e.getSource()==rect){
	    	drawPanel.Rect();
	    	//   drawPanel.addshape(1);
	    }
	    if(e.getSource()==vertri){
	    	drawPanel.Vertri();
	    }
	    if(e.getSource()==colorbtn){
	    	color=JColorChooser.showDialog(this,"Choose a color",color);
	    	colorbtn.setBackground(color);
	    	drawPanel.setcolor(color);
	    }
	    if(e.getSource()==clear){
	    	drawPanel.wipe();
	    	}
	    if(e.getSource()==undo) {
	    	drawPanel.undo();
	    }
	    if(e.getSource()==redo) {
	    	drawPanel.redo();
	    }
	    }
	    
	}

