package generics;

import java.util.Scanner;

public class TestGenericStack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		GenericStack2<String> stack1 = new GenericStack2<>();
		
		System.out.println("Write 5 strings: ");
		for(int i=0;i<5;i++) {
			stack1.push(sc.nextLine());
		}
		while(stack1.isEmpty()==false) {
		
			System.out.println(stack1.pop());
		}
	}
	

}
