package core.module11.homework;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

class Task03 {
    static void Solution() {
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
        StringBuilder sb = new StringBuilder(Task01.readFileToString(pathname));
        sb.append(replaceResult);
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathname)))){
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
