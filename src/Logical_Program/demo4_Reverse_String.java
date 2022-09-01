package Logical_Program;

public class demo4_Reverse_String 
{

	public static void main(String[] args)
	{
	
		String org="amol";
		String rev="";      //loma
		
		//    4-1=3
		for(int i=org.length()-1; i>=0; i--)
		{
			rev=rev + org.charAt(i);
		}
		
		System.out.println(org);
		
		System.out.println(rev);
		
		
	}
}
