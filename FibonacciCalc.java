public class FibonacciCalc {
    public static long fibonacci(int i) {
        if(i <= 1)
            return i;
        //call thr function of x^n = x^n-1 + x^n-2
        return fibonacci(i-1) + fibonacci(i-2);
    }
    public static void main(String[] args) {
        for (int i=0; i<=10;i++){
            System.out.println(fibonacci(i));
        }

    }
}
