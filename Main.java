import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//create an ArrayList of type Student and add students with constructor
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(15, "John", "Westlake"));
		al.add(new Student(32, "Michelle", "Cleveland"));
		al.add(new Student(12, "Jennifer", "Denver"));
		al.add(new Student(14, "Grace", "Easton"));
		al.add(new Student(5, "Alex", "Boston"));
		al.add(new Student(6, "Eric", "Memphis"));
		al.add(new Student(7, "Penny", "Colorado Springs"));
		al.add(new Student(28, "Tim", "Minneapolis"));
		al.add(new Student(39, "Tiffany", "Westlake"));
		al.add(new Student(10, "John", "San Diego"));
		
		try {
			//print unsorted list of students
			System.out.println("This list is not sorted:");
			for (int i = 0; i < al.size(); i++) {
				System.out.println(al.get(i));
			}
			System.out.println("");
			
			//call the nameSort algorithm then print the sorted list
			System.out.println("This list is sorted by Name:");
			SortByName.nameSort(al);
			for (int i = 0; i < al.size(); i++) {
				System.out.println(al.get(i));
			}
			System.out.println("");
			
			//call the RollNumSort algorithm then print the sorted list
			System.out.println("This list is sorted by Rollno:");
			SortByRollno.RollNumSort(al);
			for (int i = 0; i < al.size(); i++) {
				System.out.println(al.get(i));
			}
			System.out.println("");

			//call the custom selectionSort algorithm then print the sorted list
			System.out.println("This list is sorted by City:");
			CustomSelectionSort.selectionSort(al);
			for (int i = 0; i < al.size(); i++) {
				System.out.println(al.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
