package classesconcept;

class ChildClass {
	
	private  int parentID;
	private  String parentName;
	
	
	  public void setParentID(int id) {
	  
	  this.parentID=id;
	  
	  }
	  
	  public void setParentName(String name) {
	  
	  this.parentName =name; }
	  
	  public String getParentName() {
	  
	  return parentName; }
	  
	  public int getParentID() {
	  
	  return parentID; } 
	 
}

public class ParentClass {
	
	
	
	
	public static void main(String[] args) {
		
		/*
		 * ChildClass myInfo = new ChildClass(); myInfo.setParentID(90);
		 * myInfo.setParentName("Bibek");
		 * System.out.println("My parent ID is: "+myInfo.getParentID());
		 * System.out.println("My parent Name is: "+myInfo.getParentName());
		 */
		
		ChildClass myRecords = new ChildClass();
		myRecords.setParentID(23);
		myRecords.setParentName("Samir");
		System.out.println("My parent id is :"+myRecords.getParentID());
		System.out.println("My parent name is :"+ myRecords.getParentName());

}

}
