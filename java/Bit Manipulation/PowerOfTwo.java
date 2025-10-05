import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();

        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println("Your number " + n + " is a power of 2");
        } else {
            System.out.println("Your number " + n + " is not a power of 2");
        }

        sc.close();
    }
}