package exc2;

public class NonNestedClassDemo{
	
	public static void main(String[] args){

		//Instantiating the outer class
		Outer_Demo outer = new Outer_Demo();
		Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();

		//accessing the display_Inner() method
		assert(inner.getNum() == 200);
		assert(outer.getInnerNum()== 50);
		assert(inner.getOuterNum() == 100);
		assert(outer.getOuterNum() == 100);

	}
}