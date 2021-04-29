package multitred;

public class main_runner1 {

	public static void main(String arrgs[])
	{

		Thread t1=new Thread("shaik shakeb ahmd");
		System.out.println(t1);
		
		t1.setName("sameer");
		t1.setPriority(8);
		System.out.println(t1);


		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.getId());

	}
}
