package rpg66;

public class Play {

	public static void main(String[] args) throws InterruptedException  {
		MyFrame frame = new MyFrame("sixsix"); 
		frame.setBounds(200,100,20,20);
		frame.setSize(1546, 866);
		//frame.setExtendedState(frame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.gamestart();
	}
}
