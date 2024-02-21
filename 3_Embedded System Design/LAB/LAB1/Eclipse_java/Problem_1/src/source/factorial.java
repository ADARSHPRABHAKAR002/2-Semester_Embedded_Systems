package source;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the number you want for factorial:");
		int fact=sc.nextInt();
		int res=1;
		for(int i=1;i<=fact;i++)
		{
			res=res*i;
		}
		
		System. out.println("Factorial of "+fact+" is"+ " = "+res);
		sc.close();
	}

}
