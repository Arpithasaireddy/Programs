package program2;

public class run
{
	public static void main (String[] args)
	{
		
		int count= 0;
		for( int i=1; i<= 1000000; i= i+1)
		{
			if((i%9==0)||(i%13==0)||(i%21==0)||(i% 81==0));
			{
				
				count = count +1;
				
			}
			
		}
		System.out.print("count");
	}
}
