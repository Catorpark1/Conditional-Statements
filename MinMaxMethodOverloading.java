import java.util.Scanner;
public class MinMaxMethodOverloading {
        public static double maxMethod(double num1,double num2,double num3) {
            if (num1>num2 && num3<num1)
                return num1;
            else if
            (num2>num1 && num3<num2)
                return num2;
            else
                return num3;
        }
        public static double minMethod(double num1, double num2, double num3) {
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
           double num1 = Double.parseDouble(reader.nextLine());
            System.out.println("Insert Second Number: ");
            double num2 = Double.parseDouble(reader.nextLine());
            System.out.println("Insert Third Number: ");
            double num3 = Double.parseDouble(reader.nextLine());
            System.out.println("The max number is: " + maxMethod(num1, num2, num3));
            System.out.println("The min number is: " + minMethod(num1, num2, num3));
        }
    }

