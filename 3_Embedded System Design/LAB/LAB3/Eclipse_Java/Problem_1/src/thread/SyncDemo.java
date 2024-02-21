package thread;


class CallMe{
	public void Call(String msg) {
		// TODO Auto-generated method stub
		System.out.print("[" + msg);
		
		try {
			Thread.sleep(1000);
			
			
		}
		catch(InterruptedException e)
		
		{
			e.printStackTrace();
		
		}
		System.out.print(false);
	}	
}

class Caller implements Runnable
{
	CallMe target;
	String msg;
	Thread t;
	public Caller(CallMe target,String msg)
	{	
		this.msg=msg;
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (target)
		{
			target.Call(msg);
		}
	}
	
	
}


public class SyncDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallMe target =  new CallMe();
		Caller p1 = new Caller(target,"message");
		Caller p2 = new Caller(target,"Node");
		Caller p3 = new Caller(target,"List");
		

	}

}
