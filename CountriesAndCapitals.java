package sets_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class CountriesAndCapitals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int points = 0;
		String[]countries ={"Bulgaria","Romania","Turkey","Serbia","Hungary","Greece","Russia","France","Belgium","Italy"};
		
		for(int i=0;i< countries.length;i++) {
		
			System.out.println("What is the capital of "+ countries[i]+ " ?");
			String capital = sc.next();
//			
//			Map<String, String> linkedHashMap = new LinkedHashMap<String,String>();
//			linkedHashMap.put("Bulgaria", "Sofia");
//			linkedHashMap.put("Romania", "Bucharest");
//			linkedHashMap.put("Turkey", "Ankara");
//			linkedHashMap.put("Serbia", "Belgrade");
//			linkedHashMap.put("Hungary", "Budapest");
//			linkedHashMap.put("Greece", "Athens");
//			linkedHashMap.put("Russia", "Moscow");
//			linkedHashMap.put("France", "Paris");
//			linkedHashMap.put("Belgium", "Brussels");
//			linkedHashMap.put("Italy", "Rome");

			if(isTheCapital(countries[i],capital)==true) {
				points++;
				System.out.println("Your points are "+points);
			}else {
				if(points==0) {
					System.out.println("Your points are "+points);
				}else {
			        points--;
				    System.out.println("Your points are "+points);
				}}	}
			
		}
		//String randomCountry = (countries[new Random().nextInt(countries.length)]);
		//System.out.println("What is the capital of "+ randomCountry + " ?");
		
		
		public static boolean isTheCapital (String country, String capital){
			Map<String, String> linkedHashMap = new LinkedHashMap<String,String>();
			linkedHashMap.put("Bulgaria", "Sofia");
			linkedHashMap.put("Romania", "Bucharest");
			linkedHashMap.put("Turkey", "Ankara");
			linkedHashMap.put("Serbia", "Belgrade");
			linkedHashMap.put("Hungary", "Budapest");
			linkedHashMap.put("Greece", "Athens");
			linkedHashMap.put("Russia", "Moscow");
			linkedHashMap.put("France", "Paris");
			linkedHashMap.put("Belgium", "Brussels");
			linkedHashMap.put("Italy", "Rome");
			
			if(capital.equals(linkedHashMap.get(country))) { //????
				return true;
		}else {
			return false;
		}
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
