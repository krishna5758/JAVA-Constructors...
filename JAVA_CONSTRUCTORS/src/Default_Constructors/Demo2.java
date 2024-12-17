package Default_Constructors;

class Demo2 {

	int age;
	String name;
	
	Demo2 () {
		age = 34;
		name = "Shivani";
	}
	
	void display() {
		System.out.println("Age : "+age+ " , Name: "+name);
	}
	
	public static void main(String[] args) {
		
		Demo2 demo = new Demo2();
		demo.display();
	}
}
