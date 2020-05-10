package bbiTraining;

import java.util.Scanner;

public class Program2_Stack {
		
	int top=-1;
	
	
	void push(int element,int stack[],int size)
	{
		
		if(top>=-1 && top<size-1)
		{
			top++;
			stack[top]=element;
		}
		else
		{
			System.out.println("Stack Full");
			System.exit(0);
		}
		
	}
	
	
	
	void pop(int stack[],int size)
	{
		if(top<=0)
		{
			System.out.println("Nothing to pop");
		}
		else
		{
			System.out.println("Popped element: "+stack[top]);
			stack[top]=0;
			top--;
		}
	}
	
	
	
	void peek()
	{
		System.out.println("\nTop is at position: " +top);
	}
	
	
	
	
	
	
	
	
	void display(int stack[])
	{
		if (top==-1){
			System.out.println("Nothing to display...Stack empty");
		}
		else {
			System.out.println("Current Stack: ");
			for (int i : stack) {
				System.out.print(i+" ");
			}
		}
		
	}
	
	

	public static void main(String[] args) {
		Program2_Stack s=new Program2_Stack();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of stack: ");
		int size=sc.nextInt();
		int stack[]=new int[size];
		

		s.push(10,stack,size);
		s.push(14,stack,size);
		s.push(18,stack,size);
		s.pop(stack, size);
		s.push(17,stack,size);
		s.display(stack);
		s.peek();
	}
}
