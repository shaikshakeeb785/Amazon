package multitred;

public class main_runner 
{
	public static void main(String arrgs[])
	{
		Thread t1=new Thread();
		System.out.println(t1);

		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.getId());

		
	}

}
