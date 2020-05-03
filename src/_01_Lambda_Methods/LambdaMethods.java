package _01_Lambda_Methods;

import java.util.Random;

import javax.swing.SpringLayout.Constraints;

public class LambdaMethods {
	public static void main(String[] args) {
		
		
		 
		 
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		
		printCustomMessage((s) -> {
			
			for (int i = s.length() - 1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
			System.out.println("\n");
		}, "repeat");
		
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			for (int i = 0; i < s.length(); i++) {
				Random random = new Random();
				int r = random.nextInt(100);
				
				if(r > 50) {
					String index = Character.toString(s.charAt(i)).toUpperCase();
					System.out.print(index);
				}
				if(r < 50) {
					String index = Character.toString(s.charAt(i)).toLowerCase();
					System.out.print(index);
				}
			}
			System.out.println("\n");
		}, "repeat");
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s) -> {
			for (int i = 0; i < s.length(); i++) {
				System.out.print(s.charAt(i) + ".");
			}
			System.out.println("\n");
		}, "repeat");
		
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s) -> {
			String[] vowels = {"A", "E", "I", "O", "U"};

			for (int i = 0; i < s.length(); i++) {
				
				String index = Character.toString(s.charAt(i));
				boolean result = contains(vowels, index);
				
				
				if(result == false) {
					System.out.print(s.charAt(i));
				}
				
				
			}
		}, "repeat");
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
	
	static boolean contains(String[] arr, String character) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equalsIgnoreCase(character)) {
				return true;
			}
		}
		return false;
	}
	
	
}
	
