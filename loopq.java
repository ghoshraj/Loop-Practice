package loop.com;

import java.util.Scanner;

public class loopq {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = " ";
        int i;
        int fact = 1;
        for (i = 1; i <= n; i++){
            a = a + i;
            if(i < n)
                a = a + "*";
            fact = fact * i;

        }
        System.out.println(a + " = " + fact);
    }
}
