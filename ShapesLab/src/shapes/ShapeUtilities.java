package shapes;

import java.util.Random;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */

public class ShapeUtilities {

	/**
	 * Creates a random shape from the choices.
	 * 
	 * @return Shape Student Work: Update with your own shape.
	 */
	public static Shape randomShape() {
		Random rand = new Random();
		int x = rand.nextInt(3);

		switch (x) {
		case 0:
			return new Circle(rand.nextInt(100));
		case 1:
			return new Rectangle(rand.nextInt(50), rand.nextInt(50));
		case 2:
			return new Square(rand.nextInt(50));
		default:
			return new Circle(rand.nextInt(100));
		}

	}

	/**
	 * adds up the area of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumArea(Shape[] shapes) {
		// To be written by student
		int i = 0;
		double sum = 0;
		if (shapes.length == 10)
		{
			while (i < shapes.length)
			{
				sum = sum + shapes[i].calculateArea();
				i++;
			}
		}
		else if (shapes.length == 3)
		{
			while (i < shapes.length)
			{
				sum = sum + shapes[i].calculateArea();
				i++;
			}
		}
		return sum;
	}

	/**
	 * adds up the perimeter of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumPerimeter(Shape[] shapes) {
		// To be written by student
		double sum = 0;
		int i = 0;
		if (shapes.length == 10)
		{
			while (i < shapes.length)
			{
				sum = sum + shapes[i].calculatePerimeter();
				i++;
			}
		}
		else if (shapes.length == 3)
		{
			while (i < shapes.length)
			{
				sum = sum + shapes[i].calculatePerimeter();
				i++;
			}
		}
		return sum;
	}
}
