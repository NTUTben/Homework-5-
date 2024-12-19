import java.io.*;
import java.net.*;

public class URLReaderExample {
    public static void main(String[] args) {
        String urlString = "https://jsonplaceholder.typicode.com/posts/1";

        try {
            URL url = new URL(urlString);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("Error fetching URL content: " + e.getMessage());
        }
    }
}
