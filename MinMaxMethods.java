import java.util.Scanner;
public class MinMaxMethods {
    public static int maxMethod(int num1,int num2,int num3) {
        if (num1>num2 && num3<num1)
            return num1;
        else if
        (num2>num1 && num3<num2)
            return num2;
        else
            return num3;
    }
    public static int minMethod(int num1, int num2, int num3) {
        if (num1 < num2 && num3 < num1)
            return num1;
        else if
        (num2 < num1 && num2 < num3)
            return num2;
        else
            return num3;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert First Number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Insert Second Number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        System.out.println("Insert Third Number: ");
        int num3 = Integer.parseInt(reader.nextLine());
        System.out.println("The max number is: " + maxMethod(num1, num2, num3));
        System.out.println("The min number is: " + minMethod(num1, num2, num3));
    }
}
