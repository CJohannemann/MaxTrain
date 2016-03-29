
public class Rectangle extends Shape{

	double secondSide = 0;
	
	public void calculateStuff(){
		
	}
	public double getSecondSide() {
		return secondSide;
	}

	public void setSecondSide(double secondSide) {
		this.secondSide = secondSide;
	}
	
	public void perimeterRectangle(){
		perimeter = (side * 2) + (secondSide * 2);
	}
	
	public void areaRectangle(){
		area = side * secondSide;
	}


}
	
