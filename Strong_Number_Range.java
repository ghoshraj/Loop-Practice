package loop.com;

import java.util.Scanner;

public class Strong_Number_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        for (int i = 10; i <= a; i ++){
            int temp = i;
            int sum =0 ;
            while (temp > 0){
                int r = temp % 10;
                int fact = 1;
                for (int j = 1; j <= r; j++){
                    fact *= j;
                }
                sum +=fact;
                temp = temp/10;

            }
            if (sum == i){
                System.out.println(i + "");
            }
        }
    }
}
