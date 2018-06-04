package rpg66;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
  
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
  
public class test extends JFrame implements ActionListener
{
    //private JTextField name = new JTextField("someone");
    //private JTextField text = new JTextField();
    //private JButton button = new JButton("输入");
    public test(String title)
    {
        super(title);
  
      //  name.setBounds(40, 40, 200, 20);
        //button.setBounds(260, 40, 100, 20);
        //text.setBounds(40, 110, 200, 20);
  
        this.setLayout(null);
        //this.setBounds(200, 200, 400, 400);
          
        //this.add(name);
        //this.add(button);
        //this.add(text);
  
  
       // button.addActionListener(this);
          
        this.setVisible(true);
    }
  
    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
}