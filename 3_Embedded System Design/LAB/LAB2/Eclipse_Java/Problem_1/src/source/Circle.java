package source;

public class Circle extends Shape {
	private double radius;
	private final double PI=3.1415926;
	
	public Circle()
	{
		super();
		radius=1.0;
	}
	
	public Circle(double radius)
	{
		super();
		this.radius=radius;
	}
	public Circle(double radius, String color,boolean filled)
	{
		super(color,filled);
		this.radius=radius;
		
		
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getArea()
	{
		return (PI*radius*radius);
	}
	public double getPerimeter()
	{
		return (2*PI*radius);
	}
	@Override
	public String toString()
    {
    	return "Radius"+radius;
    }
	
}
