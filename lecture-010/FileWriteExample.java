import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWriteExample {
    public static void main(String[] args) {
        String fileName = "output.txt";
        OutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream(fileName);
            String content = "Hello, world!\nThis is a test.\nGoodbye!";
            byte[] contentBytes = content.getBytes();
            outputStream.write(contentBytes);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
