public class NumberPyramid {
    public static void main(String args[]) {
        int n = 5, number = 1;

        for (int i = 1; i <= n; i++) {
            // space
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }

            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
            }
            number++;
            System.out.println();
        }
    }
}