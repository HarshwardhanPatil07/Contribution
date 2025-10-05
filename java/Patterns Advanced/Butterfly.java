public class Butterfly {
    public static void main(String args[]) {
        int n = 4;

        // upper half
        for (int i = 1; i <= n; i++) {
            // first part
            for (int j = 1; j <= i; j++) {
                System.err.print("* ");
            }

            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // seond part
            for (int j = 1; j <= i; j++) {
                System.err.print("* ");
            }

            System.out.println();
        }

        // lower half
        for (int i = n; i >= 1; i--) {
            // first part
            for (int j = 1; j <= i; j++) { 
                System.err.print("* ");
            }

            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // seond part
            for (int j = 1; j <= i; j++) {
                System.err.print("* ");
            }

            System.out.println();
        }
    }
}