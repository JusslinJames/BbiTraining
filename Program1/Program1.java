

package bbiTraining;

import java.util.Scanner;

public class Program1 {
	
	public static void main(String[] args) 
	{
		int i=0,length=0;
//		char word[]= {'a','b','r','a','c','a','d','e','b','r','a'};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.next().trim();
		char word[]=s.toCharArray();

		String regex="^[a-zA-Z]*$";
		
		if(!s.matches(regex))
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		

		//finding length of new array
		try
		{
		while(word[i]!='\0')
		{
			if(word[i]=='a' || word[i]=='A' )
			{
				length++;
			}
			length++;
			i++;
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
	    {
	        
	    }
		
		
		
		//replacing 'a' with 'hi'
		char newword[]=new char[length];
		int j=0;
		int cnt=0;
try {
	
		while(word[j]!='\0')
		{
			if(word[j]=='a' || word[j]=='A')
			{
				newword[cnt]='h';
				cnt++;
				newword[cnt]='i';
				
			}
			else {
				newword[cnt]=word[j];
			}
			j++;
			cnt++;
		}
	}
		catch(ArrayIndexOutOfBoundsException e)
	    {
			
	    }
		

System.out.print("Old word: ");		
for (char c : word) {
	System.out.print(c);
}
System.out.print("\nNew word: ");	
for (char d : newword) {
	System.out.print(d);
}		
		
		

	}

}
