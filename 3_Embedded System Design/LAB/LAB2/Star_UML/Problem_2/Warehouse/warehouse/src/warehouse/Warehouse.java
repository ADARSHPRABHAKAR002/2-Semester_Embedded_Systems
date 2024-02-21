package warehouse;

public class Warehouse{
	private double capacity;
    private double balance;

    
    public Warehouse(double capacity)
     {
       this.capacity=capacity; 
    }
    public double getbalance() 
    {
       
        return balance;
    }

    public double getcapacity() 
    {
        
        return capacity;
    }

    public double howmuchspaceleft() {
        
        return (capacity-balance);
    }

    public void addtowarehouse(double amount) {
        
        balance=balance+amount;
    }

    public double takefromwarehouse(double amount) 
    {
           if(balance>=amount)
            {
           balance=balance-amount;
           return amount;
               }
           else  
            {
            System.out.println("the amount what u are entered is more than current amount");
            return 0.0;
             }}

    
    public String toString() {
        
        return "my college name is manipal";
        }}
