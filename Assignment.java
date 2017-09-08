import java.util.*;
public class Assignment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		//prepares program for input
		char userInput = '\0';		//initializes input variable so it can be used in the loop
		System.out.println("******************************");
		System.out.println("**                          **");
		System.out.println("**   Welcome to the DIT042  **");
		System.out.println("**      String library      **");
		System.out.println("**                          **");
		System.out.println("******************************");
		while (userInput != 'q')	//loop that allows user to keep using the program until they want to quit
		{
			System.out.println("Please choose a string operation or press 'q' to quit: ");
			System.out.println("Press c for concatenation");
			System.out.println("Press e for equals");
			System.out.println("Press s for substring");
			System.out.println("Press t for trim");
			System.out.println("Press l for lastIndexOf");
			System.out.println("Press h for contains");
			int i;
			int j;
			String s1 = "\0";
			String s2 = "\0";
			String s3 = "\0";
			boolean check = false;	//initializes helper variables
			userInput = input.nextLine().charAt(0);
			switch (userInput)						//checks which operation input corresponds to, prints error if it doesn't
			{
			case 'c':
				System.out.println("You picked concatenation.");
				System.out.println("Please enter the first string: ");
				s1 = input.nextLine();
				System.out.println("Please enter the second string: ");
				s2 = input.nextLine();
				System.out.println( "The result of the concatenating" + " " +  s1 + " " + "and" + " "  + s2 + " " + "is:" + " " + s1 + s2 + " " );
				
			break;
			case 'e':
				System.out.println("You picked equals.");
				System.out.println("Please enter the first string: ");
				s1 = input.nextLine();
				System.out.println("Please enter the second string: ");
				s2 = input.nextLine();
				j=0;
				check = false;
				if (s1.length() == s2.length())
				{
					while(j<s1.length())
					{
						if(s1.charAt(j) == s2.charAt(j))
						{
							j++;
							check = true;
						}
						else
						{
							check = false;
							break;
						}
					}
				}
				
				if (check)
				{
					System.out.println("The two strings are equal.");
				}
				else
				{
					System.out.println("The strings " + s1 + " and " + s2 + " are not equal.");
				}
				
				break;
			case 's':
				System.out.println("You picked substring.");
				System.out.println(" ");
				
					
				System.out.println("Please enter the string: ");
				System.out.println(" ");
					
				s1 = input.nextLine();

				 
				System.out.println("Please enter the first index: ");
				System.out.println(" ");
				
					int index1 = Character.getNumericValue(input.nextLine().charAt(0));

					
					System.out.println("Please enter the second index: ");
 
					
					int index2 = Character.getNumericValue(input.nextLine().charAt(0));
					
					System.out.print("The resulting substring is: ");

					for (j = index1; j <= index2 ; j++) {
							
							s2 = s2 + s1.charAt(j);
					
							
						}
System.out.println(s2);

				break;
			case 't':
				System.out.println("You picked trim.");
				System.out.println("Please enter a string to trim: ");
				s1 = input.nextLine();
				for(j=0; j < s1.length(); j++)
				{
					if (s1.charAt(j) != ' ')
					{
						s2 = s2 + s1.charAt(j);
					}
				}
				System.out.println("The trimmed string is: " + s2);
				
				break;
			case 'l':
				System.out.println("You picked lastIndexOf");
				break;
			case 'h':
				System.out.println("You picked contains");
				System.out.println("Please enter main string to compare to: ");
				s1 = input.nextLine();
				System.out.println("Please enter string to compare: ");
				s2 = input.nextLine();
				for (i=0; i<s1.length(); i++)
				{
					if (check == true)
					{
						break;
					}
					if (s1.charAt(i) == s2.charAt(0))
					{
						j=i;
						while (j < s1.length() && (j-i) < s2.length())
						{
							if(s1.charAt(j) == s2.charAt(j-i))
							{
								check = true;
								j++;
								s3 += s2.charAt(j-i);
							}
							else
							{
								check = false;
								break;
							}
							
						}
					}
				}
				if(s3 != s2)
				{
					check = false;
				}
				if(check == true)
				{
					System.out.println("The string " + s1 + " contains the string " + s2 + ".");
				}
				else
				{
					System.out.println("The string " + s1 + " does not contain the string " + s2 + ".");
				}
				
				break;
			case 'q':
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
		}
		System.out.println("Goodbye");
	}

}
