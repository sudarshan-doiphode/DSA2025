package recursion.basic;

public class PrintNumbersFrom1ToN {
    public static void main(String[] args) {
        printNumbers(1, 10);
    }

    private static void printNumbers(int start, int end){
        if(start == end) return;
        System.out.print(start +" ");
        printNumbers(++start, end);
    }
}
