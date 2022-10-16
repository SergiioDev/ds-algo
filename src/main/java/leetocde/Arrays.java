package leetocde;

public class Arrays {

    public static int removeDuplicates(int[] duplicates) {
        int left = 1;

        for (int i = 1; i < duplicates.length; i++) {
            if (duplicates[i] != duplicates[i - 1]) {
                duplicates[left] = duplicates[i];
                left++;
            }
        }
        return left;
    }

}
