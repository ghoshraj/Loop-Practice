package loop.com;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int m = num;
        int count = 0;
        int sum = 0;
        while (m > 0){
            count++;
            m = m/10;
        }
        m = num;
        while (m > 0){
            int reminder = m % 10;
            int product = 1;
            for (int i = 1 ; i <= count; i++){
                product = product * reminder;
            }
            sum = sum + product;
            m = m /10;
        }
        if (sum == num){
            System.out.println(num + " is a Armstrong number");
        }
        else {
            System.out.println(num + " is not a armstrong number");
        }
    }
}
