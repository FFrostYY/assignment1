import java.util.*;
public class Assignment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		//prepares program for input
		char userInput = '\0';		//initializes input variable so it can be used in the loop
		while (userInput != 'q')	//loop that allows user to keep using the program until they want to quit
		{
			int j;
			String s1 = "\0";
			String s2 = "\0";
			boolean check;	//initializes helper variables
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
