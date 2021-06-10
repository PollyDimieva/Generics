package algorithm_efficiency;

import javax.swing.JFrame;

public class MazeApp {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Maze");              
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		frame.setSize(750,500);
		frame.add(new MazeControl());
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	}
}
