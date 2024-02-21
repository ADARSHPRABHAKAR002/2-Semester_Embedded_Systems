package lambda;
import java.util.*;
@FunctionalInterface
interface Timer
{
	public int setTimer(int h, int m);
}


public class TestLambda{
	public static void main(String [] args)
	{
		Timer s=(int h, int m)->{return h+m;};
		System.out.println(s.setTimer(5, 6));
				Runnable r1=()->{System.out.println("Hello");};
		r1.run();
	}
}