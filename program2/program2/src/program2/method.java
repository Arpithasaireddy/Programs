package program2;

public class method {

	public static void main(String[] args) 
	{
		String s = "hey 123 my world";

		System.out.println("print vowels: ");
		printVowels(s);

		System.out.println("print consonents");
		printConsonents(s);

		System.out.println("print digits");
		printDigits(s);
		
		
	}

	      static void printVowels(String s) 
	       {
                 String vowels="aeiouAEIOU";
		       for (int i = 0; i < s.length(); i++)
		{

			       if(vowels.indexOf(s.charAt(i))!=-1)
			{
				 System.out.println(s.charAt(i));
		   }
	      }
	     }
	       static void printConsonents(String s) 
	{
          String consonents="bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
		for (int i = 0; i < s.length(); i++)
		  {

			if(consonents.indexOf(s.charAt(i))!=-1)
			{
				System.out.println(s.charAt(i));
		     }
	        }
	        }
	         static void printDigits(String s) 
	       {
             String digits="0123456789";
		 for (int i = 0; i < s.length(); i++)
		{
 
			if(digits.indexOf(s.charAt(i))!=-1)
			{
				System.out.println(s.charAt(i));
		      }
	         } 
	     }
      }
	
  


	
