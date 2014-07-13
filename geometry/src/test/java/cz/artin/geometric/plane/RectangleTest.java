package cz.artin.geometric.plane;

import static org.junit.Assert.*;

import org.junit.Test;

import cz.artin.geometric.GeometrictTest;
import cz.artin.geometric.plane.Rectangle;

public class RectangleTest {
	
	@Test
	public void rectangleHasAEqualBThenIsSquare(){
		Rectangle square = new Rectangle(5, 5);
		Rectangle rectangle = new Rectangle(5, 10);
		assertTrue("Square must have a == b", square.isSquare());
		assertFalse("Rectangle must have a != b", rectangle.isSquare());
	}
	
	@Test
	public void testAreaCalculation(){
		Rectangle rectangle = new Rectangle(5, 10);
		
		assertEquals(50, rectangle.getSuface(), GeometrictTest.STANDARD_DEVIATION);
	}
	
	@Test
	public void testPerimeterCalculation(){
		Rectangle rectangle = new Rectangle(5, 10);
		
		assertEquals(30, rectangle.getCircumference(), GeometrictTest.STANDARD_DEVIATION);
	}

}
