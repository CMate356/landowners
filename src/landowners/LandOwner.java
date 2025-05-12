package landowners;

import java.util.Vector;

public class LandOwner {
	private Vector<LandContract> landPlots;

	public LandOwner() {
		this.landPlots = new Vector<>();
	}
	public boolean add(LandContract e) {
		return landPlots.add(e);
	}

	public void removeLand(int index) {
		if (index >= 0 && index < landPlots.size())
			landPlots.remove(index);
	}

	public double getTotalArea() {
		double s = 0;
		for (LandContract plot : landPlots) {
			s = s + plot.getArea();
		}
		return s;
	}
}