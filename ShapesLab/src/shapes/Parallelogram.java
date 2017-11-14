package shapes;

public class Parallelogram implements Shape{
	private int base;
	private double smllradians;
	private int height;
	private double pi = Math.PI;
	public Parallelogram(int base, int smlldegrees, int height)
	{
		this.base = base;
		this.smllradians = smlldegrees * pi / 180;
		this.height = height;
	}
	public double calculateArea()
	{
		return base * height ;
	}
	public double calculatePerimeter()
	{
		return 2 * base + 2 * height / Math.sin(smllradians);
	}
	public String toString()
	{
		return "Base of paralellogram: " + base + " Height of paralellogram: " + height + " Measure of small angle in radians: " + smllradians + " Area: " + calculateArea() + " Perimeter: " + calculatePerimeter();
	}
}
