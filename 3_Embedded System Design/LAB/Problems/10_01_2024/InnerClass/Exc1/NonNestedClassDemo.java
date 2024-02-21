package Exc1;

public class NonNestedClassDemo{
	
	public static void main(String[] args){

		//Instantiating the outer class
		Outer_Demo outer = new Outer_Demo();

		//accessing the display_Inner() method
		assert(outer.getNum_Inner() == 100);
	}
}
