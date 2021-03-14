package lists_stack_queue;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NumbersShuffleSortReverse {
	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
		LinkedList<Integer> numbers = new LinkedList<>();
		System.out.println("Enter the numbers: ");
		
//		for(int i=0;i<5;i++) {
//			Integer num = sc.nextInt();
//			if(numbers.contains(num)==false) {
//				numbers.add(num);
//			}
//		}
//		System.out.println(numbers);
//		Collections.sort(numbers);
//		System.out.println(numbers);
//		Collections.sort(numbers, Collections.reverseOrder());
//		System.out.println(numbers);
//		Collections.shuffle(numbers);
//		System.out.println(numbers);
		
		JFrame frame = new JFrame();
		frame.setSize(600, 300);
		frame.setTitle("Numbers");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		
		JTextArea txtArea = new JTextArea();
		JTextField txtField = new JTextField();
		txtField.addActionListener(new ActionListener(){

		                public void actionPerformed(ActionEvent e){

		                	Integer num = Integer.parseInt(txtField.getText());
		        			if(numbers.contains(num)==false) {
		        				numbers.add(num);
		        			}
		        			txtField.setText("");
		        			txtArea.setText(numbers.toString());
		        			System.out.println(numbers);
		                }});
		
		panel.add(txtField);
		
		txtArea.setEditable(false);
		panel.add(txtArea);
		
	    
		JButton jbtSort = new JButton("Sort");
		jbtSort.addActionListener(new ActionListener(){   
	    	public void actionPerformed(ActionEvent e){  
	    		Collections.sort(numbers);
	    		txtArea.setText(numbers.toString());
	    	}  
	    }); 
		panel.add(jbtSort);
		
		
		
		
		
		JButton jbtShuffle = new JButton("Shuffle");	
		jbtShuffle.addActionListener(new ActionListener(){   
	    	public void actionPerformed(ActionEvent e){  
	    		Collections.shuffle(numbers);
	    		txtArea.setText(numbers.toString());
	    	}  
	    }); 
		panel.add(jbtShuffle);
		
        JButton jbtReverse = new JButton("Reverse");
        jbtReverse.addActionListener(new ActionListener(){   
        	public void actionPerformed(ActionEvent e){  
        		Collections.sort(numbers, Collections.reverseOrder());
        		txtArea.setText(numbers.toString());
	    	}  
	    }); 
		panel.add(jbtReverse);
      
	    

//		jbtSort.setBounds(200, 270, 110, 40);
//		jbtShuffle.setBounds(340, 270, 110, 40);
//		jbtReverse.setBounds(480, 270, 110, 40);
	
	
//		JTextArea textArea = new JTextArea(600,300);
//		JTextArea textArea1 = new JTextArea(600,100);
//	    textArea.setEditable(true);
//	    textArea.setVisible(true);
//	    textArea1.setEditable(true);
//	    textArea1.setVisible(true);
//
//	    JScrollPane scroll = new JScrollPane (textArea);
//	    scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//	    scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//         
//	    frame.getContentPane().add(textArea1);
//	    frame.getContentPane().add(scroll);
//		
		
		frame.setVisible(true);
}
	
}
