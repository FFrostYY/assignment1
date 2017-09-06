import java.util.*;
public class Assignment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		//prepares program for input
		char userInput = '\0';		//initializes input variable so it can be used in the loop
		int j;
		String s1 = "\0";
		String s2 = "\0";
		boolean check;	//initializes helper variables
		while (userInput != 'q')	//loop that allows user to keep using the program until they want to quit
		{
			userInput = input.next().charAt(0);
			switch (userInput)						//checks which operation input corresponds to, prints error if it doesn't
			{
			case 'c':
				System.out.println("You picked concatenation.");
				System.out.println(" ");
				System.out.println("Please enter the first string: ");
				s1 = input.next();
				System.out.println("Please enter the second string: ");
				s2 = input.next();
				System.out.println( "The result of the concatenating" + " " +  s1 + " " + "and" + " "  + s2 + " " + "is:" + " " + s1 + s2 + " " );
			break;
			case 'e':
				System.out.println("You picked equals.");
				s1 = input.next();
				s2 = input.next();
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
