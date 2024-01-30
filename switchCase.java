import java.util.*;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter a number");
        // int number = sc.nextInt();

        // switch (number) {
        // case 1:
        // System.out.println("Samosa");
        // break;
        // case 2:
        // System.out.println("momos");
        // break;
        // case 3:
        // System.out.println("chicken");
        // break;
        // case 4:
        // System.out.println("burger");
        // break;
        // case 5:
        // System.out.println("roll");
        // break;
        // default:
        // System.out.println("the shop will be open start soon");

        // }

        // EXERCISE BY USING IF ELSE CONDITION AND SWITCH CASE CONDITION

        // Q1 : Write a Java program to get a number from the user and print whether it
        // is positive or negative.

        // System.out.println("Enter a number");
        // int number = sc.nextInt();
        // if (number > 0) {
        // System.out.println("it is a positive number");

        // }

        // else {
        // System.out.println("it is a negative number");
        // }

        // Q2 : Finish the following code so that it prints You have a fever if your
        // temperature is above 100 and otherwise prints You don't have a fever.

        // System.out.println("The temperature is : 100 ");
        // double temp = 99.00;

        // if (temp >= 100.00) {
        // System.out.println(" You have a fever ");
        // }

        // else {
        // System.out.println(" you dont have a fever ");
        // }

        // Q3 : Write a Java program to input week number(1-7) and print day of week
        // name using switch case.

        // int weeks = sc.nextInt();
        // switch (weeks) {
        // case 0:
        // System.out.println("Sunday");
        // break;
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // default:
        // System.out.println("You hav entered wrong input");
        // }

        // Write a Java program that takes a year from the user and print whether that
        // year is a leap year or not.
        System.out.println("Enter a year");
        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z)) {
            System.out.println(year + " is a leap year ");

        } else {
            System.out.println(year + " is not a leap year ");
        }

    }
}
