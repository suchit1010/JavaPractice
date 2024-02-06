import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter the second number: ");
        float b = sc.nextFloat();
        System.out.print("Enter the operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    System.out.println(a / b);
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Error: Modulo by zero");
                } else {
                    System.out.println(a % b);
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
        }
    }
}

