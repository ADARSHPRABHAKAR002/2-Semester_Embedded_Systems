package Exc1;

class Outer_Demo
{
	int num = 100;

	//accessing the inner class from the method within
	int getNum_Inner(){

		//Inner class
		private class Inner_Demo{

			public int getNum()
			{
				return num;
			}
		}
			
		Inner_Demo inner = new Inner_Demo();
		return inner.getNum();
	}
}