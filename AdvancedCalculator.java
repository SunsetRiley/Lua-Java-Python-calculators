package Calculators;
import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to [Your Name]'s Advanced Java Calculator");

        System.out.println("Please enter the first number.");
        double num1 = scanner.nextDouble();
        System.out.println("You entered " + num1);

        System.out.println("Please enter the second number.");
        double num2 = scanner.nextDouble();
        System.out.println("You entered " + num2);

        System.out.println("Please enter the operators +, -, *, /, ^, V (For square root) or % of.");
        System.out.println("NOTE: If you are doing √ as the operator, it will use the first number you inputted.");
        char operator = scanner.next().charAt(0);
        System.out.println("Calculating " + num1 + " " + operator + " " + num2 + "...");

        if (num1 < 0 && (operator == 'V' || operator == 'v')) {
            System.out.println("Error: The number being used to square root is negative, which is not allowed.");
            return;
        }

        if (num2 == 0 && operator == '/') {
            System.out.println("Cannot divide by 0");
            return;
        }

        double result = 0; // Initialize result to avoid compilation error

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
            case 'V':
            case 'v':
                result = Math.sqrt(num1);
                break;
            case '%':
                result = (num1 * num2) / 100;
                break;
            default:
                System.err.println("Error: " + operator + " is not a valid operator. Please enter the operator +, -, *, /, ^, or V.");
                return;
        }

        System.out.println("Final result: " + result);
        System.out.println("Made by @SunsetRiley5");
    }
}