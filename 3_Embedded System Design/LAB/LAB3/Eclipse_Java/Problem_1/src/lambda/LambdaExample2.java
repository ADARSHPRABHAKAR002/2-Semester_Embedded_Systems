package lambda;

@FunctionalInterface
interface Drawable1{
	public void draw(int a);
}

public class LambdaExample2 {

	public static void test(Drawable1 d, int i) {
		d.draw(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int width = 20;
		
		//Drawable1 d2 = ()->{
		//	System.out.println("width: " + width);
		//};
		
		//d2.draw();
		//LambdaExample2 obj = new LambdaExample2();
		test(n->System.out.println(n), 10);
		
	}

}
