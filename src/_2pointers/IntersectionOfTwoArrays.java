package _2pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 5, 6, 7, 8, 9};
        int[] ans = intersectionOfTwoArrays(array1, array2, array1.length, array2.length);
        Arrays.stream(ans).forEach(System.out::println);
    }

    static int[] intersectionOfTwoArrays(int[] array1, int[] array2, int m, int n) {
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();

        while (i < m && j < n) {
            if(array1[i]!=array2[j]){
                i++;
            }
            else if(array1[i]==array2[j]){
                list.add(array1[i]);
                i++;
                j++;
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
