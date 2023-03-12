import java.util.Scanner;
public class CircleCalculator {
        public static void main (String[] args) {
                Scanner reader = new Scanner(System.in);
                System.out.println("Enter the radius of the circle: ");
                double circleRadius = Double.parseDouble(reader.nextLine());
                System.out.println("The radius of the circle is: ");
                double circleDiameter = 2*circleRadius;
                System.out.println("The diameter of the circle is: " + circleDiameter + "cm");
                double circleArea = 2*3.14*circleRadius;
                System.out.println("The circumference of the circle is: " + circleArea + "cm");
                double CircleArea = 3.14*circleRadius*circleRadius;
                System.out.println("The area of the rectangle is: "+ circleArea + "cm^2");
    }
}
