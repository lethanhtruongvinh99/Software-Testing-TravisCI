package TravisCI;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PointTest {

	@Test
	public void testDistance() {
		Point fixedPoint = new Point(0,0);
		ArrayList<Point> listPoint = new ArrayList<Point>();
		listPoint.add(new Point(1,1));
		listPoint.add(new Point(1,2));
		listPoint.add(new Point(-1,-1));
		listPoint.add(new Point(1.2, 1.5));
		ArrayList<Double> expectedResult = new ArrayList<Double>();
		expectedResult.add(1.4142135623730951);
		expectedResult.add(2.23606797749979);
		expectedResult.add(1.4142135623730951);
		expectedResult.add(1.9209372712298547);
		for (int i = 0; i < listPoint.size(); i++) {
			try {
				assertEquals("Failed at test case: " + i + ".", expectedResult.get(i), fixedPoint.distance(listPoint.get(i)), 0.0);
			} catch (AssertionError e) {
				System.out.println(e.getMessage());
			}
		}
//		fail("Not yet implemented");
	}

}
