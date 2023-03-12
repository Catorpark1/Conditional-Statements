import java.io.File;
import java.io.IOException;
public class CreateAFile {
    public static void main(String[] args) {
        String fileName = "Latest Error.docx";
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File Created" + file.getName());
            } else {
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            System.out.println("An error has occurred. ");
            e.printStackTrace();
        }
    }
}