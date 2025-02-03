package string;

import java.util.HashMap;
import java.util.Map;

public class CheckIfStringIsGood {
    public static void main(String[] args) {
        String s = "tveixwaeoezcf";
        // String can be considered as good if it contains same number of each character
        boolean flag = isGood(s.toCharArray());
        System.out.println(flag);
    }

    static boolean isGood(char[] arr) {
        boolean flag = false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int val1 = map.get(arr[0]);
        for (Map.Entry<Character, Integer> ele : map.entrySet()) {
            if (val1 == ele.getValue()) flag = true;
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
