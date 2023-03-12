public class Demo {
    //Main Method
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        //Method Calls
        int c = sumMethod(a, b);
        display(c);
    }
    //Returns the sum of the two numbers
    public static int sumMethod(int n, int m)
    {
        int sum=0;
        sum= n*m;
        return sum;
    }
    public static void display(int sum)
    {
        System.out.println("This method prints the variable");
        System.out.println("The Sum is = " + sum);
    }
}
