import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Making a calculator by using Switch ststement

        System.out.println("Eante number a : ");
        int a = sc.nextInt();
        System.out.println("Enter number b : ");
        int b = sc.nextInt();
        System.out.println("Enter your operator : ");
        char operator = sc.next().charAt(0);
        System.out.println("your number is : ");

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
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("you have entered wrong operator");
        }

    }
}
