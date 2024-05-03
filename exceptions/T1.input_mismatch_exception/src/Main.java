import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne, numberTwo, sum;

        do {
            System.out.print("enter the first integer: ");
            try {
                numberOne = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("invalid input. enter the first integer again: ");
                scanner.nextLine();
            }
        } while (true);

        do {
            System.out.print("enter the second integer: ");
            try {
                numberTwo = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("invalid input. enter the second integer again: ");
                scanner.nextLine();
            }
        } while (true);

        sum = numberOne + numberTwo;
        System.out.println("sum = " + sum);

        scanner.close();
    }
}
