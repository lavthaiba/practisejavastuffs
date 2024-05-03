package practiseJava;

public class CheckPositiveNumberInAnArray {

	public static void main(String[] args) {
		
		int[] number = {1,2,34,-33,-5,0,-23};
		
		for(int i=0; i <= 6; i++) {
			
			if(number[i]>0) {
				System.out.println(number[i]);
			}
		}
	}

}
