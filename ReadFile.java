import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.IOException;
public class ReadFile {
    public static void main(String[] args) {
        String fileName = "Testers.txt"; // Replace with the name of your file
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
