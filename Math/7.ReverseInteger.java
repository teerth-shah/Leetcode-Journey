class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int original = x;
        int rev = 0;

        for (; x > 0; x /= 10) {
            int digit = x % 10;
            rev = rev * 10 + digit;
        }

        return original == rev;
    }
}