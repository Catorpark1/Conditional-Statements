import java.io.BufferedWriter;
        import java.io.FileWriter;
        import java.io.IOException;
public class WriteToFile {
    public static void main(String[] args) {
        String fileName = "Latest error.docx"; // Replace with the name of your file
        String content = "Files in Java might be tricky, but it is fun enough.";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(content);
            System.out.println("Successfully wrote the file: ");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
