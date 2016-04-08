/**
 *   File Name: IShape.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 7, 2016
 *
 */

package com.sqa.mz.shapes;

public interface IShape {

	public double calcArea();

	public double calcPerimeter();

	public String getColor();

	public String getName();

	public int getNumSides();

	public String getType();

	public boolean isEllipse();

	public void setColor(String color);

	public void setEllipse(boolean ellipse);

	public void setName(String name);

	public void setNumSides(int numSides);

	public void setType(String type);

}
