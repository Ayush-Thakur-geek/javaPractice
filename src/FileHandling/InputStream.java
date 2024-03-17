package FileHandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStream {
    public static void main(String[] args) {
        try(FileReader isr = new FileReader("/home/ayush/IdeaProjects/Thakur/src/FileHandling/hello.txt")) {
            int letters = isr.read();
            while(isr.ready()) {
                System.out.print((char) letters);
                letters = isr.read();
            }
            isr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
