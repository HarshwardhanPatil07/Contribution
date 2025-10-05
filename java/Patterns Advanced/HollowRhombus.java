public class HollowRhombus {
    public static void main(String args[]) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = n - i; j >= 1; j--) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || j == n || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}