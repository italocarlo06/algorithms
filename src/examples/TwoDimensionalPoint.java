package examples;

public class TwoDimensionalPoint {
	private double x, y;
	
	public TwoDimensionalPoint(double x, double y) {
		setXCoordinate(x);
		setYCoordinate(y);
	}
	public double getXCoordinate() { 
		return this.x; 
	}
	public double getYCoordinate() { 
		return this.y; 
	}
	public void setXCoordinate(double x) { 
		this.x = x; 
	}
	public void setYCoordinate(double y) { 
		this.y = y; 
	}
	public String toString() {
		return "I am a 2 dimensional point.\n" +
				"My x coordinate is: " + getXCoordinate() + "\n" +
				"My y coordinate is: " + getYCoordinate();
	}
}

