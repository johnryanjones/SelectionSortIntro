import java.util.ArrayList;

public class SortByName {
	
	public static void nameSort(ArrayList<Student> array) {
		
		//loop through the elements comparing the first character of each name to determine the minimum
		  for (int i = 0; i < array.size()-1; i++) { 
			  int minIndex = i;
			  
			  for (int j = i+1; j < array.size(); j++) {
			  
				  if (array.get(j).getName().toString().charAt(0) < array.get(minIndex).getName().toString().charAt(0)) {
					  minIndex = j;
				  }
			  }
		//if the new minimum is found then swap the elements
		  Student tmp = array.get(minIndex);
		  array.set(minIndex, array.get(i));
		  array.set(i, tmp);
		}
	}

}
