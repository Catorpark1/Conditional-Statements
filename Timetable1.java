import java.util.Scanner;
public class Timetable1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("What times table would you like?:");
        int Timetable1 = reader.nextInt();

        for (int i = 1; i <= 12; i++) {
        for (int j = 1; j<=12; j++) {
        System.out.print(i * j + "\t");
    }
        System.out.println();
        }
    }
}