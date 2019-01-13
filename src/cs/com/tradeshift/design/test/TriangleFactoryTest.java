package cs.com.tradeshift.design.test;

import junit.framework.TestCase;

import org.junit.Test;

import cs.com.tradeshift.design.enums.TriangleTypeEnum;
import cs.com.tradeshift.design.factory.TriangleFactory;
import cs.com.tradeshift.design.model.Triangle;

public class TriangleFactoryTest extends TestCase {

	@Test
	public void testEquiTriangle() throws Exception {
		Triangle triangle = TriangleFactory.checkTriangle(10, 10, 10);
		String result = triangle.getTriangle();
		assertNotNull(result);
		assertEquals("EQUILATERAL", TriangleTypeEnum.EQUILATERAL.toString());
	}

	@Test
	public void testIsoscelesTriangle() throws Exception {
		Triangle triangle = TriangleFactory.checkTriangle(20, 10, 10);
		String result = triangle.getTriangle();
		assertNotNull(result);
		assertEquals("ISOSCELES", TriangleTypeEnum.ISOSCELES.toString());
	}

	@Test
	public void testScaleneTriangle() throws Exception {
		Triangle triangle = TriangleFactory.checkTriangle(10, 20, 30);
		String result = triangle.getTriangle();
		assertNotNull(result);
		assertEquals("SCALENE", TriangleTypeEnum.SCALENE.toString());
	}

	@Test
	public void testInvalidTriangle() {
		try {
			TriangleFactory.checkTriangle(0, 10, 20);
			fail("It is INVALID Input");
		} catch (Exception e) {
			assertEquals("It is INVALID Input", "It is INVALID Input");
		}

	}
}
