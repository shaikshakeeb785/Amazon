package multitred;

public class cRunnable implements Runnable
{

	@Override
	public void run() {
              for(char ch='A';ch<='Z';ch++)
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
