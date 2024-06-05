public class BinaryToDecimal {
    // Binary To Decimal

    // public static void binToDec(int binNum) {
    // int myNum = binNum;
    // int pow = 0;
    // int decNum = 0;
    // while (binNum > 0) {
    // int lastDigit = binNum % 10;
    // decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

    // pow++;
    // binNum = binNum / 10;
    // }

    // System.out.println("decimal of " + myNum + " = " + decNum);
    // }

    // public static void binToDec(int binNum) {
    // int myNum = binNum;
    // int pow = 0;
    // int decNum = 0;
    // while (binNum > 0) {
    // int lastDigit = binNum % 10;
    // decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

    // pow++;
    // binNum = binNum / 10;
    // }
    // System.out.println("decimal of " + myNum + " = " + decNum);
    // }

    // public static void binToDec(int binNumm) {
    // int myNum = binNumm;
    // int pow = 0;
    // int decNum = 0;
    // while (binNumm > 0) {
    // double lastDigit = binNumm % 10;
    // decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

    // pow++;
    // binNumm = binNumm / 10;

    // }
    // System.out.println("decimal of " + (int) +myNum + " = " + decNum);

    // }

    // public static void main(String[] args) {
    // // binToDec(101);
    // binToDec(101);

    // }

    // Decimal To Binary

    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));

            pow++;
            n = n / 2;
        }
        System.out.println(" Binary form of " + myNum + "=" + binNum);
    }

    public static void main(String[] args) {
        decToBin(11);
    }
}
