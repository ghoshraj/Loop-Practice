package loop.com;

import java.util.Scanner;

public class SumOfEvenOdddigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number -->");
        int n = sc.nextInt();
        int esum = 0;
        int osum = 0;
        int a ;
        while (n > 0){
            a = n % 10;
            if (a % 2 == 0){
                esum+= a;
            }
            else {
                osum+= a;
            }
            n = n/10;
        }
        System.out.println(esum);
        System.out.println(osum);
    }
}
