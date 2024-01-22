import java.util.*;

// Q1 :  In a program, input 3 numbers : A, B and C. You have to output the average of
// these 3 numbers. (Hint : Average of N numbers is sum of those numbers divided by N)

public class exercise {
    public static void main(String[] args) {

        // 1st method

        // int a = 55;
        // int b = 33;
        // int c = 77;
        // int average = (a + b + c) / 3;
        // System.out.println("the average of three number is : \n" + average);

        // 2nd method

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number");
        // int a = sc.nextInt();
        // System.out.println("Enter second number");
        // int b = sc.nextInt();
        // System.out.println("Enter third number");
        // int c = sc.nextInt();
        // int avg = (a + b + c) / 3;
        // System.out.println("The average of three number is : " + avg);

        // Q2: In a program, input the side of a square. You have to output the area of
        // the
        // square.
        // (Hint : area of a square is (side x side))

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter side of square");
        // int side = sc.nextInt();
        // int area = (side) * 2;
        // System.out.println("The area of square is : " + area);

        // Q:3: Enter cost of 3 items from the user (using float data type) - a pencil,
        // a pen and
        // an eraser. You have to output the total cost of the items back to the user as
        // their bill.
        // (Add on : You can also try adding 18% gst tax to the items in the bill as an
        // advanced problem)

        Scanner sc = new Scanner(System.in);
        System.out.println("Price of pencil is :");
        float pencil = sc.nextFloat();
        System.out.println("Price of pen is :");
        float pen = sc.nextFloat();
        System.out.println("Price of eraser is :");
        float eraser = sc.nextFloat();
        float total = (pencil + pen + eraser) + ((pencil + pen + eraser) * 0.18f) / 100;
        System.out.println("Your total price is : " + total);

    }
}
