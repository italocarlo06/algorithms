package examples;

public class PointsExample {
	public static void main(String[] args) {
		TwoDimensionalPoint two = new TwoDimensionalPoint(1, 2);
		ThreeDimensionalPoint three = new ThreeDimensionalPoint(3, 4, 5);
		System.out.println(two.toString());
		System.out.println(three.toString());
	}
}
