public class HollowButterfly {
    public static void main(String args[]) {
        int n = 5;

        // upper half
        for (int i = 1; i <= n; i++) {
            // first part
            for (int j = 1; j <= i; j++) {
                if (i == j || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // second part
            for (int j = 1; j <= i; j++) {
                if (i == j || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        // lower half
        for (int i = n; i >= 1; i--) {
            // first part
            for (int j = 1; j <= i; j++) {
                if (i == j || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // second part
            for (int j = 1; j <= i; j++) {
                if (i == j || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}