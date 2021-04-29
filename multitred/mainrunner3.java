package multitred;

public class mainrunner3 
{
	public static void main(String arrgs[])
	{
		
	
	Runnable r1=new MyRunnable();
	Thread t1=new Thread(r1);
	System.out.println(t1);
	t1.setName("MOHAMMED");
	t1.setPriority(8);
	
	System.out.println(t1.getName());
	System.out.println(t1.getId());
	System.out.println(t1.getPriority());
	System.out.println(t1);
	t1.run();


	

}
}
