import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.util.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        } finally {
            System.out.println("Program Execution Completed");
            sc.close();
        }
    }
}
