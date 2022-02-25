import java.util.Scanner;

public class Testers {
	public static void main(String[] args) {
		Person p = new Person();
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object

		System.out.print("Enter username: "); // Prompt user for input
		p.setName(myObj.nextLine());  // Read user input

		System.out.print("Age: ");
		while(!myObj.hasNextInt())
		{
			System.out.println("Please enter a valid age");
			myObj.next();
		}
		p.setAge(myObj.nextInt());

		myObj.nextLine();

		System.out.print("Enter password 🔑: ");
		while(!myObj.hasNextLine()) {
			System.out.println("Please enter a valid password");
			myObj.next();
		}
		p.setPassword(myObj.nextLine());

		System.out.println("\n" + p.toString());

	}

}

