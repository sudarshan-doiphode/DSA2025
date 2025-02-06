package arrays.basic;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int result = maxConsecutive1s(arr);
        System.out.println(result);
    }

    static int maxConsecutive1s(int[] arr) {
        int max = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else if (arr[i] != 1) {
                if (max != 0) {
                    max = Math.max(max, count);
                    count = 0;
                } else {
                    max = count;
                    count = 0;
                }
            }
        }
        return Math.max(max, count);
    }
}
