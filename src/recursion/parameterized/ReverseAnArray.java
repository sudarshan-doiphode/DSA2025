package recursion.parameterized;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        reverseArray(arr.length-1, arr);
    }

    private static void reverseArray(int length, int[] arr) {
        if(length<0) {
            return;
        }
        System.out.print(arr[length]+ " ");
        reverseArray(length-1, arr);
    }
}
