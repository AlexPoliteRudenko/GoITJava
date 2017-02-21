package core.module11.homework;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

class Task03 {
    static void solution() {
        String pathname = "src/core/module11/homework/test.txt";
        String var = Task01.readFileToString(pathname);
        Map<String, String> map = getMapWithReplaceParameters();
        String replaceResult = Task01.replacer(map, var);
        fileContentMerger(pathname, replaceResult);
    }
    static Map<String, String> getMapWithReplaceParameters() {
        Map<String, String> map = new HashMap<>();
//        map.put("some", "this");
        map.put("this", "some");
//        map.put("text", "information");
        map.put("information", "text");
        return map;
    }

    static void fileContentMerger(String pathname, String replaceResult) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathname,true))){
            writer.write(replaceResult);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
