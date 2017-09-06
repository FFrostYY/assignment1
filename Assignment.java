import java.util.*;
public class Assignment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char userInput = '\0';
		while (userInput != 'q')
		{
			userInput = input.next().charAt(0);
			switch (userInput)
			{
			case 'c':
				System.out.println("You picked concatenation.");
				break;
			case 'e':
				System.out.println("You picked equals.");
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
			default:
				System.out.println("Invalid option");
				break;
			}
		}
		System.out.println("Goodbye");
	}

}
