import java.util.Scanner;


public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//set the data for each one and print it out.
		Scanner sc = new Scanner(System.in);

		System.out.println("what type of shape (r,c,t) ");
		String choice =sc.nextLine();

		if (choice.equalsIgnoreCase("r"))
		{
			System.out.println("enter side ");
			double firstSide = Double.parseDouble(sc.nextLine());

			System.out.println("enter second side ");
			double secondSide = Double.parseDouble(sc.nextLine());
			Rectangle myRectangle = new Rectangle();
			myRectangle.setSide(firstSide);
			myRectangle.setSecondSide(secondSide);
			printoutResults(myRectangle);
		}
		if (choice.equalsIgnoreCase("c"))
		{
			System.out.println("enter side ");
			double firstSide = Double.parseDouble(sc.nextLine());
			Circle myCircle = new Circle();
			myCircle.setSide(firstSide);
			printoutResults(myCircle);
		}
		if (choice.equalsIgnoreCase("t"))
		{
			System.out.println("enter side ");
			double firstSide = Double.parseDouble(sc.nextLine());

			System.out.println("enter second side ");
			double secondSide = Double.parseDouble(sc.nextLine());
			
			System.out.println("enter third side ");
			double thirdSide = Double.parseDouble(sc.nextLine());
			Triangle myTriangle = new Triangle();
			myTriangle.setSide(firstSide);
			myTriangle.setSecondSide(secondSide);
			myTriangle.setThirdSide(thirdSide);
			printoutResults(myTriangle);
		}
	}

	public static void printoutResults(Shape theShape){
		theShape.calculateStuff();
		System.out.println("area "+theShape.getArea());
		System.out.println("perimiter "+theShape.getPerimeter());
	}
	
}
