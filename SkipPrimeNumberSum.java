package loop.com;

import java.util.Scanner;

public class SkipPrimeNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0;
        int count = 0;
        if(n1 == 1){
            System.out.println("This is not a prime number");
        }
        for (int i = n1; i <= n2; i++){
            for (int j = 2; j <=i/2; j++){
                if (i % j != 0)
                    count++;
                if (count % 2 != 0){
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}
