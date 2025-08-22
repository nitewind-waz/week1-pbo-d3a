import java.util.Scanner;

public class Soal1P2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah test case:");
        int T = input.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.print("Masukkan input ke-"+ (i + 1) +": ");
            String beforeParsed = input.next();

            try {
                Long n = Long.parseLong(beforeParsed);
                System.out.println(n + " Can  be fitted in: ");
                if (n <= Byte.MAX_VALUE && n >= Byte.MIN_VALUE) {
                    System.out.println ("-> Byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println ("-> Short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println ("-> Integer");
                }
                if (n > Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println ("-> Long");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input can't be fitted...");
            } 
        }
    }
}