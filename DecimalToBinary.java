package loop.com;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int i = 1;
        int ans = 0;
        while (n > 0){
           int reminder = n % 2;
            ans = reminder * i + ans;
            n = n/2;
            i = i * 10;
        }
        System.out.println(ans);
    }
}
