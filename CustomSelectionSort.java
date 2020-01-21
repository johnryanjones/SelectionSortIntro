import java.util.ArrayList;

public class CustomSelectionSort {
	
	public static void selectionSort(ArrayList<Student> array) {
		
		//loop through each element comparing the first 3 characters of the City to determine the minimum
		  for (int i = 0; i < array.size()-1; i++) { 
			  int minIndex = i;
		  
			  for (int j = i+1; j < array.size(); j++) {
				  
				  if (array.get(j).getAddress().toString().charAt(0) < array.get(minIndex).getAddress().toString().charAt(0)) {
					  minIndex = j;
					  } else if (array.get(j).getAddress().toString().charAt(0) == array.get(minIndex).getAddress().toString().charAt(0) && 
					  array.get(j).getAddress().toString().charAt(1) < array.get(minIndex).getAddress().toString().charAt(1)) {
					  minIndex = j;
					  } else if (array.get(j).getAddress().toString().charAt(0) == array.get(minIndex).getAddress().toString().charAt(0) && 
						  array.get(j).getAddress().toString().charAt(1) == array.get(minIndex).getAddress().toString().charAt(1) && 
								  array.get(j).getAddress().toString().charAt(2) < array.get(minIndex).getAddress().toString().charAt(2)) {
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
