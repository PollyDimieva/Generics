package generics;

import java.util.Scanner;

public class TestGenericStack {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		GenericStack<String> stack1 = new GenericStack<>();
		System.out.println("Write 5 strings: ");
		for(int i=0;i<5;i++) {
			stack1.push(sc.nextLine());
		}
		for(int i=0;i<5;i++) {
			System.out.println(stack1.pop());
		}
		
//		stack1.push("London");
//		stack1.push("Paris");
//		stack1.push("Berlin");
//		System.out.println(stack1.peek());
//		System.out.println(stack1.pop());
//		System.out.println(stack1.peek());
//		
//		GenericStack<Integer> stack2 = new GenericStack<>();
//		stack2.push(1); // autoboxing 1 to new Integer(1)
//		stack2.push(2);
//		stack2.push(3);
//		System.out.println(stack2.peek());
//		System.out.println(stack2.pop());
//		System.out.println(stack2.peek());
		
	}
	
	
	
	
	
	
}
