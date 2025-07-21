import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        System.out.println("=== Simple Scientific Calculator ===");

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Power (^)");
            System.out.println("6. Square Root (√)");
            System.out.println("7. Log (base 10)");
            System.out.println("8. sin(x)");
            System.out.println("9. cos(x)");
            System.out.println("10. tan(x)");
            System.out.println("11. Use constant Pi or e");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Calculator closed.");
                break;
            }

            double num1 = 0, num2 = 0;

            if (choice >= 1 && choice <= 5) {
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
            } else if (choice >= 6 && choice <= 10) {
                System.out.print("Enter number (in radians for trig): ");
                num1 = scanner.nextDouble();
            }

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0)
                        result = num1 / num2;
                    else
                        System.out.println("Cannot divide by zero.");
                    break;
                case 5:
                    result = Math.pow(num1, num2);
                    break;
                case 6:
                    result = Math.sqrt(num1);
                    break;
                case 7:
                    result = Math.log10(num1);
                    break;
                case 8:
                    result = Math.sin(num1);
                    break;
                case 9:
                    result = Math.cos(num1);
                    break;
                case 10:
                    result = Math.tan(num1);
                    break;
                case 11:
                    System.out.println("Pi = " + Math.PI);
                    System.out.println("e  = " + Math.E);
                    continue;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            if (choice >= 1 && choice <= 10)
                System.out.println("Result = " + result);
        }

        scanner.close();
    }
}
