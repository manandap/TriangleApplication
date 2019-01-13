package cs.com.tradeshift.design.model;

import cs.com.tradeshift.design.enums.TriangleTypeEnum;
/**
 * 
 * @author Manju
 * Subclass extends the Triangle class
 */
public class ScaleneTriangle extends Triangle {

	@Override
	public String getTriangle() {
		return TriangleTypeEnum.SCALENE.toString();
	}
}