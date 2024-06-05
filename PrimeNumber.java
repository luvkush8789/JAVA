public class PrimeNumber {

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void primeInRange(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // prime numbers between 2 to 20 in range
        primeInRange(20);
        // System.out.println(isPrime(11));

    }
}
