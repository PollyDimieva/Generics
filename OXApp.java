package algorithm_efficiency;

import javax.swing.JFrame;

public class OXApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Naughts and crosses");              
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		frame.setSize(500,500);
		frame.add(new OXPanel());
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	}

}
