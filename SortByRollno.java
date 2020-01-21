import java.util.ArrayList;

public class SortByRollno {

	public static void RollNumSort(ArrayList<Student> array) {
		
		//loop through the array elements comparing the Rollno field to determine the minimum
		  for (int i = 0; i < array.size()-1; i++) { 
			  int minIndex = i;
		  
			  for (int j = i+1; j < array.size(); j++) {
			  
				  if (array.get(j).getRollno() < array.get(minIndex).getRollno()) {
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
