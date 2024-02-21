package corejava;

/**
 * Point - a double x,y coordinate
 */
public class Point         
{
    // Attributes
 
	private double myX;
    private double myY;
 
    // Constructors
        
    public Point(double x, double y)
    {
       myX = x; myY = y;
    }
 
    public Point()
    {
       myX = 0.; myY = 0.;
    }
 
    // Methods
    
    public double getX()
    {
        return myX;
    }
 
    public double getY()
    {
        return myY;
    }
 
    public void setPoint(double x, double y)
    {
        myX = x; myY = y;
    }
}