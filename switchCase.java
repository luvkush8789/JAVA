import java.util.*;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("momos");
                break;
            case 3:
                System.out.println("chicken");
                break;
            case 4:
                System.out.println("burger");
                break;
            case 5:
                System.out.println("roll");
                break;
            default:
                System.out.println("the shop will be open start soon");

        }

    }
}
