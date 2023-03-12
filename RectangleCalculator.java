import java.util.Scanner;
public class RectangleCalculator {
    public static void main (String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Ender the width of your rectangle: ");
            double width = Double.parseDouble(reader.nextLine());
            System.out.println("Ender the length of your rectangle: ");
            double length = Double.parseDouble(reader.nextLine());
                System.out.println("The width of the rectangle is: " + width + "cm");
                System.out.println("The length of the rectangle is: " + length + "cm");
                double perimeter = width+width+length+length;
        System.out.println("The perimeter of the Rectangle is: "+ perimeter + "cm");
        double area = width*length;
        System.out.println("The area of the rectangle is: "+ area + "cm^2");
    }
}

