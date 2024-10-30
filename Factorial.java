public class Solution {

    public static int reverse(int x) {
        int num = 0, rem = 0;
        while (x != 0) {
            rem = x % 10;
            num = (num * 10) + rem;
            x /= 10;
        }
        return num;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        return x == reverse(x);
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println("Is " + x + " a palindrome? " + isPalindrome(x));
    }
}
