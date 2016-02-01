import static org.junit.Assert.*;

import org.junit.Test;


public class Triangle2Test {

	@Test
	public void testEquilateral() {
		
		assertEquals("EQUIALTERAL Triangle", Triangle2.TriangleType.EQUILATERAL, Triangle2.getTriangleType(10, 10, 10));
	}

	@Test
	public void testIsosceles() {
		
		assertEquals("ISOSCELES Triangle", Triangle2.TriangleType.ISOSCELES, Triangle2.getTriangleType(10, 10, 5));
	}
	
	@Test
	public void testSCALENE() {
		
		assertEquals("SCALENE Triangle", Triangle2.TriangleType.SCALENE, Triangle2.getTriangleType(10, 6, 5));
	}

	@Test (expected = IllegalArgumentException.class)
	public void testIllegalTriangle(){
			Triangle2.getTriangleType(10, 4, 5);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeSideLength(){
			Triangle2.getTriangleType(-1, 4, 5);
	}

}
