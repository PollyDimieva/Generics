package algorithm_efficiency;

import java.util.Scanner;

public class MatchedStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int index = -1;
		int count = 0;
		
		System.out.println("Enter string 1: ");
		String s1 = sc.next();
		System.out.println("Enter string 2: ");
		String s2 = sc.next();
		
		for (int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==s2.charAt(0) && count==0) { //otkude zapochva s2 v s1
				index = i;
				count++;
				
			}else if(s1.charAt(i)==s2.charAt(count)) {  //dali produljava da suvpadat charovete
				count++;                               
				
			}else if(count !=0) {  //kogato se prekusne suvpadenieto
				index = -1;
				count = 0;
				i--;        //proverqva sushtiq element, koito e prekusnal, dali ne e nachalo na s2
			}
		
			if(count == s2.length()) { 
				break;
			}
		}
		
		
			if(count != s2.length()) {
				index = -1; 
				count = 0;
			}
			if(index > -1) {
				System.out.println("Matched at index "+index);
			}else {
				System.out.println("They do not match.");
			}
		}
		
		
		
		
		
		
		
		
		
		
		

//		for (int i = 0; i < s1.length(); i++) {
//			for (int j = 0; j < s2.length(); j++) {
//				if (s1.charAt(i) == s2.charAt(j)) {
//					System.out.print(s1.charAt(i));
//				}
//			}
//		}

	

}
