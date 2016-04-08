/**
 *   File Name: ShapeTest.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 7, 2016
 *
 */

package com.sqa.mz.shapes;

import org.junit.*;

/**
 * ShapeTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Zhestkov, Michael
 * @version 1.0.0
 * @since 1.0
 *
 */
public class ShapeTest {

	@Test
	public void test() {
		IShape[] shapes = { new Circle("C1", "Green"), new Square("S1", "Black") };
		for (IShape shape : shapes) {
			System.out.println(shape.toString());
		}
	}

}
