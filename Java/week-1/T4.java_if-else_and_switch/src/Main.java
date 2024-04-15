import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println(" please enter a number between 1 and 7 for the required weekday (1 is for  sunday, 2 is for monday, ...etc.)");

        int day = myObj.nextByte();

        if (day < 1 || day > 7){
            System.out.println("Invalid day number");
        }
        else {
            switch (day) {
                case 1: System.out.println("Sunday"); break;
                case 2: System.out.println("Monday"); break;
                case 3: System.out.println("Tuesday"); break;
                case 4: System.out.println("Wednesday"); break;
                case 5: System.out.println("Thursday"); break;
                case 6: System.out.println("Friday"); break;
                case 7: System.out.println("Saturday"); break;

            }
        }
    }
}