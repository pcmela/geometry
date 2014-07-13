package cz.artin.geometric.plane;


public class Hexagon extends Polygon {

	public Hexagon(double a) {
		super(a);
	}

	public double getSuface() {
		return ((3 * Math.sqrt(3)) / 2) * Math.pow(a, 2);
	}

	public double getCircumference() {
		return 6 * a;
	}

	@Override
	public String toString() {
		return "Hexagon [a=" + a + "]";
	}

	

}
