package accessmodifiersconcept;

class PersonInfo{
	
	private int rollNumber;
	private String name;
	
	public void setRollNumber(int roll) {
		
		this.rollNumber=roll;
	}
	
	public void setName(String pName) {
		
		this.name = pName;
	}
	
	public int getRollNumber() {
		
		return rollNumber;
	}
	
	public String getName() {
		
		return name;
	}
}

public class RunGetterSetter {

	public static void main(String[]args) {
		
		PersonInfo prasiddha = new PersonInfo();
		prasiddha.setRollNumber(67);
		prasiddha.setName("Prasiddha Karki");
		
		System.out.println("My roll number is :"+ prasiddha.getRollNumber());
		System.out.println("My Name is :"+ prasiddha.getName());
	}
}


