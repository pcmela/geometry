package cz.artin.geometric.plane;

import static org.junit.Assert.*;

import org.junit.Test;

import cz.artin.geometric.GeometrictTest;
import cz.artin.geometric.plane.Hexagon;

public class HexagonTest {
	
	@Test
	public void testAreaCalculation(){
		Hexagon hexagon = new Hexagon(5);
		
		assertEquals(64.95, hexagon.getSuface(), GeometrictTest.STANDARD_DEVIATION);
	}
	
	@Test
	public void testPerimeterCalculation(){
		Hexagon hexagon = new Hexagon(5);
		
		assertEquals(30, hexagon.getCircumference(), GeometrictTest.STANDARD_DEVIATION);
	}

}
