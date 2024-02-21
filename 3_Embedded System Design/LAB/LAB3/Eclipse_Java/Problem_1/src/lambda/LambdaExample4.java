package lambda;

import java.util.ArrayList;


public class LambdaExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating an ArrayList with elements
        // {1, 2, 3, 4}
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        
       for (Integer integer : arrL) {
    	  System.out.println(integer);
       }
       
       arrL.forEach(n->System.out.println(n));
       
       arrL.forEach(n-> {if(n%2==0)System.out.println(n);});
	}

}
