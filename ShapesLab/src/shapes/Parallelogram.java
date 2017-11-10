package shapes;

public class Parallelogram implements Shape{
	private int base;
	private double smllangle;
	private int height;
	private double pi = 3.14;
	public Parallelogram(int base, int smlldegrees, int height)
	{
		this.base = base;
		this.smllangle = smlldegrees * pi / 180;
		this.height = height;
	}
	public double calculateArea()
	{
		return base * height ;
	}
	public double calculatePerimeter()
	{
		return 2 * base + 2 * height / Math.sin(smllangle);
	}
	public String toString()
	{
		return "Base of paralellogram: " + base + " Height of paralellogram: " + height + " Measure of small angle in degrees: " + smllangle + " Area: " + calculateArea() + " Perimeter: " + calculatePerimeter();
	}
}
