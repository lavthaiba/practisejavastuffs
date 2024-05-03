package practiseJava;

import java.util.Arrays;

public class FindVowels {

	public static void main(String[] args) {
		
		
		
		char charactersGroup[] = {'a','p','k','o','u','z','n','i','e'};
		
		for(int i=0; i<=8; i++) {
			
			Arrays.sort(charactersGroup);
			if(charactersGroup[i]=='a' ||charactersGroup[i]=='e' 
					||charactersGroup[i]=='i' ||charactersGroup[i]=='o' 
					||charactersGroup[i]=='u' ) {
				
				System.out.println(charactersGroup[i]);
			}
		}

	}

}
