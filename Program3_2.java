package bbiTraining;


class Test
{
	private static Test t=null;
	public String s;
	private Test() {
		System.out.print("Called Singleton class constructor called...");
		
	}
	
	public static Test getTest()
	{
		if (t==null) 
		{
		t=new Test();
		}
		return t;
	
	}
	
}



public class Program3_2 
{
	public static void main(String[] args) {
		Test t1=Test.getTest();
	}

}
 