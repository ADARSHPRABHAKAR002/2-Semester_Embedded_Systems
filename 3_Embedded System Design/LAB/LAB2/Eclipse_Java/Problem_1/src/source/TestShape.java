package source;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape sh = new Shape("yellow",false);
		
		assert(sh.isFilled()==false);
	}

}
