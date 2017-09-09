import static dit042.SimpleIO.*;
public class Assignment {

	public static void main(String[] args) {
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
			String s2 = "";
			String s3 = "";
			boolean check = false;		//initializes helper variables
			userInput = readChar();
			switch (userInput)			//checks which operation input corresponds to, prints error if it doesn't
			{
			case 'c':
				System.out.println("You picked concatenation.");
				System.out.println("Please enter the first string: ");
				s1 = readLine();
				System.out.println("Please enter the second string: ");
				s2 = readLine();	//handles user input
				s3 = s1;			//prepares result string to handle concatenated string
				for(i=0; i<s2.length(); i++)
				{
					s3 += s2.charAt(i);		//loop adds s2 to final string, character by character
				}
				System.out.println( "The result of the concatenating " +  s1 + " and "  + s2 + " is: "+ s3 + "." );
			break;
			case 'e':
				System.out.println("You picked equals.");
				System.out.println("Please enter the first string: ");
				s1 = readLine();
				System.out.println("Please enter the second string: ");
				s2 = readLine();
				j=0;			//resets counter for loop to 0
				check = false;
				if (s1.length() == s2.length())		//first check if strings are even the same length to save time
				{
					while(j<s1.length())			//goes through entire string, lengths are equal so only 1 var is used
					{
						if(s1.charAt(j) == s2.charAt(j))		//checks if each character is equal, continues loop if true
						{
							j++;
							check = true;
						}
						else							//breaks loop if inequality is found
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
					
				s1 = readLine();

				System.out.println("Please enter the first index: ");
				System.out.println(" ");
				
				int index1 = readInt();
			
				System.out.println("Please enter the second index: ");
 
				int index2 = readInt();
					
				System.out.println("The resulting substring is: ");
				for (j = index1; j <= index2 ; j++) //for loop adds each character between user inputed indexes to final string
				{
					s2 = s2 + s1.charAt(j);								
				}
				System.out.println(s2);
				break;
			case 't':
				System.out.println("You picked trim.");
				System.out.println("Please enter a string to trim: ");
				s1 = readLine();
				for(j=0; j < s1.length(); j++)		//for loop goes through original string, adds each non-space to an empty string
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
				
				System.out.println(" ");
				
				System.out.println("Please enter a string: ");

				s1 = readLine();
				
				System.out.println(" ");

				System.out.println("Please enter a character: ");
				
				char character = readChar();

				System.out.println(" ");

				System.out.println("The index of character " + character  +  " in " + s1 + " is " );
		
				i = -1;		//sets index variable in case no matching character is found

				for (j = 0 ; j <s1.length() ; j++ )  //loop checks each index for the inputted character
				{ 	
					if (s1.charAt(j) == character) 	//sets solution variable to index counter if character is found
					{	
							i = j;
					}        	               					
				}
				System.out.println(i);			
				break;
				
			case 'h':
				System.out.println("You picked contains");
				System.out.println("Please enter main string to compare to: ");
				s1 = readLine();
				System.out.println("Please enter string to compare: ");
				s2 = readLine();
				for (i=0; i<s1.length(); i++)
				{
					if (check == true)		//checks if string is contained, stops processing if it is
					{
						break;
					}
					if (s1.charAt(i) == s2.charAt(0))	//checks if first character of 2nd string is found to begin processing
					{
						j=i;
						while (j < s1.length() && (j-i) < s2.length())		//keeps loop within bounds, checks both strings parallel to each other
						{
							if (s3 == s2)									//stops loop if containment is established
							{
								break;
							}
							if(s1.charAt(j) == s2.charAt(j-i))				//if 2 characters are equal, adds character to solution string and continues
							{
								check = true;
								s3 += s2.charAt(j-i);
								j++;
							}
							else											//if inequality is found, empties solution string and breaks loop
							{
								check = false;
								s3 = "";
								break;
							}
							
						}
					}
				}
				if (s3.length() == s2.length())			//check if solution string is equal to input string
				{										//uses algorithm from previous option instead of .isEqual()
					j=0;	
					while(j<s3.length())
					{
						if(s3.charAt(j) == s2.charAt(j))
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
				if(check == true)
				{
					System.out.println("The string " + s1 + " contains the string " + s2 + ".");
				}
				else
				{
					System.out.println("The string " + s1 + " does not contain the string " + s2 + ".");
				}
				
				break;
			case 'q':		//quits program
				break;
			default:		//error in case of invalid input
				System.out.println("Invalid option");
				break;
			}
		}
		System.out.println("Thanks! Goodbye.");
	}

}
