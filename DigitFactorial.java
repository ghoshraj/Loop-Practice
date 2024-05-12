package loop.com;

import java.util.Scanner;

public class DigitFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number -->");
        int n = sc.nextInt();
        while (n > 0){
            int fact = 1;
            int r = n % 10;
            for (int i = 1; i <= r; i++) {
                fact = fact * i;
            }
            System.out.println(r + " " + fact);
            n = n / 10;
        }
    }
}
