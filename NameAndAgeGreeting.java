import java.util.Scanner;
public class NameAndAgeGreeting {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("What your name?: ");
        String name = reader.nextLine();
        //Reads a line from the user's keyboard
        System.out.println("How old are you?: ");
        int age = Integer.parseInt(reader.nextLine());
        //Reads string var from keyboard and transfers it to an integer
        System.out.println("Your name is: " + name + ", and you are" + age + "years old, nice to meet you!");

    }
}
