package arrays.medium;

import java.util.Arrays;

public class LeftRotateArrayByDPlaces {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        /*int[] ints = approach1(arr, arr.length, 10);
        Arrays.stream(ints).forEach(s-> System.out.print(s+" "));*/

        approach2(arr, arr.length, 9);
        Arrays.stream(arr).forEach(s-> System.out.print(s+" "));
    }

    static void approach2(int[] arr, int n, int d){
        d=d%n;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }

    static void reverse(int[] arr, int l, int h){
        while (l<=h){
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;
        }
    }

    static int[] approach1(int[] arr, int n, int d) {
        int[] ans = new int[n];
        d = d % n;
        int j = 0;
        for (int i = d; i < n; i++) {
            ans[j++]=arr[i];
        }
        for (int i = 0; i < d; i++) {
            ans[j++]=arr[i];
        }
        return ans;
    }
}
