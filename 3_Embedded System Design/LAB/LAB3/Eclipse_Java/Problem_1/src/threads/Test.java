package threads;
 
import java.util.Random;
 

 
public class Test {
 
	public Test() {
		// TODO Auto-generated constructor stub
	}
 
	public static void main(String[] args) {
		int [][]arr = new int[3][4];
		Random rand = new Random();
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[i][j] = rand.nextInt(100);
				
			}			
		}	
		// TODO Auto-generated method stub
		MainThread  m0 = new MainThread(arr,0);
		m0.start();
		MainThread m1 = new MainThread(arr,1);
    	m1.start();
    	MainThread m2 = new MainThread(arr,2);
    	m2.start();
    	try {
    		m0.join();
    		m1.join();
    		m2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	System.out.println("Total sum is "+ (m0.getRowSum()+m1.getRowSum()+ m2.getRowSum()) );
    	
	}
 
}