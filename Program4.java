package bbiTraining;

public class Program4 {

	public static void main(String[] args) 
	{			
		int num1=3,num2=2;
		System.out.println("Before Swapping:");
		System.out.println("Num1:"+num1);
		System.out.println("Num2:"+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After Swapping:");
		System.out.println("Num1:"+num1);
		System.out.println("Num2:"+num2);
	}

}
