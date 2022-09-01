package Logical_Program;

public class demo12_Imp_Reverse_Number_without_String_Function 
{

	public static void main(String[] args) 
	{
	
		
		int num=12345;
		int revnum=0;
		
		for(int i=num; i>0; i=i/10)
		{
			int rem = i%10;
			revnum = revnum*10+rem;
		}
		
		System.out.println(revnum);
		
//		while(num>0)
//		{
//			int rem=num%10;
//			revnum=revnum*10+rem;
//			num=num/10;
//		}
	}
}
