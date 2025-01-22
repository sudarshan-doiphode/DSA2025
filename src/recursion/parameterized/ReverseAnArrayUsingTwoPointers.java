package recursion.parameterized;

import java.util.Arrays;

public class ReverseAnArrayUsingTwoPointers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseAnArray(0, arr.length-1, arr);
        Arrays.stream(arr).forEach(e-> System.out.print(e+ " "));
    }

    private static void reverseAnArray(int left, int right, int[] arr) {
        if(left>= right) return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right]=temp;
        reverseAnArray(left+1, right-1,arr);
    }
}
