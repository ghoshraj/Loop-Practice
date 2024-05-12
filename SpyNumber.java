package loop.com;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number -->");
        int a = sc.nextInt();
//        int product = 1;
//        int sum = 0;
//        int m = a;
//        while (a > 0){
//            int r = a % 10;
//            product = product * r;
//            sum = sum + r;
//            a = a/10;
//        }
//        if (product == sum)
//            System.out.println(m + " is a spy number");
//        else
//            System.out.println(m + " is not a spy number");
        int b = sc.nextInt();
        for (int i = a; i <=b; i++){
            int temp = i;
            int sum = 0;
            int product = 1;
            while (temp > 0){
                int reminder = temp % 10;
                sum += reminder;
                product *= reminder;
                temp = temp/10;
            }
            if (sum == product){
                System.out.println(i);
            }
        }
    }
}
