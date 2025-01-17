package recursion.basic;

public class PrintName5Times {
    public static void main(String[] args) {
        printName(5);
    }

    public static void printName(int n){
        if(n==0) return;
        System.out.println("Sudarshan");
        printName(--n);
    }
}
