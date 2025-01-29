package arrays.basic;

import java.util.Arrays;

// TC -> O(n), SC-> O(1)
public class MoveAllZerosAtEnd {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 2, 3, 4, 0, 0, 5, 6, 0, 7};

        moveAllZerosAtEndInPlace(arr);

        Arrays.stream(arr).forEach(s-> System.out.print(s+" "));
    }

    static void moveAllZerosAtEndInPlace(int[] arr){
        int j=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        if(j==-1) return;

        for (int i = j+1; i < arr.length; i++) {
            if(arr[i]!=0){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
}
