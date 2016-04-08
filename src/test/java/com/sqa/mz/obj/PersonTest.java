/**
 *   File Name: PersonTest.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 6, 2016
 *
 */

package com.sqa.mz.obj;

import org.junit.*;

/**
 * PersonTest //ADDD (description of class)
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
public class PersonTest {

	@Test
	public void test() {
		Person[] people = { new Person(), new Person("1 St", 33, "Cook", "Ben") };

		for (Person person : people) {
			System.out.println(person);
		}

	}
}
