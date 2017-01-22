package core.module11.practice;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadHTML {
    public static void main(String[] args) throws IOException{
        URL url = null;
        try {
            url = new URL("http://google.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/core/module11/practice/google.txt")));
        String line;
        while ((line = reader.readLine()) != null) {
//            System.out.println(line);
            line = line.replaceAll("Google", "Yandex").replaceAll("google", "yendex");
            writer.write(line);
            writer.newLine();
        }

    }
}
