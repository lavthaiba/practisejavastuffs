package classesPackages;

public class ChildOfAll extends ClassC{
	
	public static void main(String[] args) {
		
		/*
		 * ChildOfAll objectOfMain = new ChildOfAll(); objectOfMain.MainMethod();
		 */
		
		ChildOfAll objectOfChildAll = new ChildOfAll();
		Class_A objectOfclassA = new Class_A();
		
	}
	
	public void MainMethod() {
		
		AllProperties allObject = new AllProperties();
		allObject.callGenericMethod();
	}

}
