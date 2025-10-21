import java.util.Scanner;

public class HelloAndInput {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome, " + name + "!");
        sc.close();
    }
}
