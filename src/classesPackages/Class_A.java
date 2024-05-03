package classesPackages;

public class Class_A {

	int classApropertiesID;
	String classAName;
	
	
	public  static void main(String[]args) {
		
		System.out.println("I am from class A");
		AllProperties allpropObject = new AllProperties();
		allpropObject.genericDisplay();
		
	}
	
	public void genericDisplay() {
		
		AllProperties allpropObject = new AllProperties();
		allpropObject.genericDisplay();	
		
	}
}
