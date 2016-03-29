import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {


		KlingOnCalculator theCalculator = new KlingOnCalculator();

		System.out.println("get 2 numbers and add memory");
		theCalculator.memoryAdd(getNumberFromConsole());
		System.out.println(theCalculator.recall());
		
		theCalculator.memoryAdd(getNumberFromConsole());
		System.out.println(theCalculator.recall());

		System.out.println(theCalculator.getPI());
		System.out.println(theCalculator.getENumber());
		System.out.println(theCalculator.PrintKresult());
		
		System.out.println(theCalculator);
	}
	

	private static int getNumberFromConsole(){
		int consoleInteger1 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number: ");
		consoleInteger1 = Integer.parseInt(sc.nextLine());
		return consoleInteger1;
	}
	
	private static int getNumberFromConsole2(){
		int consoleInteger2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter second number: ");
		consoleInteger2 = Integer.parseInt(sc.nextLine());
		return consoleInteger2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
