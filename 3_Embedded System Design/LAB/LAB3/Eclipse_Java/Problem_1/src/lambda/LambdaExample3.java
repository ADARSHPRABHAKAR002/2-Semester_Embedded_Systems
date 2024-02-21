package lambda;


interface Sayable{
	public String say(String name);
}


public class LambdaExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sayable s = new Sayable() {
			
			@Override
			public String say(String name) {
				// TODO Auto-generated method stub
				return "Hello " + name;
			}
		};
		
		System.out.println(s.say(" xyz"));
		
		Sayable s1 = (name) -> { return "Hello "+ name; };
		
		System.out.println(s1.say(" abc"));
	}

}
