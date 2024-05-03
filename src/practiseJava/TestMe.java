package practiseJava;

import java.util.ArrayList;
import java.util.Arrays;


public class TestMe {

	public static void main(String[] args) {

	
		char charactersgroup[] = {'a','p','k','o','u','z','n','i','e'};
		for(int i=0; i<=8; i++) {
			if(charactersgroup[i]=='a' || charactersgroup[i]=='e' || charactersgroup[i]=='i' || charactersgroup[i]=='o' || charactersgroup[i]=='u') {
				
				Arrays.sort(charactersgroup);
				System.out.println("vowels characters are :"+ charactersgroup[i]);
			}
		}
		
	}
}
