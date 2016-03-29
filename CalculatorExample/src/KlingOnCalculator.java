
public class KlingOnCalculator extends ScientificCalculator {
	
		// constructor
		public KlingOnCalculator(){
			System.out.println("Constructing the KC");
		}
	
		public String PrintKresult(){
			return "Kaplonk "+memoryContent;
		}	
		@Override
		public String recall(){
			String parentResult = super.recall();
			return parentResult +  " the Kaplonk contains "+memoryContent;
		}
}	
