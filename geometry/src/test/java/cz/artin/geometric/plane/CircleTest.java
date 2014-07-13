package cz.artin.geometric.plane;

import static org.junit.Assert.*;

import org.junit.Test;

import cz.artin.geometric.GeometrictTest;
import cz.artin.geometric.plane.Circle;

public class CircleTest {
	
	@Test
	public void testAreaCalculation(){
		Circle c = new Circle(3);
		
		assertEquals(28.26, c.getSuface(), GeometrictTest.STANDARD_DEVIATION);
	}
	
	@Test 
	public void testPerimeterCalculation(){
		Circle c = new Circle(2);
		
		assertEquals(12.56, c.getCircumference(), GeometrictTest.STANDARD_DEVIATION);
	}

}
