package source;

public class Square extends Rectangle{
	public Square ()
	{
		
	}
	public Square(double side)
	{
		super(side,side);
	}
	
	public Square(double side,String color, boolean filled)
	{
		super(side,side,color,filled);
	}
	
	public double getSide()
	{
		return getWidth();
	}
	public void setSide(double side)
	{
		setWidth(side);
	}
	
	@Override
	public void setWidth(double side)
	{
		setWidth(side);
	}
	public void setLength(double side)
	{
		setLength(side);
	}
	@Override
	public String toString()
    {
    	return "Side "+super.getWidth();
    }
}
