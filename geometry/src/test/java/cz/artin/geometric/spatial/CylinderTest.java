package cz.artin.geometric.spatial;

import static org.junit.Assert.*;

import org.junit.Test;

import cz.artin.geometric.GeometrictTest;
import cz.artin.geometric.spatial.Cylinder;

public class CylinderTest {

	@Test
	public void testSufaceCalculation(){
		Cylinder c = new Cylinder(3, 2);
		
		assertEquals(37.68, c.getSuface(), GeometrictTest.STANDARD_DEVIATION);
	}
	
	@Test 
	public void testCircumferenceCalculation(){
		Cylinder c = new Cylinder(2, 2);
		
		assertEquals(12.56, c.getCircumference(), GeometrictTest.STANDARD_DEVIATION);
	}
	
	@Test
	public void testVolumeCalculation(){
		Cylinder c = new Cylinder(2, 2);
		
		assertEquals(25.12, c.getVolume(), GeometrictTest.STANDARD_DEVIATION);
	}

}
