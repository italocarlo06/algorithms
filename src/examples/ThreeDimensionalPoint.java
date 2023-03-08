package examples;

public class ThreeDimensionalPoint extends TwoDimensionalPoint {
	private double z;
	
	public ThreeDimensionalPoint(double x, double y, double z) {
		super(x, y);
		setZCoordinate(z);
	}
	public double getZCoordinate() { 
		return this.z; 
	}
	public void setZCoordinate(double z) { 
		this.z = z; 
	}
	public String toString() {
		return "I am a 3 dimensional point.\n" +
				"My x coordinate is: " + getXCoordinate() + "\n" +
				"My y coordinate is: " + getYCoordinate() + "\n" +
				"My z coordinate is: " + getZCoordinate();
	}
}