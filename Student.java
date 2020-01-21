
public class Student {
	
	//create private fields for the Student class
	private int rollno;
	private String name;
	private String address;
	
	//constructor to instantiate Student objects
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	//overwrite the toString method to display the Student object information
	public String toString() {
		return "Roll Number: " + this.rollno + ", Name: " + this.name + ", City: " + this.address;
	}
	
	//Accessors for our private variables
	public int getRollno() {
		return this.rollno;
	}
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
}
