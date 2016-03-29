
public class SomeExamples {

	public static void main(String[] args) {

			int a = 0;
			for (;;)
				
			{
				System.out.println("got an "+ a);
				a = a++;
				if (!(a > 10))
					break;
			}
	}
}
