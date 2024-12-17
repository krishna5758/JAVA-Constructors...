package Parameterized_Constructors;

class ParameterizedConstructor1 {

	String name;
	int mobileNumber;
	
	// Parameterized Constructor....
	
 ParameterizedConstructor1(String name, int mobileNumber) {
	
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
 
 void display() {
	 System.out.println("Name: " +name+ "Mobile Number: "+mobileNumber);
 }
 
 public static void main(String[] args) {
	
	 ParameterizedConstructor1 paramcons = new ParameterizedConstructor1("Krishna", 844639463);
	 paramcons.display();
}
	
}
