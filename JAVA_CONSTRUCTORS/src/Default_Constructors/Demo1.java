package Default_Constructors;

// Default Constructor > 1.It is a constructor with no parameters. 
//                       2. It provides default values to the object properties.
class Demo1 {

	int id;
	String name;
	
	// Default Constructor.....
	Demo1 (){
		
		id = 1;
		name = "Krishna";
	}
	
	void display () {
		
		System.out.println(" ID: "+ id + " ,Name: "+name);
	}
	
	public static void main(String[] args) {
		
		Demo1 demo = new Demo1();
		demo.display();
	}
}
