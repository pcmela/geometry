package cz.artin.geometric.spatial;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import cz.artin.geometric.plane.Circle;

public class Cylinder extends Circle {

	protected double h;

	public Cylinder(double radius, double h) {
		super(radius);

		this.h = h;
	}

	@Override
	public double getSuface() {
		return 2 * Math.PI * radius * h;
	}

	@Override
	public double getCircumference() {
		return super.getCircumference();
	}

	public double getVolume() {
		return Math.PI * Math.pow(radius, 2) * h;
	}

	@Override
	public String toString() {
		return "Cylinder [h=" + h + ", radius=" + radius + "]";
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(h).append(super.hashCode());
		return builder.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {		
		if(obj instanceof Cylinder){
			if(!super.equals(obj)){
				return false;
			}
			
			Cylinder other = (Cylinder)obj;
			
			EqualsBuilder builder = new EqualsBuilder();
			builder.append(h, other.h);
			
			return builder.isEquals();
		}
		
		return false;
	}
	
	

}
