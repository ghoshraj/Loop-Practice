package loop.com;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 111;
        int temp = num;
        int sum = 0;
        while (temp > 0 ){
            int r = temp % 10;
            sum = (sum * 10 ) + r;
            temp = temp/ 10;
        }
        if (num == sum){
            System.out.println("this is a palindrome number");
        }
        else {
            System.out.println("This is not a palindrome number");
        }
    }
}
