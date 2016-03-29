import java.text.NumberFormat;
import java.util.Scanner;



public class tableofPowersConsoleMain {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes table");
		System.out.println();
		
        Scanner userInput = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.print("Enter an integer: ");
            int stoppingPoint;
            stoppingPoint= Integer.parseInt(userInput.nextLine());
            System.out.println();

            // calculate total
           // TableOfPowers f = new TableOfPowers(stoppingPoint);
                        
            

            // format and display output
            System.out.println("Numbers\tSquared\tCubed\t");
            System.out.println("=======\t=======\t=======\t");

            
            String outputString ="";
            for (int x = 1; x <=stoppingPoint ; x++){
            	int valueSquared = x * x;
            	int valueCubed = x * x * x;
            	System.out.println((x)+"\t"+valueSquared+"\t"+valueCubed);
            	//break;
            }
            	
 
            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = userInput.nextLine();
            System.out.println();
        }
        userInput.close();
        System.out.println("Bye!");
		
		
		int figure = 0;
		
		System.out.println("Enter an integer: " + figure);
		System.out.println();
		
		
	}

}
