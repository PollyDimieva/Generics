package algorithm_efficiency;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MazeControl extends JPanel{

	private MazePanel mazePanel = new MazePanel();
	private JButton findPath = new JButton("Find path");
	private JButton clearPath = new JButton("Reset");
	
	public MazeControl() {
		setLayout(new BorderLayout());
		add(mazePanel, BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(findPath);
		buttonPanel.add(clearPath);
		
		add(buttonPanel, BorderLayout.SOUTH);
		
		 findPath.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		mazePanel.findPath();
		        }  
		    }); 
		 
		 clearPath.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		    		mazePanel.clearPath();
		        }  
		    }); 
		
		
	}
	

}
