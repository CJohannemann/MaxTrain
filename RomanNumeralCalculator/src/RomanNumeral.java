public class RomanNumeral{
	
	private String theNumeral = "";
	
	//Method
	public String convertNumberToLetter(int choice){
		if (choice == 1) theNumeral = "i";
		if (choice == 2) theNumeral = "ii";
		if (choice == 3) theNumeral = "iii";
		if (choice == 4) theNumeral = "iv";
		if (choice == 5) theNumeral = "v";
		
		return theNumeral;
	}
	
	
}