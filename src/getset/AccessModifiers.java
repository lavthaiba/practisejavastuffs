package getset;


class ParticipantInfo {
	
	private int propertiesId;
	private String propertiesName;
	
	
	public void setID(int id) {
		
		propertiesId=id;
	}
	
	public void setpropertiesName(String name) {
		
		propertiesName =name;
	}
	
	public int getID() {
		
		return propertiesId;
	}
	
	public String getName() {
		
		return propertiesName;
	}
	
}



public class AccessModifiers {
	
	public static void main(String[] args) {
		
		ParticipantInfo bishesh = new ParticipantInfo();
		bishesh.setID(50);
		bishesh.setpropertiesName("Bisesh");
		System.out.println("Properties id is "+ bishesh.getID());
		System.out.println("Properties name is : "+ bishesh.getName());
		
		
		ParticipantInfo prasidhha = new ParticipantInfo();
		prasidhha.setID(55);
		prasidhha.setpropertiesName("Bisesh");
		System.out.println("Properties id is "+ prasidhha.getID());
		System.out.println("Properties name is : "+ prasidhha.getName());
		
	}
	
	

}


