package rot13;

public class program {
	

	    public static String rot13(String value)
	    {

		char[] values = value.toCharArray();
		for (int i = 0; i < values.length; i++)
		{
		    char alphabetic = values[i];

		    if (alphabetic >= 'a' && alphabetic <= 'z')
		    {

			if (alphabetic > 'm') 
			{
			    alphabetic -= 13;
			}
			else 
			{
			    alphabetic += 13;
			}
		    } else if (alphabetic >= 'A' && alphabetic <= 'Z')
		    {
		

			if (alphabetic > 'M') 
			{
			    alphabetic -= 13;
			}
			else 
			{
			    alphabetic += 13;
			}
			
		    }
		    values[i] = alphabetic;
			}
		
		return new String(values);
	    }

	    public static void main(String[] args) 
	    {
		String input = " cat ";
		String rot13 = rot13(input);
		System.out.println(input);
		System.out.println(rot13);

	    }
	}





