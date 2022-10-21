package leetocde.easy;

class ReverseString {
    public void reverseString(char[] s) {
        int j = 0, i = s.length - 1;
        while (j <= i) {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            j++;
            i--;
        }
    }
}