import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("input a number to sum to: ");
        int sumTo = reader.nextInt();
        int sum = 0, i = 1;
        while (i <= sumTo){
            sum = sum  + 1;
            i++;
        }
        System.out.println("Total sum of the number is: "+ sum);
    }
}
