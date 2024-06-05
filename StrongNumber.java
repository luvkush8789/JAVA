public class StrongNumber {

    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static boolean isStrong(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        int number = 145;

        if (isStrong(number))
            System.out.println(number + " is a strong number.");
        else
            System.out.println(number + " is not a strong number.");
    }
}
