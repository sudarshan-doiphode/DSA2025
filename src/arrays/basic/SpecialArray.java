package arrays.basic;

public class SpecialArray {
    /*
     * An array is considered special if the parity of every pair of adjacent elements is different.
     * In other words, one element in each pair must be even, and the other must be odd.
     */
    public static void main(String[] args) {
        int[] arr = {2, 1, 4};
        /*
         * There is only two pairs: (2,1) and (1,4), and both of them contain numbers with different parity.
         * So the answer is true.
         */
        boolean special = isSpecial(arr, arr.length);
        System.out.println(special);
    }

    static boolean isSpecial(int[] arr, int n) {
        boolean flag = false;
        if (arr == null || n == 0) return false;
        if (n == 1) return true;
        if (n > 1) {
            int temp1 = 0;
            int temp2 = 1;
            while (temp2 < n) {
                if ((arr[temp1] % 2 == 0 && arr[temp2] % 2 != 0) || (arr[temp2] % 2 == 0 && arr[temp1] % 2 != 0)) {
                    flag = true;
                    temp1++;
                    temp2++;
                } else {
                    return false;
                }
            }
        }
        return flag;
    }
}
