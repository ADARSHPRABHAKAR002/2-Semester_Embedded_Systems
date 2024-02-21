package Exc3;

abstract class AnonymousInner{
	public abstract int getNum();
}

/*class X extends AnonymousInner{
	@Override
	public int getNum(){
		return 100;
	}
}*/

public class AnonymousDemo{

	public static void main(String args[]){

		//X obj = new X();
		//AnonymousInner inner = obj;

		AnonymousInner inner = new AnonymousInner(){
			private int num = 100;
			@Override
			public int getNum(){

				return num;
			}
		};

		/*class MyAnonymous extends AnonymousInner
		{
			private int num = 100;

			@Override
			public int getNum(){

				return num;
			}
		}
		AnonymousInner inner = new MyAnonymous();*/
		assert(inner.getNum() == 100);
	}
}





