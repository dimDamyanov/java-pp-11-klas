package simpleVisual;

import javax.swing.*;

public class MyFrame extends JFrame {
	MyFrame() {
		super("Прозорец с бутон");
		setBounds(250, 250, 300, 200);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		JLabel lbl = new JLabel("Ако кликнете бутона, прозорецът ще се затвори");
		lbl.setBounds(10, 30, 280, 50);
		add(lbl);
		JButton btn = new JButton("Затвори прозореца!");
		btn.setBounds(50, 120, 200, 30);
		MyHandler hnd = new MyHandler();
		btn.addActionListener(hnd);
		add(btn);
		setVisible(true);
	}
}
