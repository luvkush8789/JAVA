import java.util.*;

public class forloop {
    public static void main(String[] args) {
        // for (int i = 1; i <= 10; i++) {
        // System.out.println("hello world!");
        // }

        // Print Square pattern
        // for (int lines = 1; lines <= 5; lines++) {
        // System.out.println("*****");
        // }

        // print the reverse number
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your number");
        // int n = 10899;
        // int rev = 0;

        // while (n > 0) {
        // int lastdigit = n % 10;
        // rev = (rev * 10) + lastdigit;
        // n = n / 10;
        // }
        // System.out.println(rev);

        // int n = 50987;
        // int rev = 0;
        // while (n > 0) {
        // int lastdigit = n % 10;
        // rev = (rev * 10) + lastdigit;
        // n = n / 10;
        // }
        // System.err.println(rev);

        // Do while loop

        // int counter = 1;

        // do {
        // System.out.println("hello world");
        // counter++;

        // } while (counter <= 10);

        // break statement

        // for (int i = 1; i <= 5; i++) {
        // if (i > 5) {
        // break;
        // }
        // System.out.println(i);

        // }
        // System.out.println("i am out of the loop");

        // print entering the number until the user enter multiple of 10

        Scanner sc = new Scanner(System.in);

        // do {
        // System.out.print("enter your number");
        // int n = sc.nextInt();
        // if (n % 10 == 0) {
        // break;

        // }
        // System.out.println(n);
        // } while (true);

        // Continue Statement

        // int a = 20;
        // for (int i = 1; i <= 20; i++) {
        // if (i >= 5 && i <= 10) {
        // continue;
        // }

        // System.out.println(i);
        // }

        // print entering the number until the except multiple of 10

        // do {
        // System.out.print("enter a number ");
        // int a = sc.nextInt();
        // if (a % 10 == 0) {
        // continue;
        // }
        // System.out.println(a);
        // } while (true);

        // int a = sc.nextInt();
        // for (int i = 1; i <= a; i++) {
        // if (a % 10 == 0) {
        // continue;
        // }
        // System.out.println(i);
        // }

        // cheak if a number is prime or not

        // int n = sc.nextInt();
        // if (n == 2) {
        // System.out.println("2 is a prime number");
        // } else {
        // boolean isPrime = true;
        // for (int i = 2; i <= n - 1; i++) {
        // if (n % i == 0) {
        // isPrime = false;

        // }
        // }

        // if (isPrime == true) {
        // System.out.println(n + " " + " is a prime number");
        // } else {
        // System.out.println(n + " " + " is not a prime number");
        // }
        // }

        for (int i = 3; i <= 30; i = i + 3) {
            System.out.println(i);
        }

    }

}