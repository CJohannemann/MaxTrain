import java.util.Scanner;

public class RomanNumeralCalc{
	
	public static void main(String[] args){
		
		
		int choice = 0;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		choice = userInput.nextInt();
		userInput.nextLine();
		
		//Constructor
		RomanNumeral romanObject = new RomanNumeral();
		 
		//String to hold, to return back to program
		String convertedNumber = "";
		
		convertedNumber=romanObject.convertNumberToLetter(choice);
		
		System.out.println(convertedNumber);
		
		
	}	
}