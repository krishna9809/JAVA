import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("example.txt")) {
            fw.write("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
