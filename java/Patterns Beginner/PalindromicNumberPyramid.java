public class PalindromicNumberPyramid {
    public static void main(String args[]) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // space
            for (int j = n - i; j >= 1; j--) {
                System.out.print("  ");
            }

            // number
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}