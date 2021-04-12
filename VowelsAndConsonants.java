package sets_maps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VowelsAndConsonants{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       File file = new File("src/sets_maps/VowelsAndConsonantsTest.java");
       if(file.exists()) {
    	   System.out.println("The number of vowels is "+ countVowels(file) +" and the number of consonants is "+countConsonants(file));
       } else {
    	   System.out.println("File not found.");
       }

}

	
	public static int countVowels(File file) throws Exception{
		int count = 0;
		//A, E, I, O , U
		
		Character[] vowels = {'A','E','I','O' ,'U','a','e','i','o','u'};
		
		Set<Character> vowelsSet = new HashSet<Character>(Arrays.asList(vowels));
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		int c=0;
		while((c = br.read())!=-1) {
			char character = (char) c;
			if(vowelsSet.contains(character)) {
				count++;
			}
		}
		return count;
		
	}
	
	public static int countConsonants(File file) throws Exception{
		int count = 0;
		
		Character[] consonants = {'B', 'C', 'D', 'F', 'G', 'H','J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R','S', 'T', 'V', 'W', 'X', 'Y','Z',
				'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
		
		Set<Character> consonantsSet = new HashSet<Character>(Arrays.asList(consonants));
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		int c=0;
		while((c = br.read())!=-1) {
			char character = (char) c;
			if(consonantsSet.contains(character)) {
				count++;
			}
		}
		return count;
	}
}
