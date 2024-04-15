import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int x = myObj.nextInt();

        System.out.println("Please enter the second number");
        int y = myObj.nextInt();

        System.out.println("Addition: "  + (x + y));
        System.out.println("Subtraction: " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        if (y == 0) {
            System.out.println("Can't perform division, second number is 0");
        }
        else {
            System.out.println("Division: " + ((float)x / (float) y));
        }
    }
}