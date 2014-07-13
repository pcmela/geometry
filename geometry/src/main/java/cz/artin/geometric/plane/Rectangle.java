package cz.artin.geometric.plane;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Rectangle extends Polygon {

	protected double b;
	
	public Rectangle(double a, double b) {
		super(a);
		this.b = b;
	}

	public double getSuface() {
		return a*b;
	}

	public double getCircumference() {
		return 2*(a+b);
	}
	
	public boolean isSquare(){
		return a == b;
	}

	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + "]";
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.appendSuper(super.hashCode()).append(b);
		return builder.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle){
			if(!super.equals(obj)){
				return false;
			}
			
			Rectangle other = (Rectangle)obj;
			EqualsBuilder builder = new EqualsBuilder();
			builder.append(this.b, other.b);
			
			return builder.isEquals();
		}
		
		return false;
	}

	

}
