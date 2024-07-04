import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileReadExample {
    public static void main(String[] args) {
        String fileName = "example.txt";
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(fileName);
            int data;
            while ((data = inputStream.read()) != -1) {
                // Convert the integer to a character and print it
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
