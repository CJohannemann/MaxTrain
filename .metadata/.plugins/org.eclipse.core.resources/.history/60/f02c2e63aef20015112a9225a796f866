package ui;

import java.util.Scanner;
import group.business.Method;
import group.business.Builder;

/*
 * 
 */

public class MusicApp {

	static String menuOne = "";
	static int category = 0;
	static String menuTwo = "";
	static int type = 0;
	static String key = "";
	static int keyNumber = 0;

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		//Print category menu and get user's choice
		menuOne = 
			"1 - Make a scale" + "\n" + 
			"2 - Make a chord" + "\n" + 
			"3 - Make a visual" + "\n" +
			"What do you want to do: " ;
		category = printMenuGetResponse(inputScanner, menuOne, 3);
		
		//Print type menu and get user's choice
		if (category == 1) {
			menuTwo = "\n" +
				"1 - Chromatic" + "\n" +
				"2 - Major" + "\n" + 
				"3 - Minor" + "\n" + 
				"4 - Blues" + "\n" + 
				"5 - Dorian" + "\n" +
				"What kind of scale do you want to make: ";
			type = printMenuGetResponse(inputScanner, menuTwo, 5);
		} else if (category == 2) {
			menuTwo = "\n" +
				"1 - Major triad" + "\n" + 
				"2 - Minor triad" + "\n" + 
				"3 - Major 7th" + "\n" + 
				"4 - Minor 7th" + "\n" +
				"What kind of chord do you want to make: ";
			type = printMenuGetResponse(inputScanner, menuTwo, 4);
		} else if (category == 3) {
			menuTwo = "\n" +
				"1 - Print one note on treble clef" + "\n" + 
				"2 - Print one note on bass clef" + "\n" + 
				"3 - Print sequence of notes on treble clef" + "\n" +
				"4 - Print sequence of notes on bass clef" + "\n" +
				"5 - Print chord on treble clef" + "\n" +
				"6 - Print chord on on bass clef" + "\n" +
				"7 - Print chords in a differen inversion" + "\n" +
				"What kind of visual do you want to make: ";
			type = printMenuGetResponse(inputScanner, menuTwo, 4);
		}
		
		//ask user for the key, convert key to a number, and 
		
			setKey(inputScanner);
		
		
		//output a scale, chord or visual
		if (category == 1) {
			String newScale = Builder.buildScale(keyNumber, type);
			System.out.println(newScale);
		} else if (category == 2) {
			String newChord = Builder.buildChord(keyNumber, type);
			System.out.println(newChord);
		} else {
			System.out.println("Placeholder");
		}
		
	
	}

	public static int printMenuGetResponse(Scanner inputScanner, String menu, int maxChoices) {
		
		while (true) {
			System.out.print(menu);
			try {
				int userChoice = Integer.parseInt(inputScanner.nextLine());
				if (userChoice < 1 || userChoice > maxChoices) {
					System.out.println("Please enter a number 1-4. Try again.");
					continue;
				} else {
					return userChoice;
				}
			} catch (NumberFormatException e) {
				System.out.println("Please enter a number 1-4. Try again.\n");
				continue;
			}
		}
	}
	
	public static void setKey(Scanner inputScanner) {
		while (true) {
			System.out.print("\nWhich key: ");
			key = inputScanner.nextLine();
			keyNumber = Method.noteToNumber(key);
			if (keyNumber == 0) {
				System.out.println("Please enter a real note.");
				continue;
			}
			break;
		}
	}
	
	public static int setKeyVisual(Scanner inputScanner) {
		
		
		while (true) {
			System.out.println("\n");
		}
	}
	
}

//blues scale could be pantatonic or pantatonic major
//dorian scale could be ascending or descending
