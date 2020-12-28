package TravisCI;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TriangleTest {
	ArrayList<Triangle> listTriangle = new ArrayList<Triangle>();
	ArrayList<String> expectedTriangleType = new ArrayList<String>();
	ArrayList<Double> expectedPerimeter = new ArrayList<Double>();
	
	@Test
	public void testIsTriangle() {
		System.out.println("Test Type of Triangle");
		//check type of Triangle
		
		//add Test case
		listTriangle.add(new Triangle(new Point[] {new Point(0,0), new Point(1,0), new Point(0,1)}));
		listTriangle.add(new Triangle(new Point[] {new Point(0,0), new Point(1,1), new Point(2,2)}));
		listTriangle.add(new Triangle(new Point[] {new Point(-2,0), new Point(0,5), new Point(2,1)}));
		listTriangle.add(new Triangle(new Point[] {new Point(6,4), new Point(4,6), new Point(4,2)}));
		listTriangle.add(new Triangle(new Point[] {new Point(2,1), new Point(7,1), new Point(4.5, (2 + 5*Math.sqrt(3))/2)}));
		
		//add Expected Type of Triangle
		expectedTriangleType.add("Isosceles");
		expectedTriangleType.add("Is not Triangle");
		expectedTriangleType.add("Scalene");
		expectedTriangleType.add("Isosceles");
		expectedTriangleType.add("Equilateral");
		
		for (int i = 0; i < listTriangle.size(); i++) {
			try {
				assertEquals("Failed at test case: " + i + ".", expectedTriangleType.get(i), listTriangle.get(i).isTriangle());
			} catch (AssertionError e) {
				System.out.println(e.getMessage());
			}
		}
//		fail("Not yet implemented");
	}

	@Test
	public void testTriangleCircumference() {
		System.out.println("Test Perimeter");
		
		//Test data
		listTriangle.add(new Triangle(new Point[] {new Point(0,0), new Point(1,0), new Point(0,1)}));
		listTriangle.add(new Triangle(new Point[] {new Point(0,0), new Point(1,1), new Point(2,2)}));
		listTriangle.add(new Triangle(new Point[] {new Point(-2,0), new Point(0,5), new Point(2,1)}));
		listTriangle.add(new Triangle(new Point[] {new Point(6,4), new Point(4,6), new Point(4,2)}));
		listTriangle.add(new Triangle(new Point[] {new Point(2,1), new Point(7,1), new Point(4.5, (2 + 5*Math.sqrt(3))/2)}));
		
		//expected Perimeter
		expectedPerimeter.add(3.414213562373095);
		expectedPerimeter.add(0.0);
		expectedPerimeter.add(13.980406387751744);
		expectedPerimeter.add(9.65685424949238);
		expectedPerimeter.add(15.0);
		for (int i = 0; i < listTriangle.size(); i++) {
			try {
				assertEquals("Failed at test case: " + i + ".", expectedPerimeter.get(i), listTriangle.get(i).TriangleCircumference(), 0.0);
			} catch (AssertionError e) {
				System.out.println(e.getMessage());
			}
		}
//		fail("Not yet implemented");
	}

}
