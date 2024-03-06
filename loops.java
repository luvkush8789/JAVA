import java.util.*;

public class loops {
    public static void main(String[] args) {
        // While Loop
        // print hello world 100 times by using while loop

        // int counter = 0;
        // while (counter < 100) {
        // System.out.println("Hello world!");
        // counter++;
        // }
        // System.out.println("Hello world printed 100 times");

        // print 1 to 10 numbers

        // int counter = 1;
        // while (counter < 11) {
        // System.out.println(counter);
        // counter++;

        // }
        // System.out.println("number 1 to 10 printed ");

        // Print 1 to N numbers
        Scanner sc = new Scanner(System.in);
        // int counter = 1;
        // System.out.print("enter your range number : ");
        // int n = sc.nextInt();
        // System.out.println("your tota number is : ");
        // while (counter <= n) {
        // System.out.println(counter);
        // counter++;
        // }
        // System.out.println(" the number is printed");

        // print sum of first natural numbers
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("the sum is : " + sum);

    }

}
