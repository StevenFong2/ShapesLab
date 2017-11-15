package shapes;

public class Parallelogram implements Shape{
	private int base;
	// smllradians is the measure of the smallest angle in the parallelogram in radians.
	private double smllradians;
	private int height;
	private double pi = Math.PI;
	
	/*
	 * @param base is the measure of the base
	 * @param smlldegrees is the measure of the the smallest angle in degrees
	 * @param height the measure of the height of the parallelogram.
	 */
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
		return (2 * base) + (2 * height / Math.sin(smllradians));
	}
	public String toString()
	{
		return "Base of paralellogram: " + base + " Height of paralellogram: " + height + " Measure of small angle in radians: " + smllradians + " Area: " + calculateArea() + " Perimeter: " + calculatePerimeter();
	}
}
