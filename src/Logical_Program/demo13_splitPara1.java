package Logical_Program;

public class demo13_splitPara1 
{

	public static void main(String[] args) 
	{
	
		String s1="my name is amol";
		
		String [] ar=s1.split(" ");//{my(0) name(1) is(2) amol(3)
		
		System.out.println(ar[2]);
		
		System.out.println("------------");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		

  // System.out.println("no of spaces in given string:" + count);
   
   //System.out.println(str.replace(" "," "));

   }}

