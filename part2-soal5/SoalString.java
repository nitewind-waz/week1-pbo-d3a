import java.util.Scanner;

public class SoalString {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int iteration;

        String A = input.nextLine();
        int lenA = (int) A.length();
        
        String B = input.nextLine();
        int lenB = (int) B.length();

        int sumLen = lenA + lenB;
        System.out.println(sumLen);

        if (lenA < lenB) {
            iteration = lenA;
        } else if (lenA > lenB) {
            iteration = lenB;
        } else {
            iteration = lenA;
        }

        for (int i = 0; i < iteration; i++) {
            if (A.charAt(i) > B.charAt(i)) {
                System.out.println("yes");
                break;
            } else {
                System.out.println("No");
                break;
            }
        }

        String AUpper = A.substring(0, 1).toUpperCase() + A.substring(1);
        String BUpper = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(AUpper+" "+BUpper);
    }

}