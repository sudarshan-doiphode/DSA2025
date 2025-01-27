package arrays.basic;

import java.util.Arrays;

public class RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        int[] arr ={1,1,1,2,3,4,5,6,6,6};
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[i-1]){
                arr[++j]=arr[i];
            }
        }

        System.out.println(j);

        Arrays.stream(arr).forEach(s-> System.out.print(s+" "));
    }
}
