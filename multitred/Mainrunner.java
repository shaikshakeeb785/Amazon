package multitred;

public class Mainrunner 
{
	public static void main(String arrgs[])
	{
		Thread t1=new jspider();
		Thread t2=new qspider();
		t1.start();
		t2.start();
	}

}
