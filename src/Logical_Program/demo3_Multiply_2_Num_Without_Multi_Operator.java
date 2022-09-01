package Logical_Program;

public class demo3_Multiply_2_Num_Without_Multi_Operator 
{

	public static void main(String[] args) 
	
	{
	
		int num1=20;
		int num2=5;
		
		int sum=0;
		
		//1<=5
		for(int i=1; i<=num2; i++)
		{
			sum=sum+num1;//0+20=20
			             //20+20=40
			             //40+20=60
			             //60+20=80
			             //80+20=100
			             //means 20x5=100
		}
		
		System.out.println(sum);
		
		
	}
	
}
