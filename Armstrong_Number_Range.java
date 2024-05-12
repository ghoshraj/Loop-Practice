package loop.com;

import java.util.Scanner;

public class Armstrong_Number_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++){
            int count = 0;
            int temp = i;
            while (temp > 0){
                count++;
                temp = temp/10;
            }
            temp = i;
            int reminder;
            int sum = 0;
            while (temp > 0){
                reminder = temp % 10;
                int product = 1;
                for (int j = 1; j <= count; j++){
                    product *= reminder;
                }
                sum += product;
                temp = temp/10;
            }
           if (sum == i){
               System.out.println(i + " is a strong number");
           }
        }
    }
}
