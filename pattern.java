public class pattern {
    public static void main(String[] args) {
        // Print star pattern
        // for (int lines = 1; lines <= 4; lines++) {
        // for (int j = 1; j <= lines; j++) {
        // System.out.print("*");
        // }
        // System.out.println("");

        // }

        // print inverted star pattern

        // int n = 5;

        // for (int lines = 1; lines <= n; lines++) {
        // for (int star = 1; star <= n - lines + 1; star++) {
        // System.out.print("*");
        // }
        // System.out.println(" ");
        // }

        // Print Character Pattern

        int n = 5;
        char ch = 'A';

        for (int lines = 1; lines <= n; lines++) {
            for (int chars = 1; chars <= lines; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
