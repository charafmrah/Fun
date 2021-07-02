import java.util.Scanner;

// THIS CODE WILL TURN YOUR PHRASES TO A SARCASTIC TONE

public class Sarcasm {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a lowercase phrase:");
		String input = scn.nextLine();
		
		for (int i = 0; i < input.length(); i++) {
			
			if(i % 2 != 0 ) {
				System.out.print(Character.toUpperCase(input.charAt(i)));
			}
			
			else {
				System.out.print(input.charAt(i));
			}
			
		}
		
	}

}
