package w7;

import java.awt.Frame;

public class ShapeTest {

	public static void main(String[] args) {
		DrawFram app = new DrawFram("draw");
		//app.setSize(900, 600);
		app.setExtendedState(Frame.MAXIMIZED_BOTH);
		app.setVisible(true);
	}

}
