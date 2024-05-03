package practiseJava;

public class SeriesOfDataInAnArray {

	public static void main(String[] args) {
		
		int givenNumber[] = {1,3,5,2,4,6,0,7};
		
		for(int i =0; i<=7; i++) {
			
			if(givenNumber[i] %2 != 0) {
				
				System.out.println("odd numbers are:"+ givenNumber[i]);
			}
		}
		
	
	}

}
