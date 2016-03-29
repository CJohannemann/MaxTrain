
public class ScientificCalculator extends Calculator {
	
	public ScientificCalculator(){
		System.out.println("Constructing the SC");
	}

	public String getENumber(){
		return "E is some big number 1.2573885775776";
		
	}
	public String getPI(){
		return "Pi is 3.1498823993484238";
	}
	public String getDisplay(){
		return "the display reads "+memoryContent;
	}
	
}	
