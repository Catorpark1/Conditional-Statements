import java.util.Scanner;
public class TimeTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = s.nextInt();
        int i =1;
        for(i=1; i<=12; i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }

    }
}