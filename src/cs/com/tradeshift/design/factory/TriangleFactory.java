package cs.com.tradeshift.design.factory;

import org.apache.log4j.Logger;

import cs.com.tradeshift.design.enums.TriangleTypeEnum;
import cs.com.tradeshift.design.model.EquilateralTriangle;
import cs.com.tradeshift.design.model.IsoscelesTriangle;
import cs.com.tradeshift.design.model.ScaleneTriangle;
import cs.com.tradeshift.design.model.Triangle;

/**
 * 
 * @author Manju Factory class
 */
public class TriangleFactory {
	static Logger log = Logger.getLogger(TriangleFactory.class);

	/**
	 * Check the type of the triangle with three sides of input parameter
	 * 
	 * @param side1
	 * @param side
	 * @param side3
	 * @return String value
	 * @throws Exception
	 */
	public static Triangle checkTriangle(int side1, int side2, int side3)
			throws Exception {
		if (side1 <= 0 || side2 <= 0 || side3 <= 0)
			throw new Exception("It is " + TriangleTypeEnum.INVALID.toString()
					+ " Input");
		if (side1 == side2 && side2 == side3)
			return new EquilateralTriangle();
		else if (side1 == side2 || side2 == side3 || side3 == side1)
			return new IsoscelesTriangle();
		else
			return new ScaleneTriangle();
	}
}
