
public class NewProject {

	public static void main(String[] args) {
		String outputString = "";
		for (int x = 1; x <=100; x++) {
			
			if (x <=10) {
				System.out.println("fizz" +x);
			}
			if (x%5 ==0) {
				System.out.println("buzz" +x);
			}
			if (x%5 ==0 && x%3 ==0){
				System.out.println("fizzbuzz" +x);
			}
			else{
				System.out.println(outputString);
			}

		}
	}
	
	private static void palandrome(int number) {
		int reversed = 0;
		int copy=number;
		while(number !=0)
			{
			reversed = reversed *10 + number %10;
			}
	System.out.println(reversed + " " + copy);
	}
}
