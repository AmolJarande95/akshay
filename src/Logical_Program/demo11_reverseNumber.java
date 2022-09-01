package Logical_Program;

public class demo11_reverseNumber 
{

	public static void main(String[] args) 
	{
	
		int orgNum=12345;
		String org= Integer.toString(orgNum); //convert no to string
		
		String rev="";
		for(int i=org.length()-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);
		}
		
		int revNum=Integer.parseInt(rev);//convert string to num
		System.out.println(revNum);
		
		
		
		
		
		
	}
}
