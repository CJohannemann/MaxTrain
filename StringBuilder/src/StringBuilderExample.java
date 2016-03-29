
public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Chris Johannemann");
		System.out.println(sb1);

		
		StringBuilder ssn = new StringBuilder("333224444");
		if (ssn.length() == 9){
			ssn.insert(5, '-');
			ssn.insert(3, '-');
		}
		System.out.println(ssn);
	}

}
