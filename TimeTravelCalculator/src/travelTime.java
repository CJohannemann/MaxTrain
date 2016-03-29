import java.util.Scanner;

public class travelTime {

	public static void main(String[] args) {
		System.out.println("Welcome to the travel time calculator");
		System.out.println();
		
		double miles = 0;
		double mph = 0;

	
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")){
			System.out.print("Enter miles driven: ");
			miles = sc.nextDouble();
			sc.nextLine();
			System.out.print("Enter speed driven: ");
			mph = sc.nextDouble();
			sc.nextLine();
		
		int hoursDriven =(int) (miles/mph);
		
		int minutesDriven=(int) (((miles%mph) / mph)*60.0);
//			minutesDriven=(int) (minutesDriven*1.0/(mph*1.0));
//			minutesDriven=(int) (minutesDriven * 60);
		
		
		String message =
				"Enter miles driven: " + miles+"\n"+
				"Enter miles per hour: " + mph+"\n"+
				"Estimated travel time: hour(s) = " + hoursDriven+"\n"+
				"Minute(s) = " + minutesDriven;
		
		System.out.println(message);
		System.out.println("Continue? (y/n): ");
		choice = sc.nextLine();
				System.out.println();
		}	

	}

}
