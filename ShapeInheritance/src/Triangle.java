
public class Triangle extends Shape{
	double secondSide = 0;
	double thirdSide = 0;
	
	public Triangle(){
		System.out.println("Constructing the Triangle");
	}
	//Area
	public void areaOfTriangle(int side, int secondSide){
		area = (side * secondSide) / 2;
	}
	//Perimeter
	public void perimeterOfTriangle(int side, int secondSide, int thirdSide){
		perimeter = (side + secondSide + thirdSide);
	}

	public String recall(){
		return  "the area of the triangle is ";
	}
}
