package multitred;

public class sRunnable implements Runnable
{

	@Override
	public void run() {
		
		for(char ch='a'; ch<='z'; ch++)
		{
			System.out.print(ch);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
