import java.util.*;

public class linearSearch {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key value :");
        int key = sc.nextInt();

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Key Value Not Found");
        } else {
            System.out.println("Key at index : " + index);
        }

    }
}
