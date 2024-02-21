package lambda;


interface Drawable{
	public void draw();
}

public class LambdaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width = 10;
		
		Drawable d1 = new Drawable() {
			
			@Override
			public void draw() {
				// TODO Auto-generated method stub
				System.out.println("draw width " + width);
			}
		};
		
		d1.draw();
	}

}
