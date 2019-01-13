package cs.com.tradeshift.design.model;

import cs.com.tradeshift.design.enums.TriangleTypeEnum;
/**
 * 
 * @author Manju
 * Subclass extends the Triangle class
 */
public class EquilateralTriangle extends Triangle {

	@Override
	public String getTriangle() {
		return TriangleTypeEnum.EQUILATERAL.toString();
	}

}
