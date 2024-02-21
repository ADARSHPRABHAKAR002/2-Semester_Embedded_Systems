package threads;

import java.util.Random;

public class MainThread extends Thread{
	int[][] arr;
	int row_number;
	int row_sum ;
	public MainThread(int arr[][],int row_num) {
		// TODO Auto-generated constructor stub
		this.arr = arr;
		this.row_number = row_num;
		this.row_sum =0;
	}
	@Override
    public  void run()
    {
    	super.run();
    	for(int i=0;i<4;i++)
    	{
    		this.row_sum += arr[this.row_number][i];
    	}
    	System.out.println("Row sum of "+ this.row_number + " is "+ getRowSum());
    }
	public  int getRowSum()
	{
		return this.row_sum;
	}
 
    
}