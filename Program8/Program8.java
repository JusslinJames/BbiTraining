package bbiTraining;

public class Program8 {
	public static void main(String[] args) {
		int cnt=1,i=0;
		char a;

		while(i<7)
		{
			for(int j=97;j<110;j++)
			{
				if(j>103) 
				{
					if(i>1 && j<=103+(i-1))
					{
						System.out.print("_");
						cnt++;
					}
					else
					{
						a=(char)(103-cnt);
						cnt++;
						System.out.print(a);
					}		
				}
				else if(j<=103)
				{
					if(j>103-i)
					{
						System.out.print("_");
					}
					else	
					{	
					a=(char) j;
					System.out.print(a);
					}
				}	
			}
			i++;
			cnt=1;
			System.out.println();
		}
		
	}

}
