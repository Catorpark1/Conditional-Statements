import java.io.File;
public class GetFileInfo {
    public static void main(String[] args) {
        String fileName = "Latest Error.docx";
        File file =new File(fileName);
        if (file.exists()) {
        System.out.println("File name" + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
            System.out.println("Last modified: " + file.lastModified());
        } else {
            System.out.println("File does not exist.");
        }
    }
}