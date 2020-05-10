package bbiTraining;

import java.util.Scanner;

public class Program2_Queue {

	int rear=-1;
	int front=0; 
	
	
	void enqueue(int element,int queue[],int size)
	{
		if(rear>=-1 && rear<size-1)
		{
			rear++;
			queue[rear]=element;
		}
		else
		{
			System.out.println("Queue is full");
			System.exit(0);
		}		
	}
	
	

	void dequeue(int queue[],int size)
	{
		if(front>0)
		{
			int temp;
			
			queue[front]=0;
//			front++;
			
			
			for(int i=0;i<size-1;i++)
			{
				queue[i]=queue[i+1];
			}
			queue[rear]=0;			
			rear--;
		}
		else
		{
			System.out.println("Queue is Empty");
			System.exit(0);
		}
		
		
		
		
	}
	
	
	void show(int queue[])
	{
		for (int i : queue) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		Program2_Queue q=new Program2_Queue();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of queue: ");
		int size=sc.nextInt();
		int queue[]=new int[size];
		
//		q.enqueue(5, queue, size);
//		q.enqueue(8, queue, size);
		q.enqueue(7, queue, size);
		q.dequeue(queue,size);
		q.show(queue);
	}

}
