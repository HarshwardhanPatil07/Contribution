import java.util.Scanner;

public class UpdateBit {
    public static void calculateBinary(int n) {
        StringBuilder binary = new StringBuilder();
        while (n != 0) {
            int r = n % 2;
            binary.append(r);
            n /= 2;
        }
        System.out.println(binary.reverse());
    }

    public static void setBit(int bitMask, int n) {
        int newNumber = bitMask | n;

        System.out.println("New number is : " + newNumber);
        System.out.print("New number in binary : ");
        calculateBinary(newNumber);
    }

    public static void clearBit(int bitMask, int n) {
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;

        System.out.println("New number is : " + newNumber);
        System.out.print("New number in binary : ");
        calculateBinary(newNumber);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Number in binary : ");
        calculateBinary(n);
        System.out.print("Enter the position : ");
        int position = sc.nextInt();
        System.out.print("Enter the operation ( 1 or 0 ) : ");
        int operation = sc.nextInt();

        int bitMask = 1 << position;

        if (operation == 1) {
            setBit(bitMask, n);
        } else if (operation == 0) {
            clearBit(bitMask, n);
        } else {
            System.out.println("Enter valid operation :(");
        }

        sc.close();
    }
}