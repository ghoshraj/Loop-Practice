package loop.com;

import java.util.Scanner;

public class Prime_Number_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start number : ");
        int a = sc.nextInt();
        System.out.println("Enter ending number : ");
        int b = sc.nextInt();
        boolean flag;
        for (int i = a; i <= b; i++){
            if (i <= 1) {
                continue;
            }
            flag = true;
            for (int j = 2; j <= i / 2; j++){
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println(i);
        }
    }
}
