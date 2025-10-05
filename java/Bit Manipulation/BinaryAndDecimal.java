// TonyStark-19 - bit manipulation files 4 Cctober 2025
import java.util.Scanner;

public class BinaryAndDecimal {
    public static void calculateBinary(int n) {
        StringBuilder binary = new StringBuilder();
        while (n != 0) {
            int r = (n & 1); // last bit
            binary.append(r);
            n = n >> 1; // shift right
        }
        System.out.println(binary.reverse());
    }

    public static void calculateDecimal(int n) {
        int Decimal = 0, i = 0;

        while (n != 0) {
            int r = n % 10; // last digit
            Decimal += (r << i); // add 2^i * r ( 1 << i means 2^i)
            n = n / 10;
            i++;
        }
        System.out.println(Decimal);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Binary to Decimal : ");
        System.out.println("2. Decimal to Binary : ");
        System.out.print("Choose one option : ");
        int option = sc.nextInt();

        if (option == 1) {
            System.out.print("Enter the binary number : ");
            int n = sc.nextInt();

            System.out.print("Decimal to Binary : ");
            calculateDecimal(n);
        } else if (option == 2) {
            System.out.print("Enter the decimal number : ");
            int n = sc.nextInt();

            System.out.print("Decimal to Binary : ");
            calculateBinary(n);
        }

        sc.close();
    }
}