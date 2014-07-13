package cz.artin.geometric.plane;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import cz.artin.geometric.Shape;

public abstract class Polygon implements Shape {

	protected double a;

	public Polygon(double a) {
		this.a = a;
	}

	public abstract double getSuface();

	public abstract double getCircumference();

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(a);

		return builder.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Hexagon) {
			Hexagon other = (Hexagon) obj;
			EqualsBuilder builder = new EqualsBuilder();
			builder.append(a, other.a);
			return builder.isEquals();
		}

		return false;
	}
}
