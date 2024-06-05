public class Overloading {

    // Function Overloading by using different parameters

    // Calculate sum of 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Calculate sum of 3 numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Function Overloading by using different DataTypes

    public static int Calculate(int a, int b) {
        return a + b;
    }

    public static float Calculate(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Function Overloading by using different parameters
        // System.out.println(sum(10, 20));
        // System.out.println(sum(10, 50, 100));

        // Function Overloading by using different dataTypes
        System.out.println(Calculate(10, 20));
        System.out.println(Calculate(10, 10));

    }
}
