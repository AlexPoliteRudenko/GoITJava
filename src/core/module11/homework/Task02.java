package core.module11.homework;

import java.io.*;
import java.util.Map;

class Task02 {
    static void solution() {
        String pathname = "src/core/module11/homework/test.txt";
        String var = Task01.readFileToString(pathname);
        Map<String, String> map = Task01.getMapWithReplaceParameters();
        String replaceResult = Task01.replacer(map, var);
        fileContentReplacer(pathname, replaceResult);
    }

    private static void fileContentReplacer(String pathname, String replaceResult) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathname))){
            writer.write(replaceResult);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
