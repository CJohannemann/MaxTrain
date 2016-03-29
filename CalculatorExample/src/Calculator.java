
public class Calculator {
	
	
	protected int result = 0;
	int memoryContent = 0;
	public Calculator(){
		System.out.println("Constructing the Calc");
	}
	
	public void divide(int firstNumber, int secondNumber){
		result = firstNumber / secondNumber;
	}
	
	public void memoryAdd(int number){
		memoryContent = memoryContent + number;
	}

	public void memorySub(int number){
		memoryContent = memoryContent - number;
	}
	
	public void memoryClear(){
		memoryContent = 0;
	}
	
	public String recall(){
		return  "the memory contains "+memoryContent;
	}
	
	
	
	// These are methods
	public void add(int firstNumber, int secondNumber){
		result = firstNumber + secondNumber;
	}
	
	public void subtract(int firstNumber, int secondNumber){
		result = firstNumber - secondNumber;
	}
	
	public void multiply(int firstNumber, int secondNumber){
		result = firstNumber * secondNumber;
	}
	
	
	
	public String getDesplay(){
		return "the display reads "+result;
	}
	@Override
	public String toString(){
		System.out.println(super.toString());
		return "I am the calculator";
	}
	
}	
