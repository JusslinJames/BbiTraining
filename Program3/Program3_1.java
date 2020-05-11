package bbiTraining;

import java.util.Scanner;

import javax.swing.plaf.SliderUI;

public class Program3_1 implements Runnable{

	public String name;



	public Program3_1(String n) {
		name=n;
	}
	
	
	public void run() 
	{
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread "+i+" named "+name+" is running.");
			try {
				Thread.sleep(i*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		Program3_1 p=new Program3_1("JJ");
		Program3_1 p1=new Program3_1("Jusslin");
		Thread t=new Thread(p);
		Thread t1=new Thread(p1);
		t.start();
		t.join();
		t1.start();
		
		
//		t1.start();
		
	}

}

