package generics;

import java.util.ArrayList;

public class GenericSort2  {
	public static void main(String[] args) {
	
		

		Integer[] intArray = { new Integer(2), new Integer(4), new Integer(3) };

		Double[] doubleArray = { new Double(3.4), new Double(1.3), new Double(-22.1) };

		Character[] charArray = { new Character('a'), new Character('J'), new Character('r') };

		String[] stringArray = { "Tom", "Susan", "Kim" };

		sort(intArray);
		sort(doubleArray);
		sort(charArray);
		sort(stringArray);

		System.out.print("Sorted Integer objects: ");
		printList(intArray);
		System.out.print("Sorted Double objects: ");
		printList(doubleArray);
		System.out.print("Sorted Character objects: ");
		printList(charArray);
		System.out.print("Sorted String objects: ");
		printList(stringArray);
		
		GeometricObject [] geometricObj = {new Circle(4), new Rectangle(5,7), new Rectangle(4,3)};
		sort(geometricObj);
		printList(geometricObj);
	}

	/** Sort an array of comparable objects */
	public static <E extends Comparable<E>> void sort(E[] list) {
		E currentMin; 
		int currentMinIndex;

		for (int i = 0; i < list.length - 1; i++) {

			currentMin = list[i];
			currentMinIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin.compareTo(list[j]) > 0) { 
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}

	/** Print an array of objects */
	public static void printList(Object[] list) {
		for (int i = 0; i < list.length; i++)
			System.out.println(list[i] + " ");
		System.out.println();
	}
	public static <E> void shuffle(ArrayList<E> list) {
		for(int i=0;i<list.size();i++) {
			int range = list.size();
			int randomIndex=(int)(Math.random() * range);
			E temp = list.get(i);
			list.set(i, list.get(randomIndex));
			list.set(randomIndex, temp);
		}
	}
	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		E currentMin; 
           int currentMinIndex;

           for (int i = 0; i < list.size() - 1; i++) {
         
           currentMin = list.get(i);
           currentMinIndex = i;
           for (int j = i + 1; j < list.size(); j++) {
	         if (currentMin.compareTo(list.get(j)) > 0) { 
		        currentMin = list.get(j);
		        currentMinIndex = j;
	}
}

      
            if (currentMinIndex != i) {
	             list.set(currentMinIndex,list.get(i));
	             list.set(i,currentMin);
}
}
	}
	public static <E extends Comparable<E>> E min(ArrayList<E> list) {
		E currentMin = list.get(0); 
         
           for (int i = 0; i < list.size() - 1; i++) {
           currentMin = list.get(i);
          
	         if (currentMin.compareTo(list.get(i)) > 0) { 
		        currentMin = list.get(i);
		        
	       } 
        }
		return currentMin;
	}
}

	

	


