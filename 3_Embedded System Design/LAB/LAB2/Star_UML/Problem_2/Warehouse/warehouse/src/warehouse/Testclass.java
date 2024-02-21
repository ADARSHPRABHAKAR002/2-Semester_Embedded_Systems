package warehouse;

public class Testclass {
	public static void main(String[] args) 
    {
        
       Warehouse w=new Warehouse(200.0);
       assert(w.getcapacity()==200);
       w.addtowarehouse(100.0);
       assert(w.getbalance()==100.0);  
        assert(w.howmuchspaceleft()==100.0);
       assert(w.takefromwarehouse(100.0)==100.0); 
       System.out.println(w.toString());

       Productwarehouse ew=new Productwarehouse("microcontroller",300.0);
         assert(ew.getcapacity()==300);
       ew.addtowarehouse(200.0);
       assert(ew.getbalance()==200.0);  
        assert(ew.howmuchspaceleft()==100.0);
       assert(ew.takefromwarehouse(100.0)==100.0); 
       System.out.println(ew.toString());


    }


}
