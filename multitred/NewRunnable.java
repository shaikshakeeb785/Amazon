package multitred;

public class NewRunnable implements Runnable{

	@Override
	public void run() 
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
