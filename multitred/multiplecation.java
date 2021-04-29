package multitred;

public class multiplecation {
	int n;
	synchronized void print()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(n+"*"+i+" ="+n*i);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
