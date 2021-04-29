package multitred;

public class mainrunner4 {
	public static void main(String arrgs[])
	{
		Thread t1=new mythread();
		System.out.println(t1);
		
		t1.start(); 
		
		
	}

}
