import java.io.*;
class FileHandler {
    FileHandler(String file) throws IOException {
        if (!new File(file).exists()) throw new IOException("File missing!");
    }
}
public class ques16 {
    public static void main(String[] args) {
        try {
            new FileHandler("nofile.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

