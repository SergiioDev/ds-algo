package leetocde.easy;

class PalindromeTwo {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right){
            if (s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            } else {
                return isPalindrome(s, left+1, right) || isPalindrome(s, left, right -1);
            }
        }
        return true;
    }

    private static boolean isPalindrome(String str, int left, int right) {
        while (left <= right){
            if (str.charAt(left) == str.charAt(right)){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
