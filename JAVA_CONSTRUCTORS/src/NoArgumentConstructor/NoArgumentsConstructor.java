package NoArgumentConstructor;

class NoArgumentsConstructor {

	int age;
	
	// No-Argument Constructor
	
	public NoArgumentsConstructor() {
		
		age = 18;
	}
	
	void display() {
		System.out.println("the age of boy is: " +age);
	}
	
	public static void main(String[] args) {
		NoArgumentsConstructor obj =  new NoArgumentsConstructor();
		obj.display();
	}
}
