

	import java.util.Scanner;
	public class xml {
		
	  private static Scanner input;

			public static void main(String[] args) 
			{
				input = new Scanner(xml.class.getResourceAsStream("input.data"));
				
			while(input.hasNextLine())
				{
				String line = input.nextLine();
				//String s = input.nextLine();
				
				if(line.contains("<"))
				{
					line = line.replaceAll("<", "");
					line = line.replaceAll(">", "->");
					 String[] run = line.split("/");
					 
					 line= run[0];
				}
			
			//	String s1 = input.nextLine();
				
				
				System.out.println(line);
				}
			}}
		

