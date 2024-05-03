package testclass;

public class Person {
	
	String name;
	String address;
	
	
	public void getName() {
		System.out.println("Name:" +name);
	
	}
	
	
	public void getAddress() {
		System.out.println("Address:"+ address);
	}
	
	
	public static void main(String[] args) {
		
		Person bharat = new Person();
		bharat.name = "Bharat Tamang";
		bharat.address ="Kalanki";
		
		Person bishesh = new Person();
		bishesh.name = "Bishes JI";
		bishesh.address = "Kalimati";
		
		bharat.getAddress();
		bharat.getName();
		
		bishesh.getAddress();
		bishesh.getName();
	}
	

}


