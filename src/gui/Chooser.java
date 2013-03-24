package gui;

import javax.swing.*;

public class Chooser {
	
	public Chooser() {
		
		JFrame okno = new JFrame("Simple Music Player");
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel nowyLabel = new JLabel("this is a test label");
		
		okno.getContentPane().add(nowyLabel);
		okno.setSize(400, 400);
		okno.setVisible(true);
		
	//	JFileChooser jfc = new JFileChooser();
	//	int returnValue = jfc.showOpenDialog(okno);
	}
}
