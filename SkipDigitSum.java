package loop.com;

import java.util.Scanner;

public class SkipDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number --> ");
        //--------------1st approach---------
        int n = sc.nextInt();
        int sum = 0;
        int count = 1;
        int a;
        while (n > 0){
            a = n % 10;
            if (count %2 != 0){
                sum = sum + a;
            }
            n = n /10;
            count++;
        }
        System.out.println(sum);

    }
}
