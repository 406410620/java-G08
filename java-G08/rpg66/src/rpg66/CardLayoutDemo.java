package rpg66;
/*import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class TESTswing extends JPanel implements ActionListener{
 
 JPanel p1 = new JPanel();
 JPanel p2 = new JPanel();
 JPanel p3 = new JPanel();
 JButton btn1 = new JButton("Button1");
 JButton btn2 = new JButton("Button2");
 public TESTswing()
 {
  p1.add(btn1);
  p1.add(btn2);
  p2.add(new JLabel("I¡¦m is p2"));
  p3.add(new JLabel("I¡¦m is p3"));
  
  p2.setBackground(Color.BLACK);
  p2.setVisible(false);
  p3.setVisible(false);
  this.add(p1);
  this.add(p2);
  this.add(p3);
  btn1.addActionListener(this);
  btn2.addActionListener(this);
 }
 public static void main(String[] args) {
  
  JFrame frame = new JFrame();
  frame.setSize(200, 200);
  
  Container contentPane = frame.getContentPane();
     contentPane.add(new TESTswing());
     frame.show();
 }
 public void actionPerformed(ActionEvent e) {
  // TODO Auto-generated method stub
  String cmd = e.getActionCommand();
  
  if (cmd.equals("Button1"))
  {
   
   p2.setVisible(true);
   p3.setVisible(false);
   
  }
  else
  { 
   p2.setVisible(false);
   p3.setVisible(true);
  }
  
 }
}*/


import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JPanel;
 
public class CardLayoutDemo implements ActionListener {
    Frame frame;
    Panel p1, p2;
    CardLayout card;
    Button next, previous, first, last, show;    
    private JButton play;
    public static void main(String[] args) {
        new CardLayoutDemo();
    }
     
    public CardLayoutDemo() {
        Frame frame = new Frame("AWTDemo");
        frame.addWindowListener(new AdapterDemo());
        frame.setSize(400, 200);
         
        p1 = new Panel();
        card = new CardLayout();
        JPanel p3 = new JPanel();
        Panel p4 = new Panel();
        p3.setPreferredSize(new Dimension(160, 300));  
        p1.setLayout(card);
        p1.add(p3, "one");
        p3.setBackground(Color.BLUE);
        
		play = new JButton("play");
		p3.add(play);
		play.addActionListener(this);
        p1.add(play);
        p1.add(new Label("two"), "two");//2->home
        p1.add(new Label("three"), "nnn");//nnn«ü©w¦WºÙ
        p1.add(new Label("four"), "four");
        p1.add(new Label("five"), "five");
        
        p2 = new Panel();
        p2.setLayout(new FlowLayout());
        p2.setBackground(Color.BLACK);
        next = new Button("NEXT");
        next.setActionCommand("next");
        next.addActionListener(this);
        previous = new Button("PREVIOUS");
        previous.setActionCommand("previous");
        previous.addActionListener(this);
        first = new Button("FIRST");
        first.setActionCommand("first");
        first.addActionListener(this);
        last = new Button("LAST");
        last.setActionCommand("last");
        last.addActionListener(this);
        show = new Button("SHOW");
        show.setActionCommand("show");
        show.addActionListener(this);
        p2.add(next);
        p2.add(previous);
        p2.add(first);
        p2.add(last);
        p2.add(show);
        
        frame.add(p1, BorderLayout.CENTER);
        frame.add(p2, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
     
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd == "next") {
            card.next(p1);
        }
        if (cmd == "previous") {
            card.previous(p1);
        }
        if (cmd == "first") {
        	p1.setBackground(Color.green);
            card.first(p1);
        }
        if (cmd == "last") {
            card.last(p1);
        }
        if (cmd == "show") {
            card.show(p1, "nnn");
        }
    }
}
 
class AdapterDemo extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
 
