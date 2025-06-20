import java.util.Stack;
import java.util.Scanner;
import java.util.Collections;

/**
 * This program reads integer values provided by user.
 * stores them in a Stack, and displays them in ascending order.
 * It uses the Java Collections Framework for sorting and stack operations.
 *
 * <p><b>Implementation Notes:</b></p>
 * <ul>
 *    <li>Compile the java file using: {@code javac SortStack.java}</li>
 *    <li>Run the program: {@code java SortStack}</li>
 *    <li>Generate the Javadoc: {@code javadoc -d docs SortStack.java}</li>
 * </ul>
 *
 * <p><b>Code reuse Notes:</b></p>
 * <ul>
 *    <li>Reused Java's built-in {@code Stack} class from {@code java.util} package</li>
 *    <li>Used {@code Scanner} class to take input</li>
 *    <li>Applied {@code Collections.sort()} to sort the stack elements</li>
 *</ul>
 */

public class SortStack {
    public static void main(String[] args) {
        //Create a stack
        Stack<Integer> numbers = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers: ");

        while (true) { // while loop to take user input indefinitely
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                numbers.push(scanner.nextInt());
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid input: ");

                }
            }
        }

        // Sort the numbers
        Collections.sort(numbers);

        System.out.println("You entered in (ascending order): " + numbers);
        scanner.close();
    }
}



