package shapes;

public class Heptagon implements Shape {
	private int side;
	private double pi = Math.PI;
	
	/* 
	 * @param side is the measure of the side of a regular heptagon.
	 */
	public Heptagon (int side)
	{
		this.side = side;
	}
	public double calculateArea()
	{
		return (7 * side * side) / (Math.tan(pi/7) * 4);
	}
	public double calculatePerimeter()
	{
		return 7 * side;
	}
	public String toString()
	{
		return "Heptagon side: " + side + " Area: " + calculateArea() + " Perimeter: " + calculatePerimeter();
	}

}
