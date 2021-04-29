package multitred;

public class main 
{
	public static void main(String args[])
	
	{
		Thread t1=new Thread();
	
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		

		
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());
		t1.setName("shakeeb");


		System.out.println(t1.getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
	}

}
