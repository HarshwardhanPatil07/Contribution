import java.util.Scanner;

public class GetBit {
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
        System.out.print("Enter the position : ");
        int position = sc.nextInt();

        int bitMask = 1 << position;

        if ((bitMask & n) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }

        System.out.print("You can confirm here: ");
        calculateBinary(n);

        sc.close();
    }
}