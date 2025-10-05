import java.util.Scanner;

public class CountOneBit {
    public static void calculateBinary(int n) {
        StringBuilder binary = new StringBuilder();
        while (n != 0) {
            int r = n % 2;
            binary.append(r);
            n /= 2;
        }
        System.out.println(binary.reverse());
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Number in binary : ");
        calculateBinary(n);

        // Brian Kernighan’s Algorithm
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }

        System.out.println("Number of 1 bit is : " + count);

        sc.close();
    }
}