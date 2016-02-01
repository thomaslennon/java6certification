import static org.junit.Assert.*;

import org.junit.Test;


public class TriangleTest {

	@Test
	public void testEquilateral() {
		Triangle t = new Triangle(10, 10, 10);
		assertEquals("EQUIALTERAL Triangle", Triangle.TriangleType.EQUILATERAL, t.getType());
	}

	@Test
	public void testIsosceles() {
		Triangle t = new Triangle(10, 10, 5);
		assertEquals("ISOSCELES Triangle", Triangle.TriangleType.ISOSCELES, t.getType());
	}
	
	@Test
	public void testSCALENE() {
		Triangle t = new Triangle(10, 6, 5);
		assertEquals("SCALENE Triangle", Triangle.TriangleType.SCALENE, t.getType());
	}

	@Test (expected = IllegalArgumentException.class)
	public void testIllegalTriangle(){
		Triangle t = new Triangle(10, 4, 5);
			t.getType();

	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeSideLength(){
		Triangle t = new Triangle(-1, 4, 5);
		t.getType();
	}
}