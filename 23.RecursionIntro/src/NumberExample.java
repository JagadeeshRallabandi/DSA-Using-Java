

public class NumberExample {
    public static void main(String[] args) {
        printl(1);
    }
    static void printl(int n){
        System.out.println(n);
        if(n<10) {
            printl(n + 1);
        }
    }
}
