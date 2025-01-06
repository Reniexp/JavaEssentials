import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Type the second number you want to add: ");
        int n2 = scanner.nextInt();

        int n3 = n1 + n2;
        System.out.println("The sum of " + n1 + " and " + n2 + " is: " + n3);
    }
}