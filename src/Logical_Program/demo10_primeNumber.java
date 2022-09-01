package Logical_Program;

public class demo10_primeNumber 
{

	
	public static void main(String[] args) 
	{
	
	int num=3;	
		int count=0;
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		
		if(count==1)
		{
			System.out.println("given num is not a prime number");
			
		}
		else
		{
			System.out.println("given num is prime number");
		}
		
		//find prime number from 1 to 100
	}
}
