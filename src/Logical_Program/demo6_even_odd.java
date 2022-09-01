package Logical_Program;

import java.util.Scanner;

public class demo6_even_odd 
{

	public static void main(String[] args) 
	{
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter No: ");
		int num=scan.nextInt();
		
		//4%2==0
		
		if(num % 2== 0)
		{
			System.out.println("given number is even");
		}
		else
		{
			System.out.println("given number is odd");
		}
		
	}
}
