package warehouse;

public class Productwarehouse extends Warehouse{
	private String name;

	   public Productwarehouse(String name,double capacity) 
	    {
		    super(capacity);
	        this.name=name;
	      }

	    
	    public String getname() 
	    {
	        return name;
	        
	    }
	    public void setname(String name) {
	       
	       this.name=name;
	    }
	   
	    public String toString() {
	       return "my name is punith";
	    }}
