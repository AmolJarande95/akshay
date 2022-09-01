package Logical_Program;

public class demo8_Imp_Armtrong_Number
{

	public static void main(String[] args) 
	{
	
		int orgNum=153;
		int sum=0;   //153
		
		for(int i=orgNum; i>0; i=i/10)
		{
			int rem=i %10;  //1%10=1
			sum =sum + (rem * rem * rem);
			
			
		}
		
		if(orgNum==sum)
		{
			System.out.println("given number " +orgNum+ " is an armstrong number");
		}
		else
		{
			System.out.println("given number "+orgNum+"is not armstrong number");
		}
		
//		int rem = OrgNum%10;  //153/10=3
//		
//		System.out.println(rem);
//		
//		OrgNum=OrgNum/10;
//		System.out.println(OrgNum);
//		
//	}
//	    find Armstrong_Number from 1 to 1000
	}}


