package _2pointers;

import java.util.Arrays;

public class Arrange0And1s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1};
        arrange0sAnd1s(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void arrange0sAnd1s(int[] arr, int left, int right) {
        while (left <= right) {
            if (arr[left] == 0) left++;
            if (arr[right] == 1) right--;
            if (arr[left] == 1 && arr[right] == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
