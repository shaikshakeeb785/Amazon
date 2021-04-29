package multitred;

public class mainRunner14
{
	public static void main(String args[])throws InterruptedException
	{
	 multiplecation m1=new  multiplecation();
	 Thread t1=new Thread() {
		 
		public  void run()
		 {
			 m1.print();
		 }
		 
	 };
	 Thread t2=new Thread() {
		 
			public  void run()
			 {
				 m1.print();
			 }
			 
		 };
		 m1.n=6;
		 t1.start();
		Thread.sleep(5000);

		 m1.n=7;
			t2.start();

	}
	
}
