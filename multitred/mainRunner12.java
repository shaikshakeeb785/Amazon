package multitred;

public class mainRunner12 
{
	public static void main(String args[]) throws InterruptedException
	{
		Runnable target=new NewRunnable();
		Thread t1=new Thread(target,"shaik");
	t1.start();
		t1.suspend();
		t1.resume();
	}

}
