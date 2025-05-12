package landowners;

public class Square implements LandContract {
	private double l;

	public Square(double l) {
		this.l = l;
	}

	@Override
	public double getArea() {
		return l * l;
	}

}
