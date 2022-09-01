package Logical_Program;

public class demo9_find_total_no_of_white_spaces_in_String 
{

	public static void main(String[] args) 
	{
	
		String str = "a b   c d";
		
		int count = 0;
		
		for(int i=0; i<=str.length()-1; i++)
		{
			char s1 = str.charAt(i);
			
			if(s1==' ')
			{
				count++;
			}
			
			
		}
		
		System.out.println("no of spaces in given string: " + count);
		
		//System.out.println(str.replace(" ", ""));
		
		
	}
}
