/*
 * 	• Create a class named Alligator that implements the Countable interface. This class
 *		should include an instance variable that stores the count and a method that returns the
 *		formatted count.
 */
import java.text.NumberFormat;

public abstract class Alligator implements Countable {
	int tempNumber = 0;
	public String getBalanceFormatted(){
		NumberFormat numberCounted = NumberFormat.getInstance();
		String formattedCount = numberCounted.format(tempNumber);
		return formattedCount; 
}
}