import java.util.Scanner;

public class ToggleBit {
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
        System.out.print("Enter the position : ");
        int position = sc.nextInt();

        int bitMask = 1 << position;

        int newNumber = n ^ bitMask;

        System.out.println("New number is : " + newNumber);
        System.out.print("New number in binary : ");
        calculateBinary(newNumber);

        sc.close();
    }
}