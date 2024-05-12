package loop.com;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextByte();
        int b = n * n;
        if (n == b % 10){
            System.out.println("This is a automorphic number .....");
        }
        else {
            System.out.println("This is not a automorphic number.....");
        }
    }
}
