package networkTechnology;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
public class SocketEx {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("data.pr4e.org", 80);
            PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out.print("GET /romeo.txt HTTP/1.0\r\n");
            out.print("Host: data.pr4e.org\r\n");
            out.print("\r\n");
            out.flush();

            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }

            in.close();
            out.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
