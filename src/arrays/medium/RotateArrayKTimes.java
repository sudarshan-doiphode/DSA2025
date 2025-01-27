package arrays.medium;

import java.util.Arrays;

public class RotateArrayKTimes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        int[] ints = approach1(arr, 3);
//        Arrays.stream(ints).forEach(System.out::println);

        approach2(arr, arr.length, 2);
        Arrays.stream(arr).forEach(s-> System.out.print(s +" "));

    }

    private static void approach2(int[] arr, int n, int k) {
        k = k % n;
        reverseArray(arr, 0, n-k-1);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-1);
    }

    static void reverseArray(int[] arr, int l, int h){
        while(l<=h){
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;
        }
    }

    private static int[] approach1(int[] arr, int k) {
        k = k % arr.length;
        int[] ans = new int[arr.length];
        int j = 0;
        for (int i = arr.length - k; i < arr.length; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < arr.length - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }
}
