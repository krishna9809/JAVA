import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        String data = "Hello, World!";
        try (
            FileOutputStream fos = new FileOutputStream("example.txt")
            ) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
