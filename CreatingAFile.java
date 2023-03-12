import java.io.File;
public class CreatingAFile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Sony\\Downloads\\Testers.txt");
        if (!f.exists())
            System.out.println("The file does not exist!");
        else
            System.out.println("Do you want to open this file? ");
    }
}