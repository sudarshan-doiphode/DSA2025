package binarysearch;

public class FindTheTargetInDistinctElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        int target = 4;
        System.out.println(findTargetIndex(arr, target));
    }

    static int findTargetIndex(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            else if (target < arr[mid]) {
                high--;
            } else low++;
        }
        return -1;
    }
}
