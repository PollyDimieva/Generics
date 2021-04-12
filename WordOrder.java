package lists_stack_queue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class WordOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> words = new ArrayList<>();
     
     File myObject = new File("words.txt");
      try {
    	  Scanner myReader =new Scanner(myObject);
    	  while(myReader.hasNext()==true) {
    		  String text = myReader.nextLine();
    		  String lineWords[]= text.split("[\\s.,]+");   //Stringa se razdelq na negovite speisove, zapetaiki ili tochki
    		                                                //razdelq dumite i gi slaga v masiv
    		  words.addAll(Arrays.asList(lineWords));       //prevrushtam gi ot masiv v arraylist
    		//  System.out.println(text);
    	  }
      }catch(FileNotFoundException e) {
    	  try {
    		  myObject.createNewFile();
    	  }catch(IOException e1) {
    		  e1.printStackTrace();
    	  }
      }
     
     Collections.sort(words);
     System.out.println(words);
	}

}
