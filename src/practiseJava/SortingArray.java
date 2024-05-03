package practiseJava;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		
		String givenArray[] = {"orange","banana","pear","apple","asdf"};
		
		for(int i =0; i<=4; i++) {
			
			Arrays.sort(givenArray);
			System.out.println(givenArray[i]);
		}
	}

}
