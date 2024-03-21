public class Overloading {

    // Calculate sum of 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Calculate sum of 3 numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 50, 100));

    }
}
