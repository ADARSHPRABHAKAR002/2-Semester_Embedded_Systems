package exc2;

class Outer_Demo
{
	//private variable of the outer class
	private int num_outer = 100;

	//Inner class
	public class Inner_Demo{

		int num = 200;

		public int getNum()
		{
			return num;
		}
		public int getOuterNum(){
			
			return num_outer;
		}
	}

	public int getInnerNum(){

		Inner_Demo in = new Inner_Demo();
		return in.getNum();
	}

	public int getOuterNum(){
			return num_outer;
	}
	
}