import java.util.Scanner;

public class LoopStmtApp {

		public static void main(String[] args){
			
			System.out.println("starting the program");
			Scanner consoleReader = new Scanner(System.in);
			String choice = "y";
			while (choice.equalsIgnoreCase("y")){
				workInLoop(consoleReader);
				System.out.println("continue? (y/n): ");
				choice = consoleReader.nextLine();
				System.out.println();
				
			}
			consoleReader.close();
			System.out.println("finished");
			
		}
		public static void workInLoop(Scanner reader){
			int readInformation = 0;
			System.out.println("enter a number of bottles of beer: ");
			readInformation = reader.nextInt();
			reader.nextLine();
			System.out.println("you entered " +readInformation);
		}
			//challenge = truncate the readInformation to 1 letter only
//			printDayOfWeek(readInformation);
//			printWeekendOrWeekday(readInformation);}
			
			private static void printWeekendOrWeekday(String readInformation) {
				String lowerReadInformation = readInformation.toLowerCase();
				switch (lowerReadInformation){
				case "m":
					System.out.println("not so happy weekday");
					break;
				case "t":
					System.out.println("not so happy weekday");
					break;
				case "w":
					System.out.println("not so happy weekday");
					break;
				case "r":
					System.out.println("not so happy weekday");
					break;
				case "f":
					System.out.println("not so happy weekday");
					break;
					
				}
/*				if (readInformation.equalsIgnoreCase("m") ||
					readInformation.equalsIgnoreCase("t") ||
					readInformation.equalsIgnoreCase("w") ||
					readInformation.equalsIgnoreCase("r") ||
					readInformation.equalsIgnoreCase("f") ) {
						System.out.println("not so happy weekday");
					
				}else if (readInformation.equalsIgnoreCase("s") ||
					readInformation.equalsIgnoreCase("u")){
						System.out.println("weekend");
					} else{
						System.out.println("not a day");
*/		//			}
			}
			
		public static void printDayOfWeek(String readInformation) {
			switch (readInformation) {
			case "m":
				System.out.println("monday");
				break;
			case "t":
				System.out.println("tuesday");
				break;
			case "w":
				System.out.println("wednesday");
				break;
			case "r":
				System.out.println("thursday");
				break;
			case "f":	
				System.out.println("friday");
				break;
			case "s":
				System.out.println("saturday");
				break;
			case "u":	
				System.out.println("sunday");
				break;
			}
		/*
			if (readInformation.equalsIgnoreCase("m")){
				System.out.println("monday");
			}else if (readInformation.equalsIgnoreCase("t")){
				System.out.println("tuesday");
			}else if (readInformation.equalsIgnoreCase("w")){
				System.out.println("wednesday");
			}else if (readInformation.equalsIgnoreCase("r")){
				System.out.println("thursday");
			}else if (readInformation.equalsIgnoreCase("f")){
				System.out.println("friday");
			}else if (readInformation.equalsIgnoreCase("s")){
				System.out.println("satday");
			}else if (readInformation.equalsIgnoreCase("u")){
				System.out.println("sunday");
			}else{
			System.out.println("not a day");
		}  */
	}
				
}
