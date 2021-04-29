package multitred;

public class MainRunner5 
{
	public static void main(String arrgs[])
	{
		Runnable s=new sRunnable();
		Runnable c=new cRunnable();
		
		Thread t1=new Thread(s);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
		
		
		
	}

}
