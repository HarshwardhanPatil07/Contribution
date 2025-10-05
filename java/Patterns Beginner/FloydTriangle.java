public class FloydTriangle {
    public static void main(String args[]) {
        int n = 5, number = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.err.println();
        }
    }
}