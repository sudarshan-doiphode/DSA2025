package arrays.basic;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr ={1,1,2,3,3,4,4};
        singleNumberApproach1(arr);
        int result = singleNumberApproach2(arr);
        System.out.println(result);
    }

    private static void singleNumberApproach1(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()==1) {
                System.out.println("Value which appears once is : "+ entry.getKey());
                break;
            }
        }
    }

    static int singleNumberApproach2(int[] arr){
        int xor =0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor^arr[i];
        }
        return xor;
    }
}
