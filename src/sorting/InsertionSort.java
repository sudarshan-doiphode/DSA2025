package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        insertionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
        char c ='A';
        System.out.println(Character.toLowerCase(c));
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

}
