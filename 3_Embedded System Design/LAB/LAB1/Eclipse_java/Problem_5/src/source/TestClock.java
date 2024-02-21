package source;

public class TestClock {

	public static void main(String[] args) {
		Clock c1= new Clock(13,60,53,"PM");
		Clock c2= new Clock(12,59,59,"AM");
		Clock c3= new Clock(01,20,30,"UM");

		assert(Clock.isValid(c1)==false);
		assert(Clock.isValid(c2));
		assert(Clock.isValid(c3)==false);
	}

}