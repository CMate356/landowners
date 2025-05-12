package landowners;

public class Triangle implements LandContract {
	private double b, h;

	public Triangle(double b, double h) {
		this.b = b;
		this.h = h;
	}

	@Override
	public double getArea() {
		return b * h / 2;
	}

}
