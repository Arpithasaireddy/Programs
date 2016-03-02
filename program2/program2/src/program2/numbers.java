package program2;

public class numbers
{
	public static void main(String[] args)
	{
	String s = "hey123";
	
	System.out.println("print digits");
	printDigits(s);
	
	}
	
	


	static void printDigits(String s)
	{
		String Digits= "0123456789";
		
		for(int i=0; i< s.length(); i++)
		{
			if(Digits.indexOf(s.charAt(i))!= -1)
			{
				System.out.print(s.charAt(i));
			
			}
		}
	}
}

