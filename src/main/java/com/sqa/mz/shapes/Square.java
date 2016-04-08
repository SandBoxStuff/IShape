/**
 *   File Name: Square.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 7, 2016
 *
 */

package com.sqa.mz.shapes;

/**
 * Square //ADDD (description of class)
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
public class Square implements IShape {

	private String color;
	private boolean ellipse;
	private String name;
	private int numSides;
	private String type;

	/**
	 *
	 */
	public Square() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param color
	 * @param ellipse
	 * @param name
	 * @param numSides
	 * @param type
	 */
	public Square(String name, String color) {
		super();
		this.color = color;
		this.name = name;
	}

	/**
	 * @see com.sqa.mz.shapes.IShape#calcArea()
	 */
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see com.sqa.mz.shapes.IShape#calcPerimeter()
	 */
	@Override
	public double calcPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the color
	 */
	@Override
	public String getColor() {
		return this.color;
	}

	/**
	 * @return the name
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/**
	 * @return the numSides
	 */
	@Override
	public int getNumSides() {
		return this.numSides;
	}

	/**
	 * @return the type
	 */
	@Override
	public String getType() {
		return this.type;
	}

	/**
	 * @return the ellipse
	 */
	@Override
	public boolean isEllipse() {
		return this.ellipse;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	@Override
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @param ellipse
	 *            the ellipse to set
	 */
	@Override
	public void setEllipse(boolean ellipse) {
		this.ellipse = ellipse;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param numSides
	 *            the numSides to set
	 */
	@Override
	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	@Override
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Square [color=");
		builder.append(this.color);
		builder.append(", ellipse=");
		builder.append(this.ellipse);
		builder.append(", name=");
		builder.append(this.name);
		builder.append(", numSides=");
		builder.append(this.numSides);
		builder.append(", type=");
		builder.append(this.type);
		builder.append("]");
		return builder.toString();
	}

}
