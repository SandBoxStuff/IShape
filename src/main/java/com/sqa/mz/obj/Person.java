/**
 *   File Name: Person.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 6, 2016
 *
 */

package com.sqa.mz.obj;

/**
 * Create a Person class. Create the variables name, age, address, and jobTitle
 * for the Person class. Create a constructor which assigns default values for
 * the Person class. Override the toString method with more meaningful output
 * (Use option in Menu, Source > Generate toString(). Create the methods
 * doWork(), sleep(), and move() using System.out calls to console.
 *
 */
public class Person {
	String address = "Address";
	int age = 0;
	String jobTitle = "Job";
	String name = "Name";

	public Person() {
		super();
		this.address = "1";
		this.age = 22;
		this.jobTitle = "Cook";
		this.name = "Steve";
	}

	/**
	 * @param address
	 * @param age
	 * @param jobTitle
	 * @param name
	 */
	public Person(String address, int age, String jobTitle, String name) {
		super();
		this.address = address;
		this.age = age;
		this.jobTitle = jobTitle;
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return this.jobTitle;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param jobTitle
	 *            the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [address=");
		builder.append(this.address);
		builder.append(", age=");
		builder.append(this.age);
		builder.append(", jobTitle=");
		builder.append(this.jobTitle);
		builder.append(", name=");
		builder.append(this.name);
		builder.append("]");
		return builder.toString();
	}

}
