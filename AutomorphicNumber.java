package loop.com;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextByte();
        int b = n * n;
        int count = 0;
        int c = n;
        int d = 1;
        while (c > 0){
            count++;
            c = c/10;
        }
        for (int i = 1; i <= count; i++){
            d = d * 10;
        }
        if (n == b % d){
            System.out.println("This is a automorphic number .....");
        }
        else {
            System.out.println("This is not a automorphic number.....");
        }
    }
}
