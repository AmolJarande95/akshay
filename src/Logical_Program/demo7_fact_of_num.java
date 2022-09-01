package Logical_Program;

import java.util.Scanner;

public class demo7_fact_of_num
{

	public static void main(String[] args)
	{
	
		System.out.println("enter num: ");
		Scanner scan=new Scanner(System.in);
		
		int num=scan.nextInt();  //4
		
		int fact=1;
		
		//4
		for(int i=num; i>=1; i--)
		{
			fact=fact*i;  //1x4=4,4x3=12,12x2=24,24x1=24
		}
		
		System.out.println(fact);
		
	}
}
