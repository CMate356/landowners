package landowners;

public class Rectangle implements LandContract {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}
}
