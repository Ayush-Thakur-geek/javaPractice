package FileHandling;

import java.io.*;

public class BufferedReaderEx {
    public static void main(String[] args) {
//        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            System.out.println("You typed: " + br.readLine());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
        try (BufferedReader br = new BufferedReader(
                new FileReader("/home/ayush/IdeaProjects/Thakur/src/FileHandling/hello.txt"))) {

            String s = "";
            while (br.ready()) {
                s += br.readLine();
            }

            System.out.println(s);

            // Using try-with-resources to automatically close the FileWriter
            try (FileWriter fw = new FileWriter("/home/ayush/IdeaProjects/Thakur/src/FileHandling/msg.txt", true)) {
                fw.write(s);
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
