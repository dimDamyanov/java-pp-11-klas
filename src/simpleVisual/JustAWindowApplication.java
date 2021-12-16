package simpleVisual;

import javax.swing.JFrame;
import javax.swing.JTextPane;

public class JustAWindowApplication {
	public static void main(String[] args) {
		JFrame wnd = new JFrame("Обикновен прозорец");
		wnd.setSize(300, 200);
		wnd.setLocation(250, 250);
		wnd.setResizable(false);
		JTextPane tp = new JTextPane();
		tp.setText("Мечка");
		wnd.add(tp);
		wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wnd.setVisible(true);
		
	
	}
}
