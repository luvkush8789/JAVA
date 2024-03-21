import java.util.*;

public class Function {
    // function for prinnt the hello world
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    // function for calculating the sum

    public static void calculate(int a, int b) {

        int sum = a + b;
        System.out.println("Sum of the number is : " + sum);
    }

    public static void swap(String a, String b) {
        String temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b= " + b);

    }

    public static int product(int a, int b) {
        int multi = a * b;

        return multi;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;

        }
        return f;
    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;

    }

    public static int bincoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;
    }

    public static void main(String[] args) {
        // sum of a two numbers

        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // calculate(a, b);

        // Exchange the value of a number
        // String a = "Luvkush";
        // String b = "kumar";

        // // Swap the numbers
        // swap(a, b);

        // int a = 3;
        // int b = 8;
        // int prod = product(a, b);
        // System.out.println("product of a number is : " + prod);
        // prod = product(3, 5);
        // System.out.println("product of a number is : " + prod);

        // int fac = factorial(10);
        // System.out.println(fac);

        // System.out.println("factorial of a number is : " + factorial(10));

        // find a binomial cofficient
        System.out.println(bincoeff(5, 2));

        // Average of an three number
        // System.out.print("Enter first number :");
        // double a = sc.nextDouble();
        // System.out.print("Enter second number :");
        // double b = sc.nextInt();
        // System.out.print("Enter third number :");
        // double c = sc.nextDouble();
        // System.out.print("The average value is " + average(a, b, c) + "\n");

    }
}
