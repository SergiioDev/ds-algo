package leetocde.easy;

class PalindromeTwo {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
        }
        return true;
    }
    private boolean isPalindrome(String str, int s, int t) {

        while (s <= t) {

            if (str.charAt(s) == str.charAt(t)) {
                s++;
                t--;

            } else
                return false;
        }

        return true;
    }
}
