package loop.com;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ---> ");
        int n = sc.nextInt();
        int a;
        int sum = 0;
        while (n > 0){
            a = n % 10;
            System.out.println(a);
            sum = sum + a;
            n = n /10;
        }
        System.out.println(sum);
    }
}
