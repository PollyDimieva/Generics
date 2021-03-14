package lists_stack_queue;

import java.util.LinkedList;

public class PerformanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList<Integer> list = new LinkedList<>();
      
      for(int i=0; i<5000000;i++) {
    	  list.add(i);
      }
      int a=0;
      for(Integer number : list) {
    	  a=number;
    	  
      }
     System.out.println(a); //2 sec
     
     int b=0;
     for(int i=0; i<5000000;i++) {
   	  b=list.get(i);
   	  
     }
     System.out.println(b);
     
	}

}
