package loop.com;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 99;
        int temp = num;
        int sum = 0;
        int i = 1;
        while (temp > 0 ){
            int r = temp % 10;
            i = (sum * 10 ) + r;
            sum = sum + r;
            temp = temp/ 10;
        }
        if (num == i){
            System.out.println("this is a palindrome number");
        }
        else {
            System.out.println("This is not a palindrome number");
        }
    }
}
