package _2pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int[] brr = {1, 2, 5, 6, 7};
        int m = arr.length, n = brr.length;
        int[] ints = unionOfArray(arr, brr, m, n);
        Arrays.stream(ints).forEach(System.out::println);
    }

    static int[] unionOfArray(int[] a, int[] b, int m, int n) {
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
                    list.add(a[i]);
                }
                i++;
            } else if (a[i] > b[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != b[j]) {
                    list.add(b[j]);
                }
                j++;
            } else if (a[i] == b[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
                    list.add(a[i]);
                }
                i++;
                j++;
            }
        }

        while (i < m) {
            if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
                list.add(a[i]);
            }
            i++;
        }

        while (j < n) {
            if (list.isEmpty() || list.get(list.size() - 1) != a[j]) {
                list.add(a[j]);
            }
            j++;
        }


        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
