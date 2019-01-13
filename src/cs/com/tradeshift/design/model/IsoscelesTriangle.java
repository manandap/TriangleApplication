package cs.com.tradeshift.design.model;

import cs.com.tradeshift.design.enums.TriangleTypeEnum;
/**
 * 
 * @author Manju
 * Subclass extends the Triangle class
 */
public class IsoscelesTriangle extends Triangle {

	@Override
	public String getTriangle() {
		return TriangleTypeEnum.ISOSCELES.toString();
	}

}
