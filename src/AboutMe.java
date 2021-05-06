import java.util.Scanner;

/**
 * File name: AboutMe.Java
 * @author Salih
 * Course: CST8284 OOP 
 * Assignment: Lab-1
 * Date: Friday, January 15, 2021
 * Professor: Leanne Seaward
 * Purpose: To show how to document a java file 
 */

/**
 * <p>
 * The purpose of this class is that to show java documentation. The class
 * contains only one method that is method main. Basically, The program asks the
 * user to input his or her name and student number and the reason why they are
 * taking the course finally it prints out the information that taken from the
 * user.
 * </p>
 * 
 * @author Salih
 * @version 1.0
 * @see java.util.Scanner
 * @since 1.8
 */
public class AboutMe {

	/**
	 * @param args
	 * @return "return type is void"
	 */
	public static void main(String[] args) {
		/**
		 * <b>Creating object and declaring variables</b>
		 */
		Scanner keyboard = new Scanner(System.in);
		String myFullName;
		int studentNumber;
		String reason;

		System.out.print("Enter your full name: ");
		myFullName = keyboard.nextLine(); // read the string from user

		System.out.print("Enter your student number: ");
		studentNumber = keyboard.nextInt(); // read the number from the user
		keyboard.nextLine(); // Consume newline left-over

		System.out.print("Two reasons why you are taking this course: ");
		reason = keyboard.nextLine();

		System.out.println("\nMy full Name: " + myFullName + " My Student number: " + studentNumber);
		System.out.println();
		System.out.println("The reasons for taking the course: " + reason);

	}

}
