package w7;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class giftest {
	 public static void main(String[] args) throws MalformedURLException {

	        String n = "r1";
	        int p = 1;
	        Icon icon = new ImageIcon(":..\\..\\..\\img\\dice"+p+".png");//可輸入變數,可為int型
	        JLabel label = new JLabel(icon);

	        JFrame f = new JFrame("Animation");
	        f.getContentPane().add(label);
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.pack();
	        f.setLocationRelativeTo(null);
	        f.setVisible(true);
	    }
}
