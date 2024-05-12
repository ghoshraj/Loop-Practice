package loop.com;

import java.util.Scanner;

public class MultipicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number -->");
        int n = sc.nextInt();
        System.out.println("Enter the limit -->");
        int limit = sc.nextInt();
        int result;
        for (int i = 1; i <= limit; i++){
            result = n * i;
            System.out.println(n + " * "+ i + " = " + result);
        }
    }
}
