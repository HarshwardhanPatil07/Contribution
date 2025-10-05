public class InvertedHalfPyramid2 {
    public static void main(String args[]) {
        int n = 4, number = 1;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
            }
            number++;
            System.out.println();
        }
    }
}