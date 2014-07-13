package cz.artin.geometric.plane;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import cz.artin.geometric.Shape;

public class Circle implements Shape {

	protected double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getSuface() {
		return Math.PI*Math.pow(radius, 2);
	}

	public double getCircumference() {
		return Math.PI*(2*radius);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(radius);
		return builder.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle){
			Circle other = (Circle)obj;
			EqualsBuilder builder = new EqualsBuilder();
			builder.append(radius, other.radius);
			return builder.isEquals();
		}
		
		return false;
	}

}
