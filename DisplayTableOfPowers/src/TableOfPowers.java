import java.text.NumberFormat;

public class TableOfPowers {
	
	private double figure;
	private double squared;
	private double cube;
	
	
	public TableOfPowers(){
		figure = 0;
		squared = figure * figure;
		cube = figure * figure * figure;
	}
	
	public TableOfPowers(double figure) {
		this.figure = figure;

	}
	public double getFigure() {
        return figure;
    }

    public void setFigure(double figure) {
        this.figure = figure;
    }
    
    public double getSquared() {
        return squared = figure * figure;
    }

    public void setSquared(double squared) {
        this.squared = figure;
    }

    public double getCube() {
    	double cube = figure * figure * figure;
        return cube;
    }
    
    public String getSquaredFormat() {
        NumberFormat number = NumberFormat.getNumberInstance();
        String numberFormatted = number.format(this.getSquared());
        return numberFormatted;        
    }
    
    public String getCubedFormat() {
        NumberFormat number = NumberFormat.getNumberInstance();
        String numberFormatted = number.format(this.getCube());
        return numberFormatted;        
    } 

}
