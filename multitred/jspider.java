package multitred;

public class jspider extends Thread {
	
		public void run()
		{
			for(int i=1; i<=10; i++)
			{
				System.out.println("jspider"+i);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}


