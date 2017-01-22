package core.module11.homework;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;

class Task02 {
    static void Solution() {
        String pathname = "src/core/module11/homework/test.txt";
        String var = Task01.readFileToString(pathname);
        Map<String, String> map = Task01.getMapWithReplaceParameters();
        String replaceResult = Task01.replacer(map, var);
        fileContentReplacer(pathname, replaceResult);
    }

    private static void fileContentReplacer(String pathname, String replaceResult) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathname)))){
            writer.write(replaceResult);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
