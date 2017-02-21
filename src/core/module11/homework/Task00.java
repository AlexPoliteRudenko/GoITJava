package core.module11.homework;

import java.io.*;

public class Task00 {
    public static void creatTestFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/core/module11/homework/test.txt"))){
            for (int i =0; i<10; i++) {
                writer.write("some text" + i);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
