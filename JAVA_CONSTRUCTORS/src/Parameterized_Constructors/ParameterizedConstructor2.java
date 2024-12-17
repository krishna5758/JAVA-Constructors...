package Parameterized_Constructors;

class ParameterizedConstructor2 {

	String name;
	String address;
	int pinCode;
	int id;
	
	ParameterizedConstructor2(int id,String name, String address, int pinCode) {
		this.name = name;
		this.address = address;
		this.pinCode = pinCode;
		this.id = id;
	}
	
	void display() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("PinCode: "+pinCode);
	}
	
	public static void main(String[] args) {
		
		ParameterizedConstructor2 paramcons2 = new ParameterizedConstructor2(1, "Krishna Kulkarni", "Shree Swami samarth niwas", 431131);
		paramcons2.display();
	}
}
