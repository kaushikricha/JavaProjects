import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;

/**
 * This class reads integer values provided by user,
 * stores them in Linked List,
 *  and displays them in ascending order using Java Collections Framework.
 */
public class SortIntegerList {
    /**
     * It collects user input, stores them in Linked List
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (type 'done' to finish): ");

        while (true) { // While loop to take user input indefinitely
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")){
                    break;
                } else {
                System.out.println("Invalid input. Please enter an integer: ");
                }                
            }
        }

        // Sorts the numbers in ascending order
        Collections.sort(numbers);

        //Prints the ordered list
        System.out.println("You entered (sorted): " + numbers);
        scanner.close();
    }
}

// I reused Java's built-in  Linked List class from java's utility package. I did not
// have to build the Linked List from scratch.
// I reused Java's Scanner class to read input and no need to implement the input parser.
// I also reused Java's utility method Collections.Sort() to sort the list.
// I did not have to write any sorting algorithm.
