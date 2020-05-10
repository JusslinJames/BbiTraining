package bbiTraining;

import java.util.Scanner;

public class Program9 {

	String input;
	int flag;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string CAPs:");
		input=sc.next().trim();
		
		for(int i=0;i<input.length();i++)
		{
			int value=input.charAt(i);
			if(value>96 &&value<123)
			{
				flag=0;
			}
			else
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Invalid Input.Please enter in small caps only.");
			accept();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	void validate()
	{
		int alphabet[]=new int[24];
		//assigning counter to each character alphabet
		for(int i=0;i<24;i++) {
			alphabet[i]=i+1;	
		}
		
		//decrement of couters
		for(int i=0;i<input.length();i++)
		{
			int value=input.charAt(i)-97;
			
			if(alphabet[value]>0)
			{
				alphabet[value]=alphabet[value]-1;
			}
			else {
				System.out.println("Invalid String Input");
				System.exit(0);
			}
		}
		
		
		//last check of couters if all zero
		for(int i=0;i<input.length();i++)
		{
			int value=input.charAt(i)-97;
			if(alphabet[value]>0)
			{
				System.out.println("Invalid String Input");
				System.exit(0);
			}
			else
			{
				flag=0;
			}
			
		}
		if(flag==0)
		{
			System.out.println("Valid Input");
		}
			
	}
	
	

	
	
	
	
	public static void main(String[] args) {

		Program9 p=new Program9();
		p.accept();
		p.validate();
		
		
		
		
		
	}

}
