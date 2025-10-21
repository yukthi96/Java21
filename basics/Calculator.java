import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b) { return a + b; }
    public static double sub(double a, double b) { return a - b; }
    public static double mul(double a, double b) { return a * b; }
    public static double div(double a, double b) { if (b == 0) throw new ArithmeticException("Division by zero"); return a / b; }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Operation (add/sub/mul/div): ");
            String op = sc.next();
            System.out.print("Enter a: ");
            double a = sc.nextDouble();
            System.out.print("Enter b: ");
            double b = sc.nextDouble();
            double res = switch (op) {
                case "add" -> add(a,b);
                case "sub" -> sub(a,b);
                case "mul" -> mul(a,b);
                case "div" -> div(a,b);
                default -> throw new IllegalArgumentException("Unknown op: " + op);
            };
            System.out.println("Result: " + res);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
