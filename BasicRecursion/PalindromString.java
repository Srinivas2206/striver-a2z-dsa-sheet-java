package BasicRecursion;

public class PalindromString {
    public boolean palindromeCheck(String s) {
        // your code goes here
        return palindromeHelper(s, 0);
    }

    public boolean palindromeHelper(String s, int n) {
        if (n >= s.length() / 2)
            return true;

        if (s.charAt(n) != s.charAt(s.length() - n - 1)) {
            return false;
        }
        return palindromeHelper(s, n + 1);
    }
}
