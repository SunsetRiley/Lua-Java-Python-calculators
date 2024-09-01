package Calculators;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) throws InterruptedException { //For Thread.sleep();
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        double result = 0;
        char operator;

        System.out.println("Welcome to [Your Name]'s Java Calculator.");
        Thread.sleep(1000);
        System.out.println("Please enter the first number of your choice.");
        num1 = sc.nextDouble();
        System.out.println("You entered: " + num1);
        Thread.sleep(1000);
        System.out.println("Please enter the second number of your choice.");
        num2 = sc.nextDouble();
        System.out.println("You entered: " + num2);
        Thread.sleep(1000);
        System.out.println("Please enter the operator.");
        operator = System.console().readLine(). charAt(0);

        if (operator == '/' && num2 == 0) {
            System.out.println("Cannot divide by 0.");
            return;
        }

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
            default:
            System.out.println("Error: " + operator + " is not a valid operator. Please enter +, -, *, or /.");
            break;
        }
        System.out.println(result);
        System.out.println("Made by @SunsetRiley5");
    }
}
