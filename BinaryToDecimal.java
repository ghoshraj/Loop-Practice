package loop.com;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number :");
        //logic = ex=101 = 1^2+0^2+1^2
        int n = sc.nextInt();
        int decimal = 0;
        int i = 1;
        while (n > 0){
            decimal = decimal + (n % 10 ) * i;
            i = i * 2;
            n = n / 10;
        }
        System.out.println(decimal);
    }
}
