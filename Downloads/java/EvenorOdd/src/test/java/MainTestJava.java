import java.util.Scanner;

public class Main {

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.println(num + (isEven(num) ? " is even." : " is odd."));

        scanner.close();
    }
}
