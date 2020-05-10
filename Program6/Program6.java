package bbiTraining;

import java.util.Scanner;

public class Program6 {

	void accept()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the input: ");
		String regex="^[+-]+$";
		String s=sc.nextLine();
		
		if(!s.matches(regex))
		{
			System.out.println("Invalid String");
			accept();
		}
		else
		{
			calculate(s);
		}
	}
	
	

	void calculate(String s)
	{
		int step = 0;
		int flag=0;
		
		char input[]=s.toCharArray();
		for (int i = 0; i < input.length-1; i++) {
			if(input[i]!=input[i+1])
			{
				step++;
			}
			
		}
		
		
		int size=input.length;
		if(input[size-1]=='-')
		{
			step++;
		}
		
		System.out.println("Minimum flips : "+step+ " flips");
	
	}
	
	

	public static void main(String[] args) {
		
		Program6 p=new Program6();
		p.accept();

	}
}
