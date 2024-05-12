package loop.com;

import java.util.Scanner;

public class SumLessthenSingeleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ---> ");
        int n = sc.nextInt();
        int a;
        int sum = 0;
        //---------1st approach----------
        do{
           while (n > 0){
               a = n % 10;
               sum+=a;
               n = n /10;
           }
            System.out.println(sum);
           n = sum;
           sum = 0;
        }
        while (n>9);
        System.out.println(sum);

        //----------2nd approach--------------
//        while (n > 0){
//            a = n % 10;
//            sum = sum + a;
//            n = n /10;
//            if (n == 0 && sum > 9){
//                System.out.println(sum);
//                n = sum;
//                sum = 0;
//            }
//        }
//        System.out.println(sum);
    }
}
