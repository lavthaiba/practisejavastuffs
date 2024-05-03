package variables;

public class TypesOfVariablesAndMethods {
	
	int instanceVariable=4;
	static int staticVariables=8;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int localVariable=0;
		System.out.println(localVariable);
		TypesOfVariablesAndMethods forInstance = new TypesOfVariablesAndMethods();
		System.out.println(forInstance.instanceVariable);
		System.out.println(staticVariables);
		forInstance.nonStaticMethod();
		staticMethod();
		

	}
	
	public void nonStaticMethod() {
		
		
		int localVariable=1;
		System.out.println(localVariable);
		System.out.println(instanceVariable);
		
	}
	
	public static void staticMethod() {
		
		int defaultStaticlocalVariable=0;
		TypesOfVariablesAndMethods forStaticMethod = new TypesOfVariablesAndMethods();
		System.out.println(defaultStaticlocalVariable);
		System.out.println("for statc mthd: "+forStaticMethod.instanceVariable);
		System.out.println("staticVariable is :"+staticVariables);
		
	}

}
