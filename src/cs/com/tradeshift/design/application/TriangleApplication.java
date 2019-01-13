package cs.com.tradeshift.design.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import cs.com.tradeshift.design.enums.TriangleTypeEnum;
import cs.com.tradeshift.design.factory.TriangleFactory;
import cs.com.tradeshift.design.model.Triangle;

/**
 * 
 * @author Manju Determines the type of Triangle
 */
public class TriangleApplication {

	private static Scanner scan;
	static Logger log = Logger.getLogger(TriangleApplication.class);

	public static void main(String[] args) {
		try {
			DOMConfigurator.configure("log4j.xml");
			int side1, side2, side3;
			log.info("Enter the length of a Triangle for 3 sides");
			scan = new Scanner(System.in);
			side1 = scan.nextInt();
			side2 = scan.nextInt();
			side3 = scan.nextInt();
			Triangle triangle = TriangleFactory.checkTriangle(side1, side2,
					side3);
			log.info("Type of Triangle is : " + triangle.getTriangle());

		} catch (InputMismatchException e) {
			log.error("It is " + TriangleTypeEnum.INVALID.toString()
					+ " Input " + e);
			log.error("Enter Integer type values");
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}
}
